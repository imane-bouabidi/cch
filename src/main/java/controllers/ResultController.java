package controllers;

import models.dto.ResultDTO;
import models.entities.embeddables.RoundResultId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import services.ResultService;

import java.util.List;

@Controller
@RequestMapping("/api/v1/results")
public class ResultController {

    @Autowired
    private ResultService resultService;

    @GetMapping
    public ResponseEntity<List<ResultDTO>> getAllResults() {
        return ResponseEntity.ok(resultService.getAllResults());
    }

//    @GetMapping("/{id}")
//    public ResponseEntity<ResultDTO> getResultById(@PathVariable Long id) {
//        return ResponseEntity.ok(resultService.findById(id));
//    }

    @PostMapping
    public ResponseEntity<ResultDTO> createResult(@RequestBody ResultDTO resultDTO) {
        return ResponseEntity.ok(resultService.createResult(resultDTO));
    }

    @PutMapping("/{id}")
    public ResponseEntity<ResultDTO> updateResult(@PathVariable RoundResultId id, @RequestBody ResultDTO resultDTO) {
        return ResponseEntity.ok(resultService.updateResult(id, resultDTO));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteResult(@PathVariable RoundResultId id) {
        resultService.deleteResult(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}

