
package main;

/**
 *
 * @author coding_java
 */
public class Spawn {
    private Handler handler;
    private Health health;
    private final SpriteSheet ss;
    
    private int scoreNew = 0;
    
    public  Spawn(Handler handler, Health health, SpriteSheet ss){
        this.handler = handler;
        this.health = health;
        this.ss = ss;
    }
    
    public void tick(){
        scoreNew++;
        
        if(scoreNew >= 500){
            scoreNew = 0;
            health.setLevel(health.getLevel() + 1);
            handler.addObject(new Enemy2(scoreNew, scoreNew, ID.Enemy, ss));
        }
    
    }
    
}

