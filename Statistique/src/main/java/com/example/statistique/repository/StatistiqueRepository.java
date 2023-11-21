package com.example.statistique.repository;
import java.sql.Date;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.statistique.models.Statistique;


public interface StatistiqueRepository extends JpaRepository<Statistique, Integer> {
    @Query(value = "SELECT COALESCE(SUM(points), 0) AS points FROM ( SELECT points FROM statistique_match WHERE id_equipe = :idEquipe AND id_joueur = :idJoueur AND action = :action AND date <= :date GROUP BY id_equipe, id_joueur, action, points) AS subquery", nativeQuery = true)
    int getPoints(@Param("idEquipe") int idEquipe, @Param("idJoueur") int idJoueur, @Param("action") int action, @Param("date") Date date);
}