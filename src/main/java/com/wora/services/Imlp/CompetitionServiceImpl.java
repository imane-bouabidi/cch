package com.wora.services.Imlp;

import com.wora.models.dto.CompetitionDTO;
import com.wora.models.entities.Competition;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.wora.repositories.CompetitionRepo;
import com.wora.services.CompetitionService;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CompetitionServiceImpl implements CompetitionService {

    @Autowired
    private CompetitionRepo competitionRepo;
    @Autowired
    private ModelMapper modelMapper;

    public CompetitionDTO createCompetition(CompetitionDTO competitionDTO){
        Competition competition = modelMapper.map(competitionDTO, Competition.class);
        competition =  competitionRepo.save(competition);
        return modelMapper.map(competition, CompetitionDTO.class);
    }

    public CompetitionDTO updateCompetition(Long id, CompetitionDTO competitionDTO) {
        Competition competition = competitionRepo.findById(id).orElseThrow(() -> new IllegalArgumentException("Competition not found"));
        modelMapper.map(competitionDTO, competition);
        Competition savedCompetition = competitionRepo.save(competition);
        return modelMapper.map(savedCompetition,CompetitionDTO.class);
    }
    public void deleteCompetition(Long id) {
        Competition competition =  competitionRepo.findById(id).orElseThrow(()->new IllegalArgumentException("Competition not found"));
        competitionRepo.delete(competition);
    }
    public CompetitionDTO getCompetitionById(Long id) {
        Competition competition =  competitionRepo.findById(id).orElseThrow(()->new IllegalArgumentException("Competition not found"));
        return modelMapper.map(competition, CompetitionDTO.class);
    }
    public List<CompetitionDTO> getAllCompetitions() {
        List<Competition> competitions = competitionRepo.findAll();
        return competitions.stream()
                .map(competition -> modelMapper.map(competition,CompetitionDTO.class)).collect(Collectors.toList());
    }
}
