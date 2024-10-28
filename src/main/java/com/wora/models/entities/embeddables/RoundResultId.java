package com.wora.models.entities.embeddables;

import jakarta.persistence.Embeddable;

import java.io.Serializable;

@Embeddable
public class RoundResultId  implements Serializable{
    private Long riderId;
    private Long roundId;

    public Long getRiderId() {
        return riderId;
    }

    public void setRiderId(Long riderId) {
        this.riderId = riderId;
    }

    public Long getRoundId() {
        return roundId;
    }

    public void setRoundId(Long roundId) {
        this.roundId = roundId;
    }
}