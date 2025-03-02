package tn.esprit.etude.service.interfaces;

import tn.esprit.etude.entities.Chambre;
import java.util.List;

public interface IChambreService {
    Chambre addChambre(Chambre chambre);
    Chambre updateChambre(Chambre chambre);
    void deleteChambre(Long id);
    Chambre getChambreById(Long id);
    List<Chambre> getAllChambres();
}
