package com.brightly.event_space.domain;

import java.util.UUID;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class TicketDomainModel {
    private UUID id;
    private String name;
    private String description;
    private Double price;
    private UUID eventId;
    private String status;
}
