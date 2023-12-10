package com.projetintegration.rechercheemplois.repositories;

import com.projetintegration.rechercheemplois.models.Candidat;
import com.projetintegration.rechercheemplois.models.Recruteur;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RecruteurRepository extends JpaRepository<Recruteur,Long> {
}
