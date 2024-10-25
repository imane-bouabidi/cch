package services.Imlp;

import jakarta.ws.rs.NotFoundException;
import models.dto.GeneralResultDTO;
import models.entities.GeneralResult;
import models.entities.embeddables.GeneralResultId;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repositories.GeneralResultRepository;
import services.GeneralResultService;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class GeneralResultServiceImpl implements GeneralResultService {

    @Autowired
    private GeneralResultRepository generalResultRepo;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public GeneralResultDTO createGeneralResult(GeneralResultDTO generalResultDTO){
        GeneralResult generalResult = modelMapper.map(generalResultDTO, GeneralResult.class);
        generalResult = generalResultRepo.save(generalResult);
        return modelMapper.map(generalResult, GeneralResultDTO.class);
    }

    @Override
    public GeneralResultDTO updateGeneralResult(GeneralResultId id,GeneralResultDTO generalResultDTO){
        GeneralResult foundGeneralResult = generalResultRepo.findById(id).orElseThrow(()-> new NotFoundException());
        modelMapper.map(generalResultDTO, foundGeneralResult);
        GeneralResult updatedGeneralResult = generalResultRepo.save(foundGeneralResult);
        return modelMapper.map(updatedGeneralResult, GeneralResultDTO.class);
    }

    @Override
    public void deleteGeneralResult(GeneralResultId id){
        GeneralResult existingGeneralResult = generalResultRepo.findById(id)
                .orElseThrow(() -> new RuntimeException("result with this id "+ id +" not found"));
        generalResultRepo.delete(existingGeneralResult);
    }
    public List<GeneralResultDTO> getGeneralResults(){
        List<GeneralResult> generalResults = generalResultRepo.findAll();
        return generalResults.stream()
                .map(generalResult -> modelMapper.map(generalResult,GeneralResultDTO.class)).collect(Collectors.toList());
    }
}
