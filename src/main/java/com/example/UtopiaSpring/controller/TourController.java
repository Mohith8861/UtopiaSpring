package com.example.UtopiaSpring.controller;


import com.example.UtopiaSpring.model.Tour;
import com.example.UtopiaSpring.repo.TourRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@CrossOrigin(origins = "*")
public class TourController {

    @Autowired
    TourRepo tour;

    @GetMapping(value = "/search/days/{d}")
    public List<Tour> searchToursByDays(@PathVariable Integer d) {
        return tour.findByDays(d, d);
    }

    @GetMapping(value = "/tour")
    public List<Tour> getAllTours() {
        return tour.findAll();
    }

    @GetMapping(value = "/search/{s}")
    public List<Tour> searchTours(@PathVariable String s) {
        return tour.findByslugRegex(s, s);
    }

    @GetMapping(value = "/search/inclusion/{s}")
    public List<Tour> searchToursByInclusions(@PathVariable String s) {
        return tour.findByInclusions(s, s);
    }

    @GetMapping(value = "/search/places/{s}")
    public List<Tour> searchToursByPlaces(@PathVariable String s) {
        return tour.findByPlaces(s, s);
    }
}
