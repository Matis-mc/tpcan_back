package com.groupe1.tpcan.controller;

import com.groupe1.tpcan.service.VentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.sql.Date;
import java.util.List;
import java.util.TreeMap;

@Controller
@CrossOrigin(origins = {"*"})
@RequestMapping("/vent")
public class VentController {


    @Autowired
    private VentService service;

    @GetMapping("/{id}")
    public ResponseEntity<Float> getVitesseById(
            @PathVariable("id") long id
    ){
        Float vitesse = service.getVitesseById(id);
        return new ResponseEntity<Float>(vitesse, HttpStatus.OK);
    }

    @GetMapping("/last")
    public ResponseEntity<Float> getLastVitesse(){
        TreeMap<Date,Float> vitesses = service.getLastXVitesse(1);
        return new ResponseEntity<Float>(vitesses.get(0), HttpStatus.OK);
    }

    @GetMapping("/last/{nb}")
    public ResponseEntity<TreeMap<Date,Float>> getLastVitesses(
            @PathVariable("nb") int nb
    ){
        TreeMap<Date,Float> vitesses = service.getLastXVitesse(nb);
        return new ResponseEntity<>(vitesses, HttpStatus.OK);
    }

}
