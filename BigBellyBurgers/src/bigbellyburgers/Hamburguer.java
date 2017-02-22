/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bigbellyburgers;
import java.util.*;
/**
 *
 * @author Eduardo
 */
public class Hamburguer {
    private String breadType;
    private String meatType;
    private double price;       //Inicializar el arrayList
    private ArrayList <Addition> additions=new ArrayList <Addition>();
    protected int limAdditions; //Lo hacemos # para poder usarlo en clase hija

    public Hamburguer(String breadType, String meatType, double price) {
        this.breadType = breadType;
        this.meatType = meatType;
        this.price = price;
        this.limAdditions = 4;
    }
    public boolean setAddition(Addition addition){ //El boolean para saber si se pudo agregar el ingrediente o no
        if (additions.size()<this.limAdditions){
           return additions.add(addition);   
        } else{
            System.out.println("Limit Exceeded");
            return false;
        }
               
    }
    public boolean setAddition(String name, double price){
        if (additions.size()<this.limAdditions){
            return additions.add(new Addition(name,price));
        }else{
            System.out.println("Limit Exceeded");
            return false;
        }
    }
    public void getTotal(){
        double total =0;
        System.out.println("This is a " + this.meatType+" burguer in "+
               this.breadType+" with a base price of "+this.price);
        for(Addition ingredientes: this.additions){
            System.out.println("plus "+ingredientes.getName()+" at "
                    + ingredientes.getPrice());
            total+=ingredientes.getPrice();
        }
        System.out.println("With a grand total of "+ total);
    }
}
