package tn.esprit.etude.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tn.esprit.etude.entities.Universite;
import tn.esprit.etude.service.interfaces.IUniversiteService;

import java.util.List;

@RestController
@RequestMapping("/universites")
@RequiredArgsConstructor
public class UniversiteController {

    private final IUniversiteService universiteService;

    @PostMapping("/add")
    public ResponseEntity<Universite> addUniversite(@RequestBody Universite universite) {
        return ResponseEntity.ok(universiteService.addUniversite(universite));
    }

    @PutMapping("/update")
    public ResponseEntity<Universite> updateUniversite(@RequestBody Universite universite) {
        return ResponseEntity.ok(universiteService.updateUniversite(universite));
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteUniversite(@PathVariable Long id) {
        universiteService.deleteUniversite(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Universite> getUniversiteById(@PathVariable Long id) {
        return ResponseEntity.ok(universiteService.getUniversiteById(id));
    }

    @GetMapping("/all")
    public ResponseEntity<List<Universite>> getAllUniversites() {
        return ResponseEntity.ok(universiteService.getAllUniversites());
    }
}
