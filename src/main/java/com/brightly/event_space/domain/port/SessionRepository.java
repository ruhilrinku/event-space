package com.brightly.event_space.domain.port;

import com.brightly.event_space.domain.SessionDomainModel;
import java.util.List;
import java.util.UUID;

public interface SessionRepository {
    SessionDomainModel createSession(SessionDomainModel sessionDomainModel);

    List<SessionDomainModel> listEventSessions(UUID eventId);
}
