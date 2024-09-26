package com.brightly.event_space.adapters.database;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
import jakarta.persistence.Table;
import jakarta.persistence.Version;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
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
    //@JdbcTypeCode(SqlTypes.JSON)
    private String duration;
    private String description;
    private UUID speakerId;
    private UUID eventId;
    private String tenantId;

    private OffsetDateTime createDate;
    private OffsetDateTime updatedDate;
    @Version
    private long version;

    @PrePersist
    public void onCreate() {
        createDate = OffsetDateTime.now(ZoneOffset.UTC);
    }

    @PreUpdate
    public void onUpdate() {
        updatedDate = OffsetDateTime.now(ZoneOffset.UTC);
    }
}
