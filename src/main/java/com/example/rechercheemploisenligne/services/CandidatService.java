package com.projetintegration.rechercheemplois.services;


import com.projetintegration.rechercheemplois.models.Candidat;
import com.projetintegration.rechercheemplois.models.Candidature;
import com.projetintegration.rechercheemplois.models.Offre;
import com.projetintegration.rechercheemplois.repositories.CandidatRepository;
import com.projetintegration.rechercheemplois.repositories.OffreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class CandidatService {
    @Autowired
    private CandidatRepository candidatRepository;
    @Autowired
    private OffreRepository offreRepository;
    @Autowired
    private CandidatureService candidatureService;
    @Autowired
    private OffreService offreService;

    public Candidat creerCompte(Candidat candidat) {
        return candidatRepository.save(candidat);
    }

    public List<Candidat> getAllCandidats() {
        return candidatRepository.findAll();
    }

    public Candidat editProfil(Candidat candidat) {
        return candidatRepository.save(candidat);
    }

    public Candidat ajouterOffreAuxFavoris(Long candidatId, Long offreId) {
        Optional<Candidat> candidatOptional = candidatRepository.findById(candidatId);
        Optional<Offre> offreOptional = offreRepository.findById(offreId);

        if (candidatOptional.isPresent() && offreOptional.isPresent()) {
            Candidat candidat = candidatOptional.get();
            Offre offre = offreOptional.get();

            candidat.getOffresFavoris().add(offre);
            return candidatRepository.save(candidat);
        } else {
            return null;
        }
    }


    public Candidature postulerPourOffre(Long candidatId, Long offreId, String lettreMotivation) {
        Candidat candidat = candidatRepository.findById(candidatId).orElse(null);
        Offre offre = offreService.getOffreById(offreId);

        if (candidat != null && offre != null) {
            return candidatureService.postulerPourOffre(candidat, offre, lettreMotivation);
        } else {
            // Gérer le cas où le candidat ou l'offre n'a pas été trouvé
            return null;
        }
    }
}
