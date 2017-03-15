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
public class MovableCircle implements Movable{ //REVISAR CONSTRUCTOR
    private int radius;
    private MovablePoint center;

    
    
    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
        this.radius = radius;
        this.center = new MovablePoint(x, y, xSpeed, ySpeed);
    }

    @Override
    public String toString() {
        return "MovableCircle{" + "radius=" + radius + ", center=" + center + '}';
    }
    
    
    
    @Override
    public void moveUp() {
        this.center.y+=this.center.ySpeed;
    }

    @Override
    public void moveDown() {
        this.center.y-=this.center.ySpeed;
    }

    @Override
    public void moveLeft() {
       this.center.x-=this.center.xSpeed;
    }

    @Override
    public void moveRight() {
        this.center.x+=this.center.xSpeed;
    }
    
    
    
}
