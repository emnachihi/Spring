package tn.esprit.etude.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tn.esprit.etude.entities.Foyer;
import tn.esprit.etude.service.interfaces.IFoyerService;

import java.util.List;

@RestController
@RequestMapping("/foyers")
@RequiredArgsConstructor
public class FoyerController {

    private final IFoyerService foyerService;

    @PostMapping("/add")
    public ResponseEntity<Foyer> addFoyer(@RequestBody Foyer foyer) {
        return ResponseEntity.ok(foyerService.addFoyer(foyer));
    }

    @PutMapping("/update")
    public ResponseEntity<Foyer> updateFoyer(@RequestBody Foyer foyer) {
        return ResponseEntity.ok(foyerService.updateFoyer(foyer));
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteFoyer(@PathVariable Long id) {
        foyerService.deleteFoyer(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Foyer> getFoyerById(@PathVariable Long id) {
        return ResponseEntity.ok(foyerService.getFoyerById(id));
    }

    @GetMapping("/all")
    public ResponseEntity<List<Foyer>> getAllFoyers() {
        return ResponseEntity.ok(foyerService.getAllFoyers());
    }
}
