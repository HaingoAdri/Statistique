package com.example.statistique.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.statistique.models.Joueur;


public interface JoueurRepository extends JpaRepository<Joueur, Integer> {
    @Query(value = "SELECT * from joueur where id = :id", nativeQuery = true)
    Optional<Joueur> findById(@Param("id") int id);
    @Query(value = "select * from liste_joueur_equipe where id_equipe = :idEquipe", nativeQuery = true)
    List<Joueur> findByIdEquipe(@Param("idEquipe") int idEquipe);
    
}