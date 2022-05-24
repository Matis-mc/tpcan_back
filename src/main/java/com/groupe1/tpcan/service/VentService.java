package com.groupe1.tpcan.service;

import com.groupe1.tpcan.repository.SystemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.List;
import java.util.TreeMap;

@Service
public class VentService {

    @Autowired
    private SystemRepository repository;

    public float getVitesseById( long idVitesse){

        return repository.getVitesseById(idVitesse);
    }

    public List<Float> getVitesseSinceDate(Date date){
        return getVitesseSinceDate(date);
    }

    public TreeMap<Date,Float> getLastXVitesse(int nbVitesse){

        return repository.getLastXVitesse(nbVitesse);
    }

}
