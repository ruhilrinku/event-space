package com.brightly.event_space.domain.port;

import com.brightly.event_space.domain.SessionDomainModel;

public interface SessionRepository {
    SessionDomainModel createSession(SessionDomainModel sessionDomainModel);
}
