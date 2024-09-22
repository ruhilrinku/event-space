package com.brightly.event_space.adapters.database;

import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;
import jakarta.enterprise.context.ApplicationScoped;

import java.util.UUID;

@ApplicationScoped
public class EventDatabaseRepository implements PanacheRepositoryBase<Event, UUID> {
}
