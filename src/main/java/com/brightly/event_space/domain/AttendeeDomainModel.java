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
