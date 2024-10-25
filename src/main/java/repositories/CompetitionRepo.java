package repositories;


import models.entities.Competition;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

public interface CompetitionRepo extends JpaRepository<Competition, Long> {
    List<Competition> findByLocation(String location);
    List<Competition> findByStartDateBetween(LocalDate startDate, LocalDate endDate);
}
