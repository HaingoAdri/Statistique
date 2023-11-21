package com.example.statistique.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.statistique.repository.JoueurRepository;
@Service
public class JoueurService {
    @Autowired
    public JoueurRepository joueurRepository;
}
