package com.wora.models.entities.embeddables;

import jakarta.persistence.Embeddable;

import java.io.Serializable;

@Embeddable
public class GeneralResultId implements Serializable {
    private Long  riderId;
    private Long competitionId;

    public Long getRiderId() {
        return riderId;
    }

    public void setRiderId(Long riderId) {
        this.riderId = riderId;
    }

    public Long getCompetitionId() {
        return competitionId;
    }

    public void setCompetitionId(Long competitionId) {
        this.competitionId = competitionId;
    }
}