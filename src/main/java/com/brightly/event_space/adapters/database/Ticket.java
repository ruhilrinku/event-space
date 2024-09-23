package com.brightly.event_space.adapters.database;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.id.UUIDGenerator;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.OffsetDateTime;
import java.util.UUID;

@Entity
@Table(name = "ticket")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Ticket implements Serializable {

    @Id
    @GeneratedValue(generator = "uuid-generator", strategy = GenerationType.IDENTITY)
    @GenericGenerator(name = "uuid-generator", type = UUIDGenerator.class)
    @Column(name = "id", nullable = false)
    private UUID id;

    private String name;
    private String description;
    private Double price;
    private UUID eventId;
    private OffsetDateTime createDate;
    private OffsetDateTime updatedDate;
    private String tenantId;
    private String status;

    @Version
    private long version;
}
