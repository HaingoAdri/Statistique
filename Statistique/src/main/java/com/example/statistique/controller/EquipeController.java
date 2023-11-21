package com.example.statistique.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.statistique.models.Equipe;
import com.example.statistique.service.EquipeService;
import com.example.statistique.service.JoueurService;
import com.example.statistique.service.StatistiqueService;

import java.util.List;

@RestController
@RequestMapping("/equipe")
public class EquipeController {
    @Autowired
    private EquipeService equipeService;
    @Autowired
    private JoueurService joueurService;
    @Autowired
    private StatistiqueService statistiqueService;

    @GetMapping("/listeEquipe")
    public List<Equipe> getListeEquipes() {
        return new Equipe().listeEquipe(this.equipeService);
    }

    @GetMapping("/listeJoueur/{idEquipe}")
    public Equipe getUneEquipe(@PathVariable String idEquipe) {
        return new Equipe(idEquipe).getUneEquipe(this.equipeService, this.joueurService, this.statistiqueService);
    }

}
