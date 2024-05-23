package com.example.UtopiaSpring.service;

import com.example.UtopiaSpring.repo.TourRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TourService {
    @Autowired
    private TourRepo repo;
}
