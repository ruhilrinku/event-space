package com.brightly.event_space.adapters.database;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Version;
import java.io.Serializable;
import java.time.OffsetDateTime;
import java.util.UUID;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.UuidGenerator;

@Entity
@Table(name = "attendee")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Attendee implements Serializable {

    @Id
    @UuidGenerator
    @Column(name = "id", nullable = false)
    private UUID id;

    private String name;
    private String email;
    private String contact;
    private String areaOfInterest;
    private String description;
    private UUID eventId;
    private OffsetDateTime createDate;
    private OffsetDateTime updatedDate;
    private String tenantId;
    private String avatar;

    @Version
    private long version;
}
