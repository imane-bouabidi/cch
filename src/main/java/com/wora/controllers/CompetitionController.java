package com.wora.controllers;

import com.wora.models.dto.CompetitionDTO;
import org.springframework.beans.factory.annotation.Autowired;
import com.wora.services.CompetitionService;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/competitions")
public class CompetitionController {

    @Autowired
    private CompetitionService competitionService;

    @GetMapping
    public ResponseEntity<List<CompetitionDTO>> getAllCompetitions() {
        return ResponseEntity.ok(competitionService.getAllCompetitions());
    }

//    @GetMapping("/{id}")
//    public ResponseEntity<CompetitionDTO> getCompetitionById(@PathVariable Long id) {
//        return ResponseEntity.ok(competitionService.findById(id));
//    }

    @PostMapping
    public ResponseEntity<CompetitionDTO> createCompetition(@RequestBody CompetitionDTO competitionDTO) {
        return ResponseEntity.ok(competitionService.createCompetition(competitionDTO));
    }

    @PutMapping("/{id}")
    public ResponseEntity<CompetitionDTO> updateCompetition(@PathVariable Long id, @RequestBody CompetitionDTO competitionDTO) {
        return ResponseEntity.ok(competitionService.updateCompetition(id, competitionDTO));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCompetition(@PathVariable Long id) {
        competitionService.deleteCompetition(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}

