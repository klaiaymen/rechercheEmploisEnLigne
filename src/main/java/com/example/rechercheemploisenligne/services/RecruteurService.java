package com.projetintegration.rechercheemplois.services;

import com.projetintegration.rechercheemplois.models.Recruteur;
import com.projetintegration.rechercheemplois.repositories.RecruteurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class RecruteurService {
    @Autowired
    private RecruteurRepository recruteurRepository;

    public Recruteur creerCompte(Recruteur recruteur) {
        return recruteurRepository.save(recruteur);
    }

    public List<Recruteur> getAllRecruteurs() {
        return recruteurRepository.findAll();
    }

    public Recruteur editProfil(Recruteur recruteur) {
        return recruteurRepository.save(recruteur);
    }
}
