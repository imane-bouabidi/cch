package com.wora.services;

import com.wora.models.dto.ResultDTO;
import com.wora.models.entities.embeddables.RoundResultId;

import java.util.List;

public interface ResultService {
    ResultDTO createResult(ResultDTO Result);
    ResultDTO updateResult(RoundResultId id, ResultDTO resultDTO);
    void deleteResult(RoundResultId id);
    ResultDTO getResultById(RoundResultId id);
    List<ResultDTO> getAllResults();
}
