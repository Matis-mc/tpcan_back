package com.groupe1.tpcan.controller;


import com.groupe1.tpcan.service.TemperatureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@CrossOrigin(origins = {"*"})
@RequestMapping("/temperature")
public class TemperatureController {
    
    @Autowired
    private TemperatureService service;

    @GetMapping("/{id}")
    public ResponseEntity<Float> getTemperatureById(
            @PathVariable("id") long id
    ){
        Float temp = service.getTemperatureById(id);
        return new ResponseEntity<Float>(temp, HttpStatus.OK);
    }

    @GetMapping("/last")
    public ResponseEntity<Float> getLastTemperature(){
        List<Float> temp = service.getLastXTemperature(1);
        return new ResponseEntity<Float>(temp.get(0), HttpStatus.OK);
    }

    @GetMapping("/last/{nb}")
    public ResponseEntity<List<Float>> getLastTemperature(
            @PathVariable("nb") int nb
    ){
        List<Float> temp = service.getLastXTemperature(nb);
        return new ResponseEntity<List<Float>>(temp, HttpStatus.OK);
    }
}
