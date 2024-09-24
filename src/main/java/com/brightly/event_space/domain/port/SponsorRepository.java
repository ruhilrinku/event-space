package com.brightly.event_space.domain.port;

import com.brightly.event_space.domain.AttendeeDomainModel;
import com.brightly.event_space.domain.SponsorDomainModel;

import java.util.List;
import java.util.UUID;

public interface SponsorRepository {

    SponsorDomainModel createSponsor(SponsorDomainModel sponsorDomainModel);

    List<SponsorDomainModel> getSponsorsByEventId(UUID eventId);
}
