package com.brightly.event_space.adapters.database;

import com.brightly.event_space.domain.SponsorDomainModel;

import java.time.OffsetDateTime;
import java.time.ZoneOffset;

public final class SponsorDataModelConverter {

    private SponsorDataModelConverter() {}

    public static Sponsor toSponsorDataModel(SponsorDomainModel sponsorDomainModel) {
        if (sponsorDomainModel == null) {
            return null;
        }

        Sponsor.SponsorBuilder sponsorBuilder = Sponsor.builder();

        return sponsorBuilder
                .name(sponsorDomainModel.getName())
                .category(sponsorDomainModel.getCategory())
                .logo(sponsorDomainModel.getLogo())
                .websiteLink(sponsorDomainModel.getWebsiteLink())
                .description(sponsorDomainModel.getDescription())
                .eventId(sponsorDomainModel.getEventId())
                .tenantId(sponsorDomainModel.getTenantId())
                .createDate(OffsetDateTime.now(ZoneOffset.UTC))
                .build();
    }

    public static SponsorDomainModel toSponsorDomainModel(Sponsor sponsorDataModel) {
        if (sponsorDataModel == null) {
            return null;
        }

        return SponsorDomainModel.builder()
                .id(sponsorDataModel.getId())
                .name(sponsorDataModel.getName())
                .description(sponsorDataModel.getDescription())
                .category(sponsorDataModel.getCategory())
                .logo(sponsorDataModel.getLogo())
                .websiteLink(sponsorDataModel.getWebsiteLink())
                .eventId(sponsorDataModel.getEventId())
                .tenantId(sponsorDataModel.getTenantId())
                .build();
    }
}
