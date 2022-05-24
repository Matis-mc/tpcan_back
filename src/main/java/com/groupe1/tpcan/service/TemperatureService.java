package com.groupe1.tpcan.service;

import com.groupe1.tpcan.repository.SystemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.List;
import java.util.TreeMap;

@Service
public class TemperatureService {

    @Autowired
    private SystemRepository repository;


    public float getTemperatureById( long id){

        return repository.getTemperatureById(id);
    }

    public TreeMap<Date,Float> getTemperatureSinceDate(Date date){
        return repository.getTemperatureSinceDate(date);
    }

    public List<Float> getLastXTemperature(int nbTemperature){
        return getLastXTemperature(nbTemperature);
    }
}
