package tn.esprit.etude.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.etude.entities.Reservation;

public interface ReservationRepository extends JpaRepository<Reservation, String> {
}
