package com.brightly.event_space.domain;

import lombok.*;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.UUID;

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
}
