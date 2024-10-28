package com.wora.services;

import com.wora.models.dto.CompetitionDTO;

import java.util.List;

public interface CompetitionService {
    CompetitionDTO createCompetition(CompetitionDTO competition);
    CompetitionDTO updateCompetition(Long id, CompetitionDTO competition);
    void deleteCompetition(Long id);
    CompetitionDTO getCompetitionById(Long id);
    List<CompetitionDTO> getAllCompetitions();
}
