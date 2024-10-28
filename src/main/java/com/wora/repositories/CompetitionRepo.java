package com.wora.repositories;


import com.wora.models.entities.Competition;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompetitionRepo extends JpaRepository<Competition, Long> {
//    List<Competition> findByLocation(String location);
//    List<Competition> findByStartDateBetween(LocalDate startDate, LocalDate endDate);
}
