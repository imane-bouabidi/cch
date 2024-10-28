package com.wora.services.Imlp;

import com.wora.models.dto.ResultDTO;
import com.wora.models.entities.Result;
import com.wora.models.entities.embeddables.RoundResultId;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.wora.repositories.ResultRepo;
import com.wora.services.ResultService;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ResultServiceImpl implements ResultService {

    @Autowired //injection
    private ResultRepo resultRepo;
    @Autowired
    private ModelMapper modelMapper;

    public ResultDTO createResult(ResultDTO resultDTO) {
        Result result = modelMapper.map(resultDTO, Result.class);
        result = resultRepo.save(result);
        return modelMapper.map(result, ResultDTO.class);
    }
    public ResultDTO updateResult(RoundResultId id, ResultDTO resultDTO) {
        Result result = resultRepo.findById(id).orElseThrow(() -> new IllegalArgumentException("Result not found"));
        modelMapper.map(resultDTO, result);
        Result savedResult = resultRepo.save(result);
        return modelMapper.map(savedResult, ResultDTO.class);
    }
    public void deleteResult(RoundResultId id) {
        Result result = resultRepo.findById(id).orElseThrow(()->new IllegalArgumentException("Result not found"));
        resultRepo.delete(result);
    }
    public ResultDTO getResultById(RoundResultId id) {
        Result result = resultRepo.findById(id).orElseThrow(()->new IllegalArgumentException("Result not found"));
        return modelMapper.map(result, ResultDTO.class);
    }
    public List<ResultDTO> getAllResults() {
        List<Result> results = resultRepo.findAll();
        return results.stream()
                .map(result -> modelMapper.map(result,ResultDTO.class)).collect(Collectors.toList());
    }
}
