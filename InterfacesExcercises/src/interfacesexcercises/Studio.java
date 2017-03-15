/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacesexcercises;
    import java.util.*;
/**
 *
 * @author Eduardo
 */
public class Studio {
    private List <Player> players;
    
    public Studio(){
        players = new LinkedList<>();
    }
    
    public void addPlayer(Player player){
        players.add(player);
    }
}
