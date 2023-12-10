package com.projetintegration.rechercheemplois.controllers;

import com.projetintegration.rechercheemplois.models.Candidat;
import com.projetintegration.rechercheemplois.models.Candidature;
import com.projetintegration.rechercheemplois.models.Offre;
import com.projetintegration.rechercheemplois.services.CandidatService;
import com.projetintegration.rechercheemplois.services.OffreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/candidats")
public class CandidatController {
    @Autowired
    private CandidatService candidatService;
    @Autowired
    private OffreService offreService;

    @PostMapping("/creer-compte")
    public Candidat creerCompteCandidat(@RequestBody Candidat candidat) {
        return candidatService.creerCompte(candidat);
    }
    @GetMapping("/getAll")
    public List<Candidat> getCandidatsList() {
        return candidatService.getAllCandidats();
    }

    @PutMapping ("/editProfil")
    public Candidat editerProfil(@RequestBody Candidat candidat) {
        return candidatService.editProfil(candidat);
    }

    @GetMapping("/getAllOffres")
    public List<Offre> getOffres() {
        return offreService.getAllOffres();
    }

    @GetMapping("/getOffresByTitle")
    public Offre getOffresByTitle(@RequestParam String titre) {
        return offreService.getOffreByTitle(titre);
    }

    @PostMapping("/ajouter-offre-favoris/{candidatId}/{offreId}")
    public Candidat ajouterOffreAuxFavoris(@PathVariable Long candidatId, @PathVariable Long offreId) {
        return candidatService.ajouterOffreAuxFavoris(candidatId, offreId);
    }


    @PostMapping("/{candidatId}/postuler/{offreId}")
    public Candidature postulerPourOffre(
            @PathVariable Long candidatId,
            @PathVariable Long offreId,
            @RequestBody String lettreMotivation) {
        return candidatService.postulerPourOffre(candidatId, offreId, lettreMotivation);
    }
}
