package com.brightly.event_space.adapters.rest.models;

import java.util.UUID;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class TicketSaleResponse {
    private UUID eventId;
    private Long ticketCount;
}
