package com.projetintegration.rechercheemplois.repositories;

import com.projetintegration.rechercheemplois.models.Candidat;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;


public interface CandidatRepository extends JpaRepository<Candidat,Long> {

}
