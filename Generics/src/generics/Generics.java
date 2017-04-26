/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generics;

import java.util.ArrayList;

/**
 *
 * @author Eduardo
 */
public class Generics {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SoccerPlayer jose = new SoccerPlayer(" Jose ");
        SoccerPlayer pedro = new SoccerPlayer(" Pedro ");
        
        SoccerPlayer eduardo = new SoccerPlayer(" Eduardo ");
        SoccerPlayer edder = new SoccerPlayer(" Edder ");
        
        SoccerPlayer javier = new SoccerPlayer(" Javier ");
        SoccerPlayer martin = new SoccerPlayer(" Martin ");
        
        BaseballPlayer jordan = new BaseballPlayer("Jordan");
        
        Team <SoccerPlayer> chivas = new Team(" Chivas ");
        Team <SoccerPlayer> america = new Team(" America ");
        Team <SoccerPlayer> cruzazul = new Team(" Cruz Azul ");
        
        Team <BaseballPlayer> cubs = new Team("cubs");
        
        america.addPlayer(pedro);
        america.addPlayer(jose);
        
        chivas.addPlayer(edder);
        chivas.addPlayer(eduardo);
        
        cruzazul.addPlayer(javier);
        cruzazul.addPlayer(martin);
        
        cubs.addPlayer(jordan);
        
        League <Team<SoccerPlayer>> ligamx = new League("LigaMx"); //Hay que especificar el tipo de jugadores en los equipos
        ligamx.addTeam(america);
        ligamx.addTeam(chivas);
        ligamx.addTeam(cruzazul);
        //ligamx.addTeam(cubs);
        
        chivas.matchResult(america, 2, 1);
        america.matchResult(cruzazul, 2, 3);
        cruzazul.matchResult(chivas, 1, 4);
        america.matchResult(chivas, 5, 1);
        
        ligamx.sortTeams();
        
        
        
    }
    
}
