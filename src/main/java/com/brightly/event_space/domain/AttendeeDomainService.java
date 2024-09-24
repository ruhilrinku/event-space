package com.brightly.event_space.domain;

import com.brightly.event_space.domain.port.AttendeeRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.UUID;

@Transactional
@ApplicationScoped
public class AttendeeDomainService {

    private static final Logger logger = LoggerFactory.getLogger(AttendeeDomainService.class);

    @Inject
    AttendeeRepository attendeeRepository;

    public AttendeeDomainModel createAttendee(AttendeeDomainModel attendeeDomainModel) {
        AttendeeDomainModel responseAttendee = null;
        try {
            responseAttendee = attendeeRepository.createAttendee(attendeeDomainModel);
        } catch (Exception e) {
            logger.error("failure during create Attendee, ", e);
        }
        return responseAttendee;
    }

    public List<AttendeeDomainModel> getAttendeeByEventId(UUID eventId) {
        return attendeeRepository.getAttendeeByEventId(eventId);
    }

}
