package com.groupe1.tpcan.service;

import com.groupe1.tpcan.repository.SystemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.List;
import java.util.TreeMap;

@Service
public class PipoService {

    @Autowired
    private SystemRepository repository;


    public float getPositionById( long id){

        return repository.getPositionById(id);
    }

    public TreeMap<Date,Float> getPositionSinceDate(Date date){

        return repository.getPositionSinceDate(date);
    }

    public TreeMap<Date,Float> getLastXPosition(int nbPosition){

        return repository.getLastXPosition(nbPosition);
    }


}
