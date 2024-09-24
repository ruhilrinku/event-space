package com.brightly.event_space.domain;

import lombok.*;

import java.util.UUID;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SponsorDomainModel {

    private UUID id;
    private String name;
    private String category;
    private String websiteLink;
    private String logo;
    private String description;
    private UUID eventId;

    private String tenantId;
}
