/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lab05ia;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Génesis Cortez
 */
public abstract class Constraint <V, D> {
    protected List<V> variables;
    
    public Constraint(List<V> variables){
        this.variables = variables;
    }
    
    public abstract boolean satisfied(Map<V, D> assigment);
}
