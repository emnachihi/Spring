package tn.esprit.etude.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.etude.entities.Chambre;

public interface ChambreRepository extends JpaRepository<Chambre, Long> {
}
