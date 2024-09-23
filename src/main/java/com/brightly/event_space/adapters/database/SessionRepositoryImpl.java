package com.brightly.event_space.adapters.database;

import com.brightly.event_space.domain.SessionDomainModel;
import com.brightly.event_space.domain.port.SessionRepository;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.List;
import java.util.UUID;

@ApplicationScoped
public class SessionRepositoryImpl implements SessionRepository {

    private final SessionDatabaseRepository sessionDatabaseRepository;

    public SessionRepositoryImpl(SessionDatabaseRepository sessionDatabaseRepository) {
        this.sessionDatabaseRepository = sessionDatabaseRepository;
    }

    @Override
    public SessionDomainModel createSession(SessionDomainModel sessionDomainModel) {
        EventSession eventSession = SessionDataModelConverter.toDataModel(sessionDomainModel);
        sessionDatabaseRepository.persistAndFlush(eventSession);
        return SessionDataModelConverter.toDomainModel(eventSession);
    }

    @Override
    public List<SessionDomainModel> listEventSessions(UUID eventId) {
        try (var sessionStream = sessionDatabaseRepository.find("eventId", eventId).stream()) {
            return sessionStream.map(SessionDataModelConverter::toDomainModel)
                    .toList();
        }
    }
}
