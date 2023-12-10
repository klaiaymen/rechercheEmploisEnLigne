package com.projetintegration.rechercheemplois.models;

import jakarta.persistence.*;

import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "offre")
public class Offre {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String titre;
    private String description;
    private Date createdAt = new Date();

    @ManyToMany(mappedBy = "offresFavoris")
    private Set<Candidat> candidatsFavoris;

    @OneToMany(mappedBy = "offre")
    private Set<Candidature> candidatures;
    public Offre(Long id, String titre, String description, Date createdAt) {
        this.id = id;
        this.titre = titre;
        this.description = description;
        this.createdAt = createdAt;
    }
    @ManyToOne
    @JoinColumn(name = "recruteur_id")
    private Recruteur recruteur;
    
    public Offre() {

    }

    public Set<Candidat> getCandidatsFavoris() {
        return candidatsFavoris;
    }

    public void setCandidatsFavoris(Set<Candidat> candidatsFavoris) {
        this.candidatsFavoris = candidatsFavoris;
    }

    public Set<Candidature> getCandidatures() {
        return candidatures;
    }

    public void setCandidatures(Set<Candidature> candidatures) {
        this.candidatures = candidatures;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }
}
