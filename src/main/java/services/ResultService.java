package services;

import models.dto.CompetitionDTO;
import models.dto.ResultDTO;
import models.entities.Competition;
import models.entities.Result;
import models.entities.embeddables.RoundResultId;

import java.util.List;

public interface ResultService {
    ResultDTO createResult(ResultDTO Result);
    ResultDTO updateResult(RoundResultId id, ResultDTO resultDTO);
    void deleteResult(RoundResultId id);
    ResultDTO getResultById(RoundResultId id);
    List<ResultDTO> getAllResults();
}
