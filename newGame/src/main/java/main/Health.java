
package main;

import java.awt.Color;
import java.awt.Graphics;


/**
 * @author coding_java
 */
public class Health {
    //be able to transition from green to red 
    public static int health = 100;
    //rgb value go from 0 which is black to 255
    private int GreenVal = 255;
    public void tick(){
        health = Game.clamp(health, 1, 100);
        GreenVal = Game.clamp(GreenVal, 0, 255);
        GreenVal = health*2;
    }
    
    public void render(Graphics g ){
        g.setColor(Color.black);
        g.fillRect(10, 10, 200, 25);
        g.setColor(new Color(75, GreenVal, 0));
        g.fillRect(10, 10, health * 2, 25);
        g.setColor(Color.white);
        g.drawRect(10, 10, 200, 25);
    }
    
}
