package com.brightly.event_space.domain;

import com.brightly.event_space.domain.port.SessionRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.transaction.Transactional;
import java.util.List;
import java.util.UUID;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Transactional
@ApplicationScoped
public class SessionDomainService {
    private final SessionRepository sessionRepository;

    public SessionDomainService(SessionRepository sessionRepository) {
        this.sessionRepository = sessionRepository;
    }

    public String createSession(SessionDomainModel sessionDomainModel) {
        sessionDomainModel = sessionRepository.createSession(sessionDomainModel);
        return String.valueOf(sessionDomainModel.getId());
    }

    public List<SessionDomainModel> getSessions(UUID eventId) {
        return sessionRepository.listEventSessions(eventId);
    }
}
