package com.brightly.event_space.adapters.database;

import com.brightly.event_space.domain.SponsorDomainModel;
import com.brightly.event_space.domain.port.SponsorRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

import java.util.List;
import java.util.UUID;

@ApplicationScoped
public class SponsorRepositoryImpl implements SponsorRepository {

    @Inject
    SponsorDatabaseRepository sponsorDatabaseRepository;

    @Override
    public SponsorDomainModel createSponsor(SponsorDomainModel sponsorDomainModel) {
        Sponsor sponsor = SponsorDataModelConverter.toSponsorDataModel(sponsorDomainModel);

        sponsorDatabaseRepository.persistAndFlush(sponsor);

        return SponsorDataModelConverter.toSponsorDomainModel(sponsor);
    }

    @Override
    public List<SponsorDomainModel> getSponsorsByEventId(UUID eventId) {
        return sponsorDatabaseRepository.list("eventId = ?1", eventId)
                .stream()
                .map(SponsorDataModelConverter::toSponsorDomainModel)
                .toList();
    }
}