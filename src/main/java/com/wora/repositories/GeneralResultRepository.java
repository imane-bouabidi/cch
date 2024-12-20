package com.wora.repositories;

import com.wora.models.entities.GeneralResult;
import com.wora.models.entities.Result;
import com.wora.models.entities.embeddables.GeneralResultId;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface GeneralResultRepository extends JpaRepository<GeneralResult, GeneralResultId> {
//    List<Result> findByIdCompetitionId(Long competitionId);
//    List<Result> findByIdCyclistId(Long cyclistId);
}
