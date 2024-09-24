package com.brightly.event_space.domain;

import java.util.UUID;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TicketDomainModel {

    private UUID id;
    private String name;
    private String description;
    private Double price;
    private UUID eventId;
    private String tenantId;
    private String status;
}
