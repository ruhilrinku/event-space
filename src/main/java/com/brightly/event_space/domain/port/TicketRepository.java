package com.brightly.event_space.domain.port;

import com.brightly.event_space.domain.TicketDomainModel;

import java.util.List;
import java.util.UUID;

public interface TicketRepository {

    TicketDomainModel createTicket(TicketDomainModel ticketDomainModel);

    List<TicketDomainModel> getTicketsByEventId(UUID eventId);
}
