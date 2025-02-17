package tn.esprit.etude.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Universite {
    @Id
    private Long idUniversite;

    private String nomUniversite;
    private String adresse;

    @OneToOne
    private Foyer foyer;


}
