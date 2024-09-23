package com.brightly.event_space.adapters.database;

import com.brightly.event_space.domain.EventDomainModel;
import com.brightly.event_space.domain.port.EventRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.List;
import java.util.UUID;

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

    @Override
    public List<EventDomainModel> getEventList(String tenantId) {
        return eventDatabaseRepository.list("tenantId", tenantId)
                .stream()
                .map(EventDataModelConverter::toEventDomainModel)
                .toList();
    }

    @Override
    public EventDomainModel getEventById(UUID eventId) {
         Event event = eventDatabaseRepository.find("id = ?1", eventId).firstResult();

         return EventDataModelConverter.toEventDomainModel(event);
    }
}