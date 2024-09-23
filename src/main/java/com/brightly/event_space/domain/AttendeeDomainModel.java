package com.brightly.event_space.domain;

import java.util.UUID;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class AttendeeDomainModel {
    private UUID id;
    private String name;
    private String email;
    private String contact;
    private String areaOfInterest;
    private String description;
    private UUID eventId;
    private String avatar;
}
