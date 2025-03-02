package tn.esprit.etude.service.interfaces;

import tn.esprit.etude.entities.Bloc;
import java.util.List;

public interface IBlocService {
    Bloc addBloc(Bloc bloc);
    Bloc updateBloc(Bloc bloc);
    void deleteBloc(Long id);
    Bloc getBlocById(Long id);
    List<Bloc> getAllBlocs();
}
