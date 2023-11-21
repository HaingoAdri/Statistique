package com.example.statistique.models;
import java.util.List;

import com.example.statistique.service.EquipeService;
import com.example.statistique.service.JoueurService;
import com.example.statistique.service.StatistiqueService;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;

@Entity
@Table
public class Equipe {
    @Id
    int id;
    String nom;

    @Transient
    List<Joueur> joueurs;
    @Transient
    int match_jouer;

    public Equipe() {}

    public Equipe(String id) {
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

    public List<Joueur> getJoueurs() {
        return this.joueurs;
    }
    public void setJoueurs(List<Joueur> joueurs) {
        this.joueurs = joueurs;
    }

    public int getMatch_jouer() {
        return this.match_jouer;
    }
    public void setMatch_jouer(int match_jouer) {
        this.match_jouer = match_jouer;
    }


    public List<Equipe> listeEquipe(EquipeService equipeService) {
        return equipeService.equipeRepository.findAll();
    }

    public Equipe getUneEquipe(EquipeService equipeService, JoueurService joueurService, StatistiqueService statistiqueService) {
        Equipe equipe = equipeService.equipeRepository.findById(this.getId()).orElse(null);
        int jouer = 0;
        if(equipe != null) {
            equipe.setJoueurs(new Joueur().getListeJoueur(joueurService, statistiqueService, this.getId()));
            for (Joueur joueur : this.getJoueurs()) {
                jouer += joueur.getStatistique().getMatch_jouer();
            }
        }
        this.setMatch_jouer(jouer);
        return equipe;
    }
}
