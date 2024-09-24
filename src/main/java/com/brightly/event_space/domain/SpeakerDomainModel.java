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
public class SpeakerDomainModel {

    private UUID id;
    private String name;
    private String email;
    private String link;
    private String avatar;
    private String description;
    private UUID eventId;

    private String tenantId;
}
