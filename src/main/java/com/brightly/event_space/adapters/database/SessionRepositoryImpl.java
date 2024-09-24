package com.brightly.event_space.adapters.database;

import com.brightly.event_space.domain.SessionDomainModel;
import com.brightly.event_space.domain.port.SessionRepository;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.function.Function;
import java.util.stream.Collectors;

@ApplicationScoped
public class SessionRepositoryImpl implements SessionRepository {

    private final SessionDatabaseRepository sessionDatabaseRepository;
    private final SpeakerDatabaseRepository speakerDatabaseRepository;

    public SessionRepositoryImpl(SessionDatabaseRepository sessionDatabaseRepository, SpeakerDatabaseRepository speakerDatabaseRepository) {
        this.sessionDatabaseRepository = sessionDatabaseRepository;
        this.speakerDatabaseRepository = speakerDatabaseRepository;
    }

    @Override
    public SessionDomainModel createSession(SessionDomainModel sessionDomainModel) {
        EventSession eventSession = SessionDataModelConverter.toEventSessionDataModel(sessionDomainModel);
        sessionDatabaseRepository.persistAndFlush(eventSession);
        return SessionDataModelConverter.toEventSessionDomainModel(eventSession);
    }

    @Override
    public List<SessionDomainModel> listEventSessions(UUID eventId) {
        List<EventSession> eventSessionList = sessionDatabaseRepository.list("eventId", eventId);
        List<UUID> speakerIds = eventSessionList.stream().map(EventSession::getSpeakerId).toList();
        Map<UUID, Speaker> speakerMap = speakerDatabaseRepository.list("id in ?1", speakerIds)
                .stream()
                .collect(Collectors.toMap(Speaker::getId, Function.identity(), (existing, updated) -> updated));
        return eventSessionList.stream()
                .map(eventSession -> SessionDataModelConverter.toEventSessionDomainModel(eventSession, speakerMap))
                .toList();
    }
}
