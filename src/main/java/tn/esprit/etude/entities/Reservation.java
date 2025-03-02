package tn.esprit.etude.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Reservation {
    @Id

    private Long idReservation;

    @Temporal(TemporalType.DATE)
    private Date anneeUniversitaire;

    private Boolean estValide;

    @ManyToOne

    private Etudiant etudiant;

    @ManyToOne

    private Chambre chambre;





}
