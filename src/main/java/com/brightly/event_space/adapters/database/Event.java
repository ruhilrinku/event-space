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
@Table(name = "event")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Event implements Serializable {

    @Id
    @GeneratedValue(generator = "uuid-generator", strategy = GenerationType.IDENTITY)
    @GenericGenerator(name = "uuid-generator", type = UUIDGenerator.class)
    @Column(name = "id", nullable = false)
    private UUID id;

    private String name;
    private String description;
    private String type;
    private String summary;
    private String location;
    private LocalDate startDate;
    private LocalDate endDate;
    private LocalTime startTime;
    private LocalTime endTime;
    private OffsetDateTime createDate;
    private OffsetDateTime updatedDate;

    @Version
    private long version;
}
