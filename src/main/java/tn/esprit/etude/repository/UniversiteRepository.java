package tn.esprit.etude.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.etude.entities.Universite;

public interface UniversiteRepository extends JpaRepository<Universite, Long> {
}
