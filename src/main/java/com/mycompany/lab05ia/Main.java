/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lab05ia;
import java.util.HashMap;
import
        java.util.List;
import java.util.Map;

/**
 *
 * @author Génesis Cortez
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //CSP
        //Variables
        List<String> variables = List.of("Western Australia", "Northern Territory", "Queensland", "South Australia", "New South Wales", "Victoria", "Tasmania");
        //Dominios
        Map<String, List<String>> domains = new HashMap<>();
        for(var variable:variables){
            domains.put(variable, List.of("rojo", "verde", "azul"));
        }
        //Restricciones
        CSP<String, String> problema = new CSP<>(variables, domains);
        problema.addConstraint(new AustraliaColoringConstraint("Western Australia", "Northern Territory"));
        problema.addConstraint(new AustraliaColoringConstraint("Western Australia", "South Australia"));
        problema.addConstraint(new AustraliaColoringConstraint("Northern Territory", "South Australia"));
        problema.addConstraint(new AustraliaColoringConstraint("Northern Territory", "Queensland"));
        problema.addConstraint(new AustraliaColoringConstraint("South Australia", "Queensland"));
        problema.addConstraint(new AustraliaColoringConstraint("New South Wales", "Queensland"));
        problema.addConstraint(new AustraliaColoringConstraint("New South Wales", "South Australia"));
        problema.addConstraint(new AustraliaColoringConstraint("Victoria", "South Australia"));
        problema.addConstraint(new AustraliaColoringConstraint("New South Wales", "Victoria"));
        problema.addConstraint(new AustraliaColoringConstraint("Tasmania", "Victoria"));
        
        var solution  = problema.backtrack();
        System.out.println(solution);
    }
    
}
