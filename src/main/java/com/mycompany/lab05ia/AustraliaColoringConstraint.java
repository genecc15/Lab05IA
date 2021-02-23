/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lab05ia;
import java.util.Map;
import java.util.List;
/**
 *
 * @author Génesis Cortez
 */
public class AustraliaColoringConstraint extends Constraint<String, String>{
    
    private String place1, place2;
    
    public AustraliaColoringConstraint(String place1, String place2){
        super(List.of(place1, place2));
        this.place1 = place1;
        this.place2 = place2;
    }
    @Override
    public boolean satisfied(Map<String, String> assigment){
        //Chequear que 
        //La variable no se encuentre aun asignada
        if(!assigment.containsKey(place1) || !assigment.containsKey(place2)){
            return true;
        }
        //lugar 1 <> lugar 2
        return !assigment.get(place1).equals(assigment.get(place2));
    }
}
