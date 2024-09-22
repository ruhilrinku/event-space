package com.brightly.event_space.adapters.database;

import com.brightly.event_space.domain.EventDomainModel;
import com.brightly.event_space.domain.port.EventRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

import java.time.OffsetDateTime;
import java.time.ZoneOffset;

@ApplicationScoped
public class EventRepositoryImpl implements EventRepository {

    @Inject
    EventDatabaseRepository eventDatabaseRepository;
    @Override
    public EventDomainModel createEvent(EventDomainModel eventDomainModel) {
        Event event = EventDataModelConverter.toEventDataModel(eventDomainModel);
        event.setCreateDate(OffsetDateTime.now(ZoneOffset.UTC));

        eventDatabaseRepository.persistAndFlush(event);

        return EventDataModelConverter.toEventDomainModel(event);
    }
}