package com.example.statistique.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.statistique.repository.StatistiqueRepository;
@Service
public class StatistiqueService {
    @Autowired
    public StatistiqueRepository statistiqueRepository;
}
