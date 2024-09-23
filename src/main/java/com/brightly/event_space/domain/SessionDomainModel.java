package com.brightly.event_space.domain;

import java.util.UUID;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class SessionDomainModel {
    private UUID id;
    private String sessionType;
    private String title;
    private String eventDay;
    private String startTime;
    private String description;
    private String speaker;
    private Duration duration;
    private UUID eventId;
}
