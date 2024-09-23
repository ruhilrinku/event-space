package com.brightly.event_space.domain;

import com.brightly.event_space.domain.port.EventRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.UUID;

@Transactional
@ApplicationScoped
public class EventDomainService {

    private static final Logger logger = LoggerFactory.getLogger(EventDomainService.class);

    @Inject
    EventRepository eventRepository;
    public EventDomainModel createEvent(EventDomainModel eventDomainModel) {
        EventDomainModel responseEvent = null;
        try {
            responseEvent = eventRepository.createEvent(eventDomainModel);
        } catch (Exception e) {
            logger.error("failure during create event, ", e);
        }
        return responseEvent;
    }

    public List<EventDomainModel> getEventList(String TenantId) {
        return eventRepository.getEventList(TenantId);
    }

    public EventDomainModel getEventById(UUID eventId) {
        return eventRepository.getEventById(eventId);
    }

}
