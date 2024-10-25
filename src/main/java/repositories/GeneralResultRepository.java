package repositories;

import models.entities.GeneralResult;
import models.entities.Result;
import models.entities.embeddables.GeneralResultId;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface GeneralResultRepository extends JpaRepository<GeneralResult, GeneralResultId> {
    List<Result> findByIdCompetitionId(Long competitionId);
    List<Result> findByIdCyclistId(Long cyclistId);
}
