package com.brightly.event_space.adapters.database;

import com.brightly.event_space.domain.EventDomainModel;
import io.quarkus.runtime.util.StringUtil;

public final class EventDataModelConverter {

    private EventDataModelConverter() {}

    public static Event toEventDataModel(EventDomainModel eventDomainModel) {
        if (eventDomainModel == null) {
            return null;
        }

        Event.EventBuilder eventBuilder = Event.builder();

        return eventBuilder
                .name(eventDomainModel.getName())
                .description(eventDomainModel.getDescription())
                .type(eventDomainModel.getType())
                .summary(eventDomainModel.getSummary())
                .location(eventDomainModel.getLocation())
                .startDate(eventDomainModel.getStartDate())
                .endDate(eventDomainModel.getEndDate())
                .startTime(eventDomainModel.getStartTime())
                .endTime(eventDomainModel.getEndTime())
                .tenantId(eventDomainModel.getTenantId())
                .status(StringUtil.isNullOrEmpty(eventDomainModel.getStatus()) ? "DRAFT" : eventDomainModel.getStatus())
                .build();
    }

    public static EventDomainModel toEventDomainModel(Event eventDataModel) {
        if (eventDataModel == null) {
            return null;
        }


        return EventDomainModel.builder()
                .id(eventDataModel.getId())
                .name(eventDataModel.getName())
                .description(eventDataModel.getDescription())
                .type(eventDataModel.getType())
                .summary(eventDataModel.getSummary())
                .location(eventDataModel.getLocation())
                .startDate(eventDataModel.getStartDate())
                .endDate(eventDataModel.getEndDate())
                .startTime(eventDataModel.getStartTime())
                .endTime(eventDataModel.getEndTime())
                .tenantId(eventDataModel.getTenantId())
                .status(eventDataModel.getStatus())
                .build();
    }
}
