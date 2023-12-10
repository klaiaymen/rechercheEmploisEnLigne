package com.projetintegration.rechercheemplois.models;

import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name="candidat")
public class Candidat {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nom;
    private String prenom;
    private String adresse;
    private String tel;
    private String email;
    private String login;
    private String mdp;
    @ManyToMany
    @JoinTable(
            name = "candidat_offre_favoris",
            joinColumns = @JoinColumn(name = "candidat_id"),
            inverseJoinColumns = @JoinColumn(name = "offre_id"))
    private Set<Offre> offresFavoris;

    @OneToMany(mappedBy = "candidat")
    private Set<Candidature> candidatures;

    public Candidat(Long id, String nom, String prenom, String adresse, String tel, String email, String login, String mdp) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.tel = tel;
        this.email = email;
        this.login = login;
        this.mdp = mdp;
    }


    public Candidat() {

    }

    public Set<Candidature> getCandidatures() {
        return candidatures;
    }

    public void setCandidatures(Set<Candidature> candidatures) {
        this.candidatures = candidatures;
    }

    public Set<Offre> getOffresFavoris() {
        return offresFavoris;
    }

    public void setOffresFavoris(Set<Offre> offresFavoris) {
        this.offresFavoris = offresFavoris;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getMdp() {
        return mdp;
    }

    public void setMdp(String mdp) {
        this.mdp = mdp;
    }
}
