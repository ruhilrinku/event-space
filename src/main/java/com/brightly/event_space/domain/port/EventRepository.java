package com.brightly.event_space.domain.port;

import com.brightly.event_space.domain.EventDomainModel;

import java.util.List;
import java.util.UUID;

public interface EventRepository {

    EventDomainModel createEvent(EventDomainModel eventDomainModel);

    List<EventDomainModel> getEventList(String TenantId);

    EventDomainModel getEventById(UUID eventId);

    EventDomainModel updateEvent(EventDomainModel eventDomainModel);
}
