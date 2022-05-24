package com.groupe1.tpcan.controller;


import com.groupe1.tpcan.service.PipoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.sql.Date;
import java.util.TreeMap;

@Controller
@CrossOrigin(origins = {"*"})
@RequestMapping("/pipo")
public class PipoController {


    @Autowired
    private PipoService service;

    @GetMapping("/{id}")
    public ResponseEntity<Float> getPositionById(
            @PathVariable("id") long id
    ){
        Float position = service.getPositionById(id);
        return new ResponseEntity<Float>(position, HttpStatus.OK);
    }

    @GetMapping("/last")
    public ResponseEntity<Float> getLastPosition(){
        TreeMap<Date,Float> positions = service.getLastXPosition(1);
        return new ResponseEntity<Float>(positions.get(0), HttpStatus.OK);
    }

    @GetMapping("/last/{nb}")
    public ResponseEntity<TreeMap<Date,Float>> getLastPositions(
            @PathVariable("nb") int nb
    ){
        TreeMap<Date,Float> positions = service.getLastXPosition(nb);
        return new ResponseEntity<>(positions, HttpStatus.OK);
    }



}
