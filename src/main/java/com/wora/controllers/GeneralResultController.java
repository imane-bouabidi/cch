package com.wora.controllers;

import com.wora.models.dto.GeneralResultDTO;
import com.wora.models.entities.embeddables.GeneralResultId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import com.wora.services.GeneralResultService;

import java.util.List;

@RestController
@RequestMapping("/api/v1/generalResults")
public class GeneralResultController{

    @Autowired
    private GeneralResultService generalResultService;

    @GetMapping
    public ResponseEntity<List<GeneralResultDTO>> getAllGeneralResults() {
        return ResponseEntity.ok(generalResultService.getGeneralResults());
    }

//    @GetMapping("/{id}")
//    public ResponseEntity<GeneralResultDTO> getGeneralResultById(@PathVariable GeneralResultId id) {
//        return ResponseEntity.ok(generalResultService.findById(id));
//    }

    @PostMapping
    public ResponseEntity<GeneralResultDTO> createGeneralResult(@RequestBody GeneralResultDTO generalResultDTO) {
        return ResponseEntity.ok(generalResultService.createGeneralResult(generalResultDTO));
    }

    @PutMapping("/{id}")
    public ResponseEntity<GeneralResultDTO> updateGeneralResult(@PathVariable GeneralResultId id, @RequestBody GeneralResultDTO generalResultDTO) {
        return ResponseEntity.ok(generalResultService.updateGeneralResult(id, generalResultDTO));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteGeneralResult(@PathVariable GeneralResultId id) {
        generalResultService.deleteGeneralResult(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}



