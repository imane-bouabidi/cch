package services;

import models.dto.GeneralResultDTO;
import models.entities.GeneralResult;
import models.entities.embeddables.GeneralResultId;

import java.util.List;

public interface GeneralResultService {
    GeneralResultDTO createGeneralResult(GeneralResultDTO generalResultDTO);
    GeneralResultDTO updateGeneralResult(GeneralResultId id, GeneralResultDTO generalResultDTO);
    void deleteGeneralResult(GeneralResultId id);
    List<GeneralResultDTO> getGeneralResults();
}

