package com.groupe1.tpcan.controller;


import com.groupe1.tpcan.request.ParamRequest;
import com.groupe1.tpcan.service.ParamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@CrossOrigin(origins = {"*"})
@RequestMapping("/param")
public class ParamController {

    @Autowired
    private ParamService service;

    @PostMapping("/")
    public ResponseEntity<?> setParaml(
            @RequestBody ParamRequest request){
        service.setParam(request);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/seuil")
    public ResponseEntity<Float> getSeuil(){
        Float seuil = service.getSeuil();
        return new ResponseEntity<>(seuil, HttpStatus.OK);
    }

    @PostMapping("/seuil")
    public ResponseEntity<?> setSeuil(
            @RequestBody ParamRequest request){
        service.setSeuil(request.getSeuil());
        return new ResponseEntity<>(HttpStatus.OK);
    }


    @GetMapping("/hp")
    public ResponseEntity<Boolean> getHpState(){
        Boolean hpState = service.getHpState();
        return new ResponseEntity<>(hpState, HttpStatus.OK);
    }


    @GetMapping("/securite")
    public ResponseEntity<Boolean> getServoSecurityState(){
        Boolean secuServoState = service.getSecuServoState();
        return new ResponseEntity<>(secuServoState, HttpStatus.OK);
    }


}
