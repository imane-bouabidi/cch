package models.entities;

import java.time.LocalDate;
import java.util.List;

public class Competition {
    private Long id;
    private String name;
    private LocalDate date;
    private String location;
    private Double distance;
    private List<GeneralResult> generalResults;
    private List<Season> rounds;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Double getDistance() {
        return distance;
    }

    public void setDistance(Double distance) {
        this.distance = distance;
    }

    public List<GeneralResult> getGeneralResults() {
        return generalResults;
    }

    public void setGeneralResults(List<GeneralResult> generalResults) {
        this.generalResults = generalResults;
    }

    public List<Season> getRounds() {
        return rounds;
    }

    public void setRounds(List<Season> rounds) {
        this.rounds = rounds;
    }
}