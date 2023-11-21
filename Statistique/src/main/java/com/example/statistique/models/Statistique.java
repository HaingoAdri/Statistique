package com.example.statistique.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Transient;

import java.sql.Date;

import com.example.statistique.service.StatistiqueService;

import jakarta.persistence.Column;

@Entity
@Table
public class Statistique {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", columnDefinition = "INTEGER")
    int id;
    @Column(name = "id_match", columnDefinition = "INTEGER")
    int idMatch;
    @Column(name = "id_equipe", columnDefinition = "INTEGER")
    int idEquipe;
    @Column(name = "id_joueur", columnDefinition = "INTEGER")
    int idJoueur;
    @Column(name = "action", columnDefinition = "INTEGER")
    int action;
    @Column(name = "points", columnDefinition = "double precision")
    double points;

    @Transient
    int match;
    @Transient
    int match_jouer;
    @Transient
    int point_marque;
    @Transient
    int tentative_tirre;
    @Transient
    int tirre_reussi;
    @Transient
    int rebond;
    @Transient
    int passe_decisif;
    @Transient
    int tentative_lancers_francs;
    @Transient
    int lancers_francs_reussi;
    @Transient
    int tentative_trois_points;
    @Transient
    int trois_points_reussi;
    @Transient
    double moyenne_points_match;
    @Transient
    double efficaite;
    @Transient
    double pourc_reussite_tirs_au_but;
    @Transient
    double pourc_reussite_trois_points;
    @Transient
    double pourc_lancers_francs;

    public Statistique() {
    }

