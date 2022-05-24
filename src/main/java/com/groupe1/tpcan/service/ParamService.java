package com.groupe1.tpcan.service;

import com.groupe1.tpcan.repository.SystemRepository;
import com.groupe1.tpcan.request.ParamRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

@Service
public class ParamService {

    @Autowired
    private SystemRepository repository;

    public void setParam(ParamRequest request){
        repository.setSecuServoState(request.isSecuServoState());
        repository.setHpState(request.isHpState());
        repository.setSeuil(request.getSeuil());
    }

    public float getSeuil(){
        return repository.getSeuil();
    }

    public void setSeuil( float seuil){
        repository.setSeuil(seuil);
    }

    public boolean getHpState(){
        return repository.getHpState();
    }

    public void setHpState( boolean seuil){
        repository.setHpState(seuil);
    }

    public boolean getSecuServoState(){
        return repository.getSecuServoState();
    }

    public void setSecuServoState( boolean state){
        repository.setSecuServoState(state);
    }

}
