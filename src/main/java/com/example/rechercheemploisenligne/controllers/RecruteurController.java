package com.projetintegration.rechercheemplois.controllers;


import com.projetintegration.rechercheemplois.models.Candidat;
import com.projetintegration.rechercheemplois.models.Offre;
import com.projetintegration.rechercheemplois.models.Recruteur;

import com.projetintegration.rechercheemplois.services.OffreService;
import com.projetintegration.rechercheemplois.services.RecruteurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/recruteurs")
public class RecruteurController {
    @Autowired
    private RecruteurService recruteurService;
    @Autowired
    private OffreService offreService;


    @PostMapping("/creer-compte")
    public Recruteur creerCompteRecruteur(@RequestBody Recruteur recruteur) {
        return recruteurService.creerCompte(recruteur);
    }
    @GetMapping("/getAll")
    public List<Recruteur> getRecruteursList() {
        return recruteurService.getAllRecruteurs();
    }

    @PutMapping ("/editProfil")
    public Recruteur editerProfil(@RequestBody Recruteur recruteur) {
        return recruteurService.editProfil(recruteur);
    }

    @PostMapping("/deposer-offre")
    public Offre deposerOffre(@RequestBody Offre offre) {
        return offreService.deposerOffre(offre);
    }
}
