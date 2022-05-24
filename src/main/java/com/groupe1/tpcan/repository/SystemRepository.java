package com.groupe1.tpcan.repository;

import org.springframework.stereotype.Repository;

import java.sql.Date;
import java.util.TreeMap;

@Repository
public class SystemRepository {

    /*==================== TEMPERATURE ====================*/


    public float getTemperatureById( long id){
        return 0;
    }

    public TreeMap<Date,Float> getTemperatureSinceDate(Date date){
        return null;
    }

    public TreeMap<Date,Float> getLastXTemperature(int X){
        return null;
    }

    /*==================== VITESSE VENT ====================*/


    public float getVitesseById( long id){
        return 0;
    }

    public TreeMap<Date,Float> getVitesseSinceDate(Date date){
        return null;
    }

    public TreeMap<Date,Float> getLastXVitesse(int X){
        return null;
    }

    /*==================== Position PIPO ====================*/


    public float getPositionById( long id){
        return 0;
    }

    public TreeMap<Date,Float> getPositionSinceDate(Date date){
        return null;
    }

    public TreeMap<Date,Float> getLastXPosition(int X){
        return null;
    }

    /*====================== PARAM ==========================*/

    public float getSeuil(){
        return 0;
    }

    public void setSeuil( float seuil){

    }

    public boolean getHpState(){
        return false;
    }

    public void setHpState( boolean seuil){

    }

    public boolean getSecuServoState(){
        return false;
    }

    public void setSecuServoState( boolean state){

    }







}
