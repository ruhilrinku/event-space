package com.brightly.event_space.adapters.database;

import com.brightly.event_space.domain.TicketDomainModel;
import com.brightly.event_space.domain.port.TicketRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

import java.util.List;
import java.util.UUID;

@ApplicationScoped
public class TicketRepositoryImpl implements TicketRepository {

    @Inject
    TicketDatabaseRepository ticketDatabaseRepository;

    @Override
    public TicketDomainModel createTicket(TicketDomainModel ticketDomainModel) {
        Ticket ticket = TicketDataModelConverter.toTicketDataModel(ticketDomainModel);

        ticketDatabaseRepository.persistAndFlush(ticket);

        return TicketDataModelConverter.toTicketDomainModel(ticket);
    }

    @Override
    public List<TicketDomainModel> getTicketsByEventId(UUID eventId) {
        return ticketDatabaseRepository.list("eventId = ?1", eventId)
                .stream()
                .map(TicketDataModelConverter::toTicketDomainModel)
                .toList();
    }
}