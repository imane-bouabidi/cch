package services.Imlp;

import models.dto.ResultDTO;
import models.dto.SeasonDTO;
import models.entities.Result;
import models.entities.Season;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repositories.SeasonRepo;
import services.SeasonService;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class SeasonServiceImpl implements SeasonService {
    @Autowired
    private SeasonRepo roundRepo;

    @Autowired
    private ModelMapper modelMapper;

    public SeasonDTO createRound(SeasonDTO roundDTO){
        Season round = modelMapper.map(roundDTO, Season.class);
        round = roundRepo.save(round);
        return modelMapper.map(round, SeasonDTO.class);
    }
    public SeasonDTO updateRound(Long id, SeasonDTO roundDTO){
        Season round = roundRepo.findById(id).orElseThrow(() -> new IllegalArgumentException("Season not found"));
        modelMapper.map(roundDTO, round);
        Season savedSeason = roundRepo.save(round);
        return modelMapper.map(savedSeason, SeasonDTO.class);
    }
    public void deleteRound(Long id){
        Season round = roundRepo.findById(id).orElseThrow(()->new IllegalArgumentException("Season not found"));
        roundRepo.delete(round);
    }
    public List<SeasonDTO> getRounds(){
        List<Season> rounds = roundRepo.findAll();
        return rounds.stream()
                .map(round -> modelMapper.map(round,SeasonDTO.class)).collect(Collectors.toList());

    }
}
