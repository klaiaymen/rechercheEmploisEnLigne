package com.projetintegration.rechercheemplois.repositories;

import com.projetintegration.rechercheemplois.models.Candidature;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CandidatureRepository extends JpaRepository<Candidature,Long> {

}
