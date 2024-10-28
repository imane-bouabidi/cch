package com.wora.repositories;

import com.wora.models.entities.Season;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface SeasonRepo extends JpaRepository<Season, Long> {
//    List<Season> findByName(String name);
//    List<Season> findByStartDateBetween(LocalDate startDate, LocalDate endDate);
//    List<Season> findAllByOrderByStartDateAsc();
}
