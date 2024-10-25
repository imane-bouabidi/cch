package controllers;
import models.dto.RiderDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import services.RiderService;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/api/v1/riders")
public class RiderController {

    @Autowired
    private RiderService riderService;

    @GetMapping
    public ResponseEntity<List<RiderDTO>> getAllRiders() {
        return ResponseEntity.ok(riderService.getRiders());
    }

//    @GetMapping("/{id}")
//    public ResponseEntity<RiderDTO> getRiderById(@PathVariable Long id) {
//        return ResponseEntity.ok(riderService.findById(id));
//    }

    @PostMapping
    public ResponseEntity<RiderDTO> createRider(@RequestBody RiderDTO cyclistDTO) {
        return ResponseEntity.ok(riderService.createRider(cyclistDTO));
    }

    @PutMapping("/{id}")
    public ResponseEntity<RiderDTO> updateRider(@PathVariable Long id, @RequestBody RiderDTO cyclistDTO) {
        return ResponseEntity.ok(riderService.updateRider(id, cyclistDTO));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteRider(@PathVariable Long id) {
        riderService.deleteRider(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}

