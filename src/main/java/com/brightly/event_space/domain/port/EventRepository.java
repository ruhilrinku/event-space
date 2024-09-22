package com.brightly.event_space.domain.port;

import com.brightly.event_space.domain.EventDomainModel;

public interface EventRepository {

    EventDomainModel createEvent(EventDomainModel eventDomainModel);
}
