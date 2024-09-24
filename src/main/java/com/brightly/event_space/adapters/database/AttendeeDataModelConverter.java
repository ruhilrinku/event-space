package com.brightly.event_space.adapters.database;

import com.brightly.event_space.domain.AttendeeDomainModel;

import java.time.OffsetDateTime;
import java.time.ZoneOffset;

public final class AttendeeDataModelConverter {

    private AttendeeDataModelConverter() {}

    public static Attendee toAttendeeDataModel(AttendeeDomainModel attendeeDomainModel) {
        if (attendeeDomainModel == null) {
            return null;
        }

        Attendee.AttendeeBuilder attendeeBuilder = Attendee.builder();

        return attendeeBuilder
                .name(attendeeDomainModel.getName())
                .email(attendeeDomainModel.getEmail())
                .description(attendeeDomainModel.getDescription())
                .eventId(attendeeDomainModel.getEventId())
                .tenantId(attendeeDomainModel.getTenantId())
                .areaOfInterest(attendeeDomainModel.getAreaOfInterest())
                .avatar(attendeeDomainModel.getAvatar())
                .contact(attendeeDomainModel.getContact())
                .createDate(OffsetDateTime.now(ZoneOffset.UTC))
                .build();
    }

    public static AttendeeDomainModel toAttendeeDomainModel(Attendee attendeeDataModel) {
        if (attendeeDataModel == null) {
            return null;
        }

        return AttendeeDomainModel.builder()
                .id(attendeeDataModel.getId())
                .name(attendeeDataModel.getName())
                .description(attendeeDataModel.getDescription())
                .eventId(attendeeDataModel.getEventId())
                .areaOfInterest(attendeeDataModel.getAreaOfInterest())
                .avatar(attendeeDataModel.getAvatar())
                .email(attendeeDataModel.getEmail())
                .contact(attendeeDataModel.getContact())
                .tenantId(attendeeDataModel.getTenantId())
                .build();
    }
}
