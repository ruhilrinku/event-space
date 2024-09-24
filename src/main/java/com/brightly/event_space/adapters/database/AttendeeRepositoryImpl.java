package com.brightly.event_space.adapters.database;

import com.brightly.event_space.domain.AttendeeDomainModel;
import com.brightly.event_space.domain.port.AttendeeRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

import java.util.List;
import java.util.UUID;

@ApplicationScoped
public class AttendeeRepositoryImpl implements AttendeeRepository {

    @Inject
    AttendeeDatabaseRepository attendeeDatabaseRepository;

    @Override
    public AttendeeDomainModel createAttendee(AttendeeDomainModel attendeeDomainModel) {
        Attendee attendee = AttendeeDataModelConverter.toAttendeeDataModel(attendeeDomainModel);

        attendeeDatabaseRepository.persistAndFlush(attendee);

        return AttendeeDataModelConverter.toAttendeeDomainModel(attendee);
    }

    @Override
    public List<AttendeeDomainModel> getAttendeeByEventId(UUID eventId) {
        return attendeeDatabaseRepository.list("eventId = ?1", eventId)
                .stream()
                .map(AttendeeDataModelConverter::toAttendeeDomainModel)
                .toList();
    }
}