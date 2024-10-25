package services;

import models.dto.CompetitionDTO;
import models.entities.Competition;

import java.util.List;

public interface CompetitionService {
    CompetitionDTO createCompetition(CompetitionDTO competition);
    CompetitionDTO updateCompetition(Long id, CompetitionDTO competition);
    void deleteCompetition(Long id);
    CompetitionDTO getCompetitionById(Long id);
    List<CompetitionDTO> getAllCompetitions();
}
