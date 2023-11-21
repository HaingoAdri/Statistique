package com.example.statistique.models;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import com.example.statistique.service.MatchService;

import jakarta.persistence.Column;
import java.sql.Timestamp;
@Entity
@Table
public class Match {
    @Id
    int id;
    @Column(name = "id_equipe1")
    int idEquipe1;
    @Column(name = "id_equipe2")
    int idEquipe2;
    @Column(name = "id_stade")
    int idStade;
    Timestamp date;
    
    public Match() {}

    public Match(int id) {
        this.setId(id);
    }

    public int getId() {
        return this.id;
    }
    public void setId(int id) {
        this.id = id;
    }
    
    public int getIdEquipe1() {
        return this.idEquipe1;
    }
    public void setIdEquipe1(int idEquipe1) {
        this.idEquipe1 = idEquipe1;
    }
    
    public int getIdEquipe2() {
        return this.idEquipe2;
    }
    public void setIdEquipe2(int idEquipe2) {
        this.idEquipe2 = idEquipe2;
    }
    
    public int getIdStade() {
        return this.idStade;
    }
    public void setIdStade(int idStade) {
        this.idStade = idStade;
    }
    
    public Timestamp getDate() {
        return this.date;
    }
    public void setDate(Timestamp date) {
        this.date = date;
    }

    public Match getUneMatch(MatchService matchService)  throws Exception {
        Match match = matchService.matchRepository.findById(this.getId()).orElse(null);
        if(match == null)
            throw new Exception("L' ID du Match numero "+ this.getId() +" n'existe pas");
        return match;
    }

    public void ckeckSiEquipeValide(int idEquipe) throws Exception{
        System.out.println("idEquipe: "+ idEquipe);
        if(idEquipe != this.getIdEquipe1() && idEquipe != this.getIdEquipe2()) {
            throw new Exception("L'ID de l'Equipe numero " + idEquipe + " n'est pas valide sur cette ID match");
        }
    }



    
}
