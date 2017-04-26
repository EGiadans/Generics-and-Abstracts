/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generics;

import java.util.ArrayList;
//import java.util.Arrays;
import java.util.Collections;

/**
 *
 * @author Eduardo
 */
public class League <x extends Team>{
    String name;
    ArrayList <x> teams = new ArrayList<>();
    
    public League(String name) {
        this.name=name;
    } 
    
    public String getName(){
        return this.name;
    }
    
    public boolean addTeam(x equipo){
        if (teams.contains(equipo)){
            System.out.println("El equipo ya existe");
            return false;
        }else{
            teams.add(equipo);
            System.out.println("El equipo "+equipo.getName()+" fue agregado exitosamente");
            return true;
        }
    }
    
    public void sortTeams() {
        Collections.sort(teams);
        for (x temporal : teams){
            System.out.println(temporal.getName()+" : "+ temporal.ranking());
        }
        
        
    }
    
}
