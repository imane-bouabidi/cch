package models.entities.embeddables;

import jakarta.persistence.Embeddable;

@Embeddable
public record RoundResultId(Long riderId, Long roundId) {
}