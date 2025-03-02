package tn.esprit.etude.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.etude.entities.Foyer;

public interface FoyerRepository extends JpaRepository<Foyer, Long> {
}
