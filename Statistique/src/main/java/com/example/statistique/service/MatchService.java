package com.example.statistique.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.statistique.repository.MatchRepository;
@Service
public class MatchService {
    @Autowired
    public MatchRepository matchRepository;
}
