package controllers;
import models.dto.RiderDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import services.RiderService;
import org.springframework.http.ResponseEntity;

import java.util.List;

@Controller
@RequestMapping("/api/v1/cyclists")
public class RiderController {

    @Autowired
    private RiderService riderService;

    @GetMapping
    public ResponseEntity<List<RiderDTO>> getAllCyclists() {
        return ResponseEntity.ok(riderService.getRiders());
    }

    @GetMapping("/{id}")
    public ResponseEntity<RiderDTO> getCyclistById(@PathVariable Long id) {
        return ResponseEntity.ok(riderService.findById(id));
    }

    @PostMapping
    public ResponseEntity<RiderDTO> createCyclist(@RequestBody RiderDTO cyclistDTO) {
        return ResponseEntity.ok(riderService.createCyclist(cyclistDTO));
    }

    @PutMapping("/{id}")
    public ResponseEntity<RiderDTO> updateCyclist(@PathVariable Long id, @RequestBody RiderDTO cyclistDTO) {
        return ResponseEntity.ok(riderService.updateCyclist(id, cyclistDTO));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCyclist(@PathVariable Long id) {
        riderService.deleteCyclist(id);
        return ResponseEntity.noContent().build();
    }
}

