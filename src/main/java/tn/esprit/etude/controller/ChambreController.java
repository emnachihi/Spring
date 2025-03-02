package tn.esprit.etude.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tn.esprit.etude.entities.Chambre;
import tn.esprit.etude.service.interfaces.IChambreService;

import java.util.List;

@RestController
@RequestMapping("/chambres")
@RequiredArgsConstructor
public class ChambreController {

    private final IChambreService chambreService;

    @PostMapping("/add")
    public ResponseEntity<Chambre> addChambre(@RequestBody Chambre chambre) {
        return ResponseEntity.ok(chambreService.addChambre(chambre));
    }

    @PutMapping("/update")
    public ResponseEntity<Chambre> updateChambre(@RequestBody Chambre chambre) {
        return ResponseEntity.ok(chambreService.updateChambre(chambre));
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteChambre(@PathVariable Long id) {
        chambreService.deleteChambre(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Chambre> getChambreById(@PathVariable Long id) {
        return ResponseEntity.ok(chambreService.getChambreById(id));
    }

    @GetMapping("/all")
    public ResponseEntity<List<Chambre>> getAllChambres() {
        return ResponseEntity.ok(chambreService.getAllChambres());
    }
}
