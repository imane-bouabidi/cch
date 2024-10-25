package models.entities;

import jakarta.persistence.*;
import models.entities.embeddables.RoundResultId;

import java.time.LocalDate;
import java.util.List;
//Round

@Entity
@Table(name = "round")
public class Season {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private RoundResultId id;
    private String name;
    private LocalDate startDate;
    private LocalDate endDate;
    @ManyToOne
    private Competition competition;
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

    public Competition getCompetition() {
        return competition;
    }

    public void setCompetition(Competition competition) {
        this.competition = competition;
    }

    public List<Result> getResults() {
        return results;
    }

    public void setResults(List<Result> results) {
        this.results = results;
    }
}