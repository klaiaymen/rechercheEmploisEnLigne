package com.projetintegration.rechercheemplois.models;

import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name="candidature")
public class Candidature {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "candidat_id")
    private Candidat candidat;

    @ManyToOne
    @JoinColumn(name = "offre_id")
    private Offre offre;

    private String lettreMotivation;


    public Candidature(Long id, Candidat candidat, Offre offre, String lettreMotivation) {
        this.id = id;
        this.candidat = candidat;
        this.offre = offre;
        this.lettreMotivation = lettreMotivation;
    }

    public Candidature() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Candidat getCandidat() {
        return candidat;
    }

    public void setCandidat(Candidat candidat) {
        this.candidat = candidat;
    }

    public Offre getOffre() {
        return offre;
    }

    public void setOffre(Offre offre) {
        this.offre = offre;
    }

    public String getLettreMotivation() {
        return lettreMotivation;
    }

    public void setLettreMotivation(String lettreMotivation) {
        this.lettreMotivation = lettreMotivation;
    }
}
