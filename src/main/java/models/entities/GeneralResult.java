package models.entities;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapKey;
import jakarta.validation.constraints.NotNull;
import models.entities.embeddables.GeneralResultId;

import java.time.Duration;

public class GeneralResult {

    @EmbeddedId
    private GeneralResultId id;

    @NotNull
    @Column(name = "general_time")
    private Duration generalTime;

    @NotNull
    @Column(name = "range")
    private Integer range;

    @ManyToOne
    @MapKey
    private Competition competition;

    @ManyToOne
    @MapKey
    private Rider rider;

    public GeneralResultId getId() {
        return id;
    }

    public void setId(GeneralResultId id) {
        this.id = id;
    }

    public void setGeneralTime(@NotNull Duration generalTime) {
        this.generalTime = generalTime;
    }

    public void setRange(@NotNull Integer range) {
        this.range = range;
    }

    public void setCompetition(Competition competition) {
        this.competition = competition;
    }

    public void setRider(Rider rider) {
        this.rider = rider;
    }

    public @NotNull Duration getGeneralTime() {
        return generalTime;
    }

    public @NotNull Integer getRange() {
        return range;
    }

    public Competition getCompetition() {
        return competition;
    }

    public Rider getRider() {
        return rider;
    }
}
