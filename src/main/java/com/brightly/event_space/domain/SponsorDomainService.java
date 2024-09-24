package com.brightly.event_space.domain;

import com.brightly.event_space.domain.port.SponsorRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.UUID;

@Transactional
@ApplicationScoped
public class SponsorDomainService {

    private static final Logger logger = LoggerFactory.getLogger(SponsorDomainService.class);

    @Inject
    SponsorRepository sponsorRepository;

    public SponsorDomainModel createSponsor(SponsorDomainModel sponsorDomainModel) {
        SponsorDomainModel responseSponsor = null;
        try {
            responseSponsor = sponsorRepository.createSponsor(sponsorDomainModel);
        } catch (Exception e) {
            logger.error("failure during create Sponsor, ", e);
        }
        return responseSponsor;
    }

    public List<SponsorDomainModel> getSponsorsByEventId(UUID eventId) {
        return sponsorRepository.getSponsorsByEventId(eventId);
    }
}
