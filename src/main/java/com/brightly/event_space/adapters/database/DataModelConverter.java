package com.brightly.event_space.adapters.database;

import com.brightly.event_space.ObjectHelper;
import com.brightly.event_space.domain.AttendeeDomainModel;
import com.brightly.event_space.domain.Duration;
import com.brightly.event_space.domain.SessionDomainModel;
import com.brightly.event_space.domain.TicketDomainModel;

public final class DataModelConverter {

    private DataModelConverter() {}

    // Session Converter
    public static EventSession toEventSessionDataModel(SessionDomainModel domainModel) {
        if (domainModel == null) {
            return null;
        }

        return EventSession.builder()
                .id(domainModel.getId())
                .sessionType(domainModel.getSessionType())
                .title(domainModel.getTitle())
                .eventDay(domainModel.getEventDay())
                .startTime(domainModel.getStartTime())
                .description(domainModel.getDescription())
                .speaker(domainModel.getSpeaker())
                .duration(ObjectHelper.toJsonString(domainModel.getDuration()))
                .eventId(domainModel.getEventId())
                .build();
    }

    public static SessionDomainModel toEventSessionDomainModel(EventSession eventSession) {
        if (eventSession == null) {
            return null;
        }

        return SessionDomainModel.builder()
                .id(eventSession.getId())
                .sessionType(eventSession.getSessionType())
                .title(eventSession.getTitle())
                .eventDay(eventSession.getEventDay())
                .startTime(eventSession.getStartTime())
                .duration(ObjectHelper.toObject(eventSession.getDuration(), Duration.class))
                .speaker(eventSession.getSpeaker())
                .description(eventSession.getDescription())
                .eventId(eventSession.getEventId())
                .build();
    }

    // Ticket Converter
    public static Ticket toTicketDataModel(TicketDomainModel domainModel) {
        if (domainModel == null) {
            return null;
        }

        return ObjectHelper.mapToOtherObject(domainModel, Ticket.class);
    }

    public static TicketDomainModel toTicketDomainModel(Ticket ticket) {
        if (ticket == null) {
            return null;
        }

        return ObjectHelper.mapToOtherObject(ticket, TicketDomainModel.class);
    }

    // Attendee Converter
    public static Attendee toTicketDataModel(AttendeeDomainModel domainModel) {
        if (domainModel == null) {
            return null;
        }

        return ObjectHelper.mapToOtherObject(domainModel, Attendee.class);
    }

    public static AttendeeDomainModel toTicketDomainModel(Attendee attendee) {
        if (attendee == null) {
            return null;
        }

        return ObjectHelper.mapToOtherObject(attendee, AttendeeDomainModel.class);
    }
}