    public Statistique(int idEquipe, int idJoueur) {
        this.setIdEquipe(idEquipe);
        this.setIdJoueur(idJoueur);
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

    public int getIdMatch() {
        return this.idMatch;
    }

    public void setIdMatch(int idMatch) {
        this.idMatch = idMatch;
    }

    public void setIdMatch(String idMatch) {
        this.idMatch = Integer.valueOf(idMatch);
    }

    public int getIdEquipe() {
        return this.idEquipe;
    }

    public void setIdEquipe(int idEquipe) {
        this.idEquipe = idEquipe;
    }

    public void setIdEquipe(String idEquipe) {
        this.idEquipe = Integer.valueOf(idEquipe);
    }

    public int getIdJoueur() {
        return this.idJoueur;
    }

    public void setIdJoueur(int idJoueur) {
        this.idJoueur = idJoueur;
    }

    public void setIdJoueur(String idJoueur) {
        this.idJoueur = Integer.valueOf(idJoueur);
    }

    public int getAction() {
        return this.action;
    }

    public void setAction(int action) {
        this.action = action;
    }

    public void setAction(String action) {
        this.action = Integer.valueOf(action);
    }

    public double getPoints() {
        return this.points;
    }

    public void setPoints(double points) {
        this.points = points;
    }

    public void setPoints(String points) {
        this.points = Double.valueOf(points);
    }

    public int getMatch() {
        return this.match;
    }

    public void setMatch(int match) {
        this.match = match;
    }

    public int getMatch_jouer() {
        return this.match_jouer;
    }

    public void setMatch_jouer(int match_jouer) {
        this.match_jouer = match_jouer;
    }

    public int getTentative_tirre() {
        return this.tentative_tirre;
    }

    public void setTentative_tirre(int tentative_tirre) {
        this.tentative_tirre = tentative_tirre;
    }

    public int getTirre_reussi() {
        return this.tirre_reussi;
    }

    public void setTirre_reussi(int tirre_reussi) {
        this.tirre_reussi = tirre_reussi;
    }

    public int getRebond() {
        return this.rebond;
    }

    public void setRebond(int rebond) {
        this.rebond = rebond;
    }

    public int getPasse_decisif() {
        return this.passe_decisif;
    }

    public void setPasse_decisif(int passe_decisif) {
        this.passe_decisif = passe_decisif;
    }

    public int getPoint_marque() {
        return this.point_marque;
    }

    public void setPoint_marque(int point_marque) {
        this.point_marque = point_marque;
    }

    public int getTentative_lancers_francs() {
        return this.tentative_lancers_francs;
    }

    public void setTentative_lancers_francs(int tentative_lancers_francs) {
        this.tentative_lancers_francs = tentative_lancers_francs;
    }

    public int getLancers_francs_reussi() {
        return this.lancers_francs_reussi;
    }

    public void setLancers_francs_reussi(int lancers_francs_reussi) {
        this.lancers_francs_reussi = lancers_francs_reussi;
    }

    public int getTentative_trois_points() {
        return this.tentative_trois_points;
    }

    public void setTentative_trois_points(int tentative_trois_points) {
        this.tentative_trois_points = tentative_trois_points;
    }

    public int getTrois_points_reussi() {
        return this.trois_points_reussi;
    }

    public void setTrois_points_reussi(int trois_points_reussi) {
        this.trois_points_reussi = trois_points_reussi;
    }

    public double getMoyenne_points_match() {
        return this.moyenne_points_match;
    }

    public void setMoyenne_points_match(double moyenne_points_match) {
        this.moyenne_points_match = moyenne_points_match;
    }

    public double getEfficaite() {
        return this.efficaite;
    }

    public void setEfficaite(double efficaite) {
        this.efficaite = efficaite;
    }

    public double getPourc_reussite_tirs_au_but() {
        return this.pourc_reussite_tirs_au_but;
    }

    public void setPourc_reussite_tirs_au_but(double pourc_reussite_tirs_au_but) {
        this.pourc_reussite_tirs_au_but = pourc_reussite_tirs_au_but;
    }

    public double getPourc_reussite_trois_points() {
        return this.pourc_reussite_trois_points;
    }

    public void setPourc_reussite_trois_points(double pourc_reussite_trois_points) {
        this.pourc_reussite_trois_points = pourc_reussite_trois_points;
    }

    public double getPourc_lancers_francs() {
        return this.pourc_lancers_francs;
    }

    public void setPourc_lancers_francs(double pourc_lancers_francs) {
        this.pourc_lancers_francs = pourc_lancers_francs;
    }

    public void ajoutStatistique(StatistiqueService statistiqueService) {
        statistiqueService.statistiqueRepository.save(this);
    }
    
    public int getPoints(Date date, int action, StatistiqueService statistiqueService) {
        int points = statistiqueService.statistiqueRepository.getPoints(this.getIdEquipe(), this.getIdJoueur(), action, date);
        System.out.println("POINTS: " + points);
        return points;
    }

    public Statistique getStatistique(Date date, StatistiqueService statistiqueService) {
        Statistique statistique = new Statistique();
        statistique.setMatch(this.getPoints(date, 1, statistiqueService));
        statistique.setMatch_jouer(this.getPoints(date, 5, statistiqueService));
        System.out.println("jouer: " + statistique.getMatch_jouer());
        statistique.setTentative_tirre(this.getPoints(date, 10, statistiqueService));
        statistique.setTirre_reussi(this.getPoints(date, 15, statistiqueService));
        statistique.setRebond(this.getPoints(date, 20, statistiqueService));
        statistique.setPasse_decisif(this.getPoints(date, 24, statistiqueService));
        statistique.setTentative_lancers_francs(this.getPoints(date, 30, statistiqueService));
        statistique.setLancers_francs_reussi(this.getPoints(date, 35, statistiqueService));
        statistique.setTentative_trois_points(this.getPoints(date, 40, statistiqueService));
        statistique.setTrois_points_reussi(this.getPoints(date, 45, statistiqueService));
        statistique.setPoint_marque(this.getPoints(date, 50, statistiqueService));
        System.out.println("manaraka " + statistique.getPoint_marque() + " et " + statistique.getMatch_jouer());
        double mpm = (double) (statistique.getPoint_marque() / statistique.getMatch_jouer());
        double fg = ((double) (statistique.getTirre_reussi() / statistique.getTentative_tirre())) * 100;
        double pourcentage_trois_points = ((double) (statistique.getTentative_trois_points() / statistique.getTrois_points_reussi()))* 100;
        double pourcentage_lancers_francs = ((double) (statistique.getLancers_francs_reussi()/ statistique.getTentative_lancers_francs())) * 100;
        statistique.setMoyenne_points_match(mpm);
        statistique.setPourc_reussite_tirs_au_but(fg);
        statistique.setPourc_reussite_trois_points(pourcentage_trois_points);
        statistique.setPourc_lancers_francs(pourcentage_lancers_francs);
        return statistique;
    }

}
