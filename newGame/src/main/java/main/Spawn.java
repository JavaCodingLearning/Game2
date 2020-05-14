
package main;

/**
 *
 * @author coding_java
 */
public class Spawn {
    private Handler handler;
    private Health health;
    
    private int scoreNew = 0;
    
    public  Spawn(Handler handler, Health health){
        this.handler = handler;
        this.health = health;
    }
    
    public void tick(){
        scoreNew++;
        
        if(scoreNew >= 500){
            scoreNew = 0;
            health.setLevel(health.getLevel() + 1);
        }
    
    }
    
}

//could have a score system or a timer ??
//once that score reaches a certain value. 


/* 
Updates:
- Added a new class health that contains a health bar - this 
decreases by a factor everytime a enemy hits a player. The health class
also contains a score that goes up through incrementing score.

Once 
- Added a new class called Spawn.  When 
the score passes 500 the level increases by 1. 

*/