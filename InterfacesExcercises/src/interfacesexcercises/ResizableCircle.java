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
public class ResizableCircle extends Circle implements Resizable {

    public ResizableCircle(double radius) {
        super(radius);
    }

    public ResizableCircle() {
        super();
    }

    @Override
    public void resize(int percentage) {
        radius=radius*=(100+percentage)/100;
    }
    
    
    
    
}
