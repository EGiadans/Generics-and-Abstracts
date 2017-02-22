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
public class DeluxeBurger extends Hamburguer {

    public DeluxeBurger(String breadType, String meatType, double price,
            Addition addition1, Addition addition2) {
        super(breadType, meatType, price);
        limAdditions=2;
        this.setAddition(addition1);
        this.setAddition(addition2);
    }
     public DeluxeBurger(String breadType, String meatType, double price,
            String name1,double price1, String name2, double price2) {
        super(breadType, meatType, price);
        limAdditions=2;
        this.setAddition(name1, price1);
        this.setAddition(name2, price2);
     }
    @Override
    public void getTotal(){
        System.out.println("This is a Deluxe Burger");
        super.getTotal();
    }
}
