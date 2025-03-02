package tn.esprit.etude.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.etude.entities.Bloc;

public interface BlocRepository extends JpaRepository<Bloc, Long> {
}
