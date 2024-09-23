package com.brightly.event_space.adapters.database;

import com.brightly.event_space.ObjectHelper;
import com.brightly.event_space.domain.Duration;
import com.brightly.event_space.domain.SessionDomainModel;

public final class SessionDataModelConverter {

    private SessionDataModelConverter() {}

    public static EventSession toDataModel(SessionDomainModel domainModel) {
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

    public static SessionDomainModel toDomainModel(EventSession eventSession) {
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
}
