package models.entities;

import jakarta.persistence.*;
import models.entities.embeddables.RoundResultId;

import java.util.List;

@Entity
@Table(name = "result")
public class Result {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private RoundResultId id;
    @ManyToOne
    private Rider rider;
    @ManyToOne
    private Season season;
    private Long time;

    public RoundResultId getId() {
        return id;
    }

    public void setId(RoundResultId id) {
        this.id = id;
    }

    public Rider getRider() {
        return rider;
    }

    public void setRider(Rider rider) {
        this.rider = rider;
    }

    public Season getSeason() {
        return season;
    }

    public void setSeason(Season season) {
        this.season = season;
    }

    public Long getTime() {
        return time;
    }

    public void setTime(Long time) {
        this.time = time;
    }
}