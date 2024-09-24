package com.brightly.event_space.adapters.database;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.id.UUIDGenerator;

import java.io.Serializable;
import java.time.OffsetDateTime;
import java.util.UUID;

@Entity
@Table(name = "sponsor", uniqueConstraints = {@UniqueConstraint(name = "UniqueSponsorNameAndTenant",
        columnNames = {"tenantId", "name"})})
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Sponsor implements Serializable {

    @Id
    @GeneratedValue(generator = "uuid-generator", strategy = GenerationType.IDENTITY)
    @GenericGenerator(name = "uuid-generator", type = UUIDGenerator.class)
    @Column(name = "id", nullable = false)
    private UUID id;

    private String name;
    private String category;
    private String websiteLink;
    private String description;
    private String logo;
    private UUID eventId;
    private OffsetDateTime createDate;
    private OffsetDateTime updatedDate;
    private String tenantId;

    @Version
    private long version;
}
