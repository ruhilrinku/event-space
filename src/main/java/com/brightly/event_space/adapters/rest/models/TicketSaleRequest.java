package com.brightly.event_space.adapters.rest.models;

import lombok.Builder;
import lombok.Data;

import java.util.UUID;

@Data
@Builder
public class TicketSaleRequest {
    private UUID eventId;
    private String email;
}
