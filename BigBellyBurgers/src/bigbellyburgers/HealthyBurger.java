/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bigbellyburgers;

/**
 *
 * @author Eduardo
 */
public class HealthyBurger extends Hamburguer{

    public HealthyBurger(String breadType,String meatType, double price) {
        super(breadType, meatType, price);
        limAdditions=6;
    }
    @Override
    public void getTotal(){
        System.out.println("This is a Healthy Burguer");
        super.getTotal();
    }
}
