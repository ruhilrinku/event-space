package com.brightly.event_space.adapters.database;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.util.UUID;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.annotations.UuidGenerator;
import org.hibernate.type.SqlTypes;

@Entity
@Table(name = "session")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class EventSession {
    @Id
    @UuidGenerator
    @Column(name = "id")
    private UUID id;
    private String sessionType;
    private String title;
    private String eventDay;
    private String startTime;
    @JdbcTypeCode(SqlTypes.JSON)
    private String duration;
    private String description;
    private String speaker;
    private UUID eventId;
}
