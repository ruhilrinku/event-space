package com.brightly.event_space.domain;

import com.brightly.event_space.domain.port.SpeakerRepository;
import com.brightly.event_space.domain.port.TicketRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.UUID;

@Transactional
@ApplicationScoped
public class TicketDomainService {

    private static final Logger logger = LoggerFactory.getLogger(TicketDomainService.class);

    @Inject
    TicketRepository ticketRepository;

    public TicketDomainModel createTicket(TicketDomainModel ticketDomainModel) {
        TicketDomainModel responseTicket = null;
        try {
            responseTicket = ticketRepository.createTicket(ticketDomainModel);
        } catch (Exception e) {
            logger.error("failure during create Ticket, ", e);
        }
        return responseTicket;
    }

    public List<TicketDomainModel> getTicketsByEventId(UUID eventId) {
        return ticketRepository.getTicketsByEventId(eventId);
    }
}
