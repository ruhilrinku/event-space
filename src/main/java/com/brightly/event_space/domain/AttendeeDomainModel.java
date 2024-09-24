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
public class AttendeeDomainModel {

    private UUID id;
    private String name;
    private String email;
    private String contact;
    private String areaOfInterest;
    private String description;
    private UUID eventId;
    private String avatar;

    private String tenantId;
}
