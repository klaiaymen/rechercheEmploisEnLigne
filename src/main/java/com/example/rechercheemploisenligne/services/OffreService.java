package com.projetintegration.rechercheemplois.services;

import com.projetintegration.rechercheemplois.models.Offre;
import com.projetintegration.rechercheemplois.repositories.OffreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class OffreService {
    @Autowired
    private OffreRepository offreRepository;

    public Offre getOffreById(Long offreId) {
        Optional<Offre> offreOptional = offreRepository.findById(offreId);
        return offreOptional.orElse(null);
    }
    public Offre deposerOffre(Offre offre) {
        return offreRepository.save(offre);
    }

    public List<Offre> getAllOffres() {
        return offreRepository.findAll();
    }

    public Offre getOffreByTitle(String titre) {
        List<Offre> offres = offreRepository.findByTitre(titre);
        return offres.isEmpty() ? null : offres.get(0);
    }

}
