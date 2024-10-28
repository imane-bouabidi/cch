package com.wora.services;

import com.wora.models.dto.GeneralResultDTO;
import com.wora.models.entities.embeddables.GeneralResultId;

import java.util.List;

public interface GeneralResultService {
    GeneralResultDTO createGeneralResult(GeneralResultDTO generalResultDTO);
    GeneralResultDTO updateGeneralResult(GeneralResultId id, GeneralResultDTO generalResultDTO);
    void deleteGeneralResult(GeneralResultId id);
    List<GeneralResultDTO> getGeneralResults();
}

