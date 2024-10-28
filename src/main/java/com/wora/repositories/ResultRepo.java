package com.wora.repositories;

import com.wora.models.entities.Result;
import com.wora.models.entities.embeddables.RoundResultId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface ResultRepo extends JpaRepository<Result, RoundResultId> {
//    List<Result> findByPhaseId(Long phaseId);
//    List<Result> findByCyclistId(Long cyclistId);
}