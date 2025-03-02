package tn.esprit.etude.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.etude.entities.Etudiant;

public interface EtudiantRepository extends JpaRepository<Etudiant, Long> {
}
