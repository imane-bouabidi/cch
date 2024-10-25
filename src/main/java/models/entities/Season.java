package models.entities;

import jakarta.persistence.CascadeType;
import jakarta.persistence.FetchType;
import jakarta.persistence.OneToMany;
import models.entities.embeddables.RoundResultId;

import java.time.LocalDate;
import java.util.List;
//Round
public class Season {
    private RoundResultId id;
    private String name;
    private LocalDate startDate;
    private LocalDate endDate;
    private Competition competitions;
    @OneToMany(mappedBy = "season", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Result> results;

    public RoundResultId getId() {
        return id;
    }

    public void setId(RoundResultId id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public Competition getCompetitions() {
        return competitions;
    }

    public void setCompetitions(Competition competitions) {
        this.competitions = competitions;
    }
}