package com.brightly.event_space.domain.port;

import com.brightly.event_space.domain.AttendeeDomainModel;

import java.util.List;
import java.util.UUID;

public interface AttendeeRepository {

    AttendeeDomainModel createAttendee(AttendeeDomainModel attendeeDomainModel);

    List<AttendeeDomainModel> getAttendeeByEventId(UUID eventId);
}
