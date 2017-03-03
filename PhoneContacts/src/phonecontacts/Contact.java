/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phonecontacts;

/**
 *
 * @author Eduardo
 */
public class Contact { //Atributes
    private String name;
    private int number;

    public Contact(String name, int number) { //Constructor
        this.name = name;
        this.number = number;
    }
    //Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
    
    @Override
    public String toString(){
        return name+": "+number;
    }
    
    
    
}
