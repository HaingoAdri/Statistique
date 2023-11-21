package com.example.statistique.repository;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.statistique.models.Equipe;


public interface EquipeRepository extends JpaRepository<Equipe, Integer> {
    @Query(value = "SELECT * from equipe where id = :id", nativeQuery = true)
    Optional<Equipe> findById(@Param("id") int id);
    @Query(value = "SELECT * from equipe order by nom", nativeQuery = true)
    List<Equipe> findAll();
    
}