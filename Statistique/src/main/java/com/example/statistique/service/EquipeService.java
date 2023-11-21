package com.example.statistique.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.statistique.repository.EquipeRepository;
@Service
public class EquipeService {
    @Autowired
    public EquipeRepository equipeRepository;


}
