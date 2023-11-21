package com.example.statistique.models;
import java.sql.Date;
import java.util.List;


import com.example.statistique.service.JoueurService;
import com.example.statistique.service.StatistiqueService;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import jakarta.persistence.Column;

@Entity
@Table
public class Joueur {
    @Id
    int id;
    String nom;
    String prenom;
    @Column(name = "date_naissance")
    Date dateDeNaissance;
    @Transient
    Statistique statistique;

    public Joueur() {}

    public Joueur(String id) {
        this.setId(id);
    }
    
    public int getId() {
        return this.id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setId(String id) {
        this.id = Integer.valueOf(id);
    }
    
    public String getNom() {
        return this.nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    
    public String getPrenom() {
        return this.prenom;
    }
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
    
    public Date getDateDeNaissance() {
        return this.dateDeNaissance;
    }
    public void setDateDeNaissance(Date dateDeNaissance) {
        this.dateDeNaissance = dateDeNaissance;
    }
    public void setDateDeNaissance(String dateDeNaissance) {
        this.dateDeNaissance = Date.valueOf(dateDeNaissance);
    }

    public Statistique getStatistique() {
        return this.statistique;
    }
    public void setStatistique(Statistique statistique) {
        this.statistique = statistique;
    }
    public void setStatistique(int idEquipe, Date date, StatistiqueService statistiqueService) {
        this.statistique = new Statistique(idEquipe, this.getId()).getStatistique(date, statistiqueService);
    }

    public List<Joueur> getListeJoueur(JoueurService joueurService, StatistiqueService statistiqueService, int idEquipe) {
        java.util.Date date = new java.util.Date();
        java.sql.Date sqlDate = new java.sql.Date(date.getTime());
        List<Joueur> listeJoueur = joueurService.joueurRepository.findByIdEquipe(idEquipe);
        for (Joueur joueur : listeJoueur) {
            System.out.println("equipe: " + idEquipe + "  ++++++++++++++++        joueur: " + joueur.getId() + " *********************************************************");
            joueur.setStatistique(idEquipe, sqlDate, statistiqueService);
        }
        return listeJoueur;
    }



    
}
