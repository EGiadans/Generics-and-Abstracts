/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generics;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author Eduardo
 */

//ESTO ES UNA CLASE GENERICA

public class Team<T extends Player> implements Comparable<Team <T>> { //La T extends PLayer permite meter cualquier tipo de dato
    String name;                        //pero solo Players, no de cualquier cosa como Double o MyRectangle
    int win = 0;
    int draw = 0;
    int lose = 0;
    int played = 0;
    ArrayList<T> members = new ArrayList<>();
    
    public Team(String name) {
        this.name = name;
    }
    
    public String getName(){
        return this.name;
    }
    
    public boolean addPlayer(T p) { //No es una instancia, tiene propiedaddes de Player
        if (members.contains(p)) {
            System.out.println("Player already in team");
            return false;
        }
        members.add(p);
        System.out.println(p.getName()+"picked for team"+this.name);
        return true;
    }
    
    public int numPlayers() {
        return this.members.size();
    }
    
    public void matchResult (Team <T> opponent, int ourScore, int theirScore){
        
        String message;
        
        if (ourScore> theirScore){
            win++;
            message = "beat";
        } else if (ourScore == theirScore) {
            draw++;
            message = "drew with";
        } else {
            lose++;
            message = "lost to";
        }
        if(opponent != null) {
            System.out.println(this.getName() + message + opponent.getName());
            opponent.matchResult(null, theirScore, ourScore);
        }
    
    }
    public int ranking() {
        return (win * 2) + draw;
    }

    @Override
    public int compareTo(Team<T> team) {
        if(this.ranking() > team.ranking()) {
            return -1;
        } else if(this.ranking() < team.ranking()) {
            return 1;
        } else {
            return 0;
        }
    }
    
    
}
