package com.projetintegration.rechercheemplois.services;

import com.projetintegration.rechercheemplois.models.Candidat;
import com.projetintegration.rechercheemplois.models.Candidature;
import com.projetintegration.rechercheemplois.models.Offre;
import com.projetintegration.rechercheemplois.repositories.CandidatureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CandidatureService {
    @Autowired
    private CandidatureRepository candidatureRepository;

    public Candidature postulerPourOffre(Candidat candidat, Offre offre, String lettreMotivation) {
        Candidature candidature = new Candidature();
        candidature.setCandidat(candidat);
        candidature.setOffre(offre);
        candidature.setLettreMotivation(lettreMotivation);

        return candidatureRepository.save(candidature);
    }

}
