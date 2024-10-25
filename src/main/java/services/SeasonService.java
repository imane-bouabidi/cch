package services;


import models.dto.SeasonDTO;

import java.util.List;

public interface SeasonService {
    SeasonDTO createRound(SeasonDTO seasonDTO);
    SeasonDTO updateRound(Long id, SeasonDTO seasonDTO);
    void deleteRound(Long id);
    List<SeasonDTO> getRounds();
}
