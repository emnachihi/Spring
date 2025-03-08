package tn.esprit.etude.controller;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tn.esprit.etude.entities.Bloc;
import tn.esprit.etude.service.interfaces.IBlocService;

import java.util.List;

@RestController
@RequestMapping("/blocs")
@AllArgsConstructor
public class BlocController {

     IBlocService blocService;

    @PostMapping("/add")
    public ResponseEntity<Bloc> addBloc(@RequestBody Bloc bloc) {
        return ResponseEntity.ok(blocService.addBloc(bloc));
    }

    @PutMapping("/update")
    public ResponseEntity<Bloc> updateBloc(@RequestBody Bloc bloc) {
        return ResponseEntity.ok(blocService.updateBloc(bloc));
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteBloc(@PathVariable Long id) {
        blocService.deleteBloc(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Bloc> getBlocById(@PathVariable Long id) {
        return ResponseEntity.ok(blocService.getBlocById(id));
    }

    @GetMapping("/all")
    public ResponseEntity<List<Bloc>> getAllBlocs() {
        return ResponseEntity.ok(blocService.getAllBlocs());
    }
}
