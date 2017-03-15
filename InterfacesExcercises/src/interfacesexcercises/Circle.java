/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacesexcercises;

/**
 *
 * @author Eduardo
 */
public class Circle implements GeometricObject{
    protected double radius;
    
    public Circle(double radius) {
        this.radius = radius;
    }
    
    public Circle(){
        this.radius=1.0;
    }

    @Override
    public double getPerimeter() {
        return Math.PI*radius*2;
    }

    @Override
    public double getArea() {
        return Math.PI*Math.pow(radius,2);
    }
    
}
