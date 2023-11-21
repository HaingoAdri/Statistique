package com.example.statistique.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.statistique.models.Match;
import com.example.statistique.models.Statistique;
import com.example.statistique.models.ErrorResponse;
import com.example.statistique.service.MatchService;
import com.example.statistique.service.StatistiqueService;

import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;


@RestController
@RequestMapping("/statistique")
public class StatistiqueController {
    @Autowired
    private StatistiqueService statistiqueService;
    @Autowired
    private MatchService matchService;

    @PostMapping("/ajoutStatistique")
    public ResponseEntity<?> createVehicule(@RequestBody Statistique statistique) {
        try {
            Match match = new Match(statistique.getIdMatch()).getUneMatch(this.matchService);
            match.ckeckSiEquipeValide(statistique.getIdEquipe());
            statistique.ajoutStatistique(this.statistiqueService);
            return ResponseEntity.ok().build();
        }
        catch(Exception e) {
            System.out.println(e.getMessage());
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(new ErrorResponse(e.getMessage()));
        }
    }

}
