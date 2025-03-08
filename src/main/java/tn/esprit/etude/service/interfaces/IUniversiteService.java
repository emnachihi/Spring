package tn.esprit.etude.service.interfaces;

import tn.esprit.etude.entities.Universite;
import java.util.List;

public interface IUniversiteService {
    Universite addUniversite(Universite universite);
    Universite updateUniversite(Universite universite);
    void deleteUniversite(Long id);
    Universite getUniversiteById(Long id);
    List<Universite> getAllUniversites();
    Universite affecterFoyerAUniversite(long idFoyer, String nomUniversite);

}
