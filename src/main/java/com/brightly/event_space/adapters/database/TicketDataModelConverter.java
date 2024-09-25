package com.brightly.event_space.adapters.database;

import com.brightly.event_space.domain.TicketDomainModel;

import java.time.OffsetDateTime;
import java.time.ZoneOffset;

public final class TicketDataModelConverter {

    private TicketDataModelConverter() {}

    public static Ticket toTicketDataModel(TicketDomainModel ticketDomainModel) {
        if (ticketDomainModel == null) {
            return null;
        }

        Ticket.TicketBuilder ticketBuilder = Ticket.builder();

        return ticketBuilder
                .name(ticketDomainModel.getName())
                .price(ticketDomainModel.getPrice())
                .description(ticketDomainModel.getDescription())
                .eventId(ticketDomainModel.getEventId())
                .tenantId(ticketDomainModel.getTenantId())
                .status(ticketDomainModel.getStatus())
                .createDate(OffsetDateTime.now(ZoneOffset.UTC))
                .build();
    }

    public static TicketDomainModel toTicketDomainModel(Ticket ticketDataModel) {
        if (ticketDataModel == null) {
            return null;
        }

        return TicketDomainModel.builder()
                .id(ticketDataModel.getId())
                .name(ticketDataModel.getName())
                .description(ticketDataModel.getDescription())
                .price(ticketDataModel.getPrice())
                .eventId(ticketDataModel.getEventId())
                .tenantId(ticketDataModel.getTenantId())
                .status(ticketDataModel.getStatus())
                .build();
    }
}
