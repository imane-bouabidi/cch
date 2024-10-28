package com.wora.controllers;

import com.wora.models.dto.SeasonDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import com.wora.services.SeasonService;

import java.util.List;

@RestController
@RequestMapping("/api/v1/rounds")
public class RoundController {

    @Autowired
    private SeasonService roundService;

    @GetMapping
    public ResponseEntity<List<SeasonDTO>> getAllRounds() {
        return ResponseEntity.ok(roundService.getRounds());
    }

//    @GetMapping("/{id}")
//    public ResponseEntity<SeasonDTO> getRoundById(@PathVariable Long id) {
//        return ResponseEntity.ok(roundService.findById(id));
//    }

    @PostMapping
    public ResponseEntity<SeasonDTO> createRound(@RequestBody SeasonDTO roundDTO) {
        return ResponseEntity.ok(roundService.createRound(roundDTO));
    }

    @PutMapping("/{id}")
    public ResponseEntity<SeasonDTO> updateRound(@PathVariable Long id, @RequestBody SeasonDTO roundDTO) {
        return ResponseEntity.ok(roundService.updateRound(id, roundDTO));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteRound(@PathVariable Long id) {
        roundService.deleteRound(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}


