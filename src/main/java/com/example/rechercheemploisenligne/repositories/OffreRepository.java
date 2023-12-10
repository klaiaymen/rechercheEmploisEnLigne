package com.projetintegration.rechercheemplois.repositories;


import com.projetintegration.rechercheemplois.models.Offre;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;


public interface OffreRepository extends JpaRepository<Offre,Long> {
    List<Offre> findByTitre(String titre);

}
