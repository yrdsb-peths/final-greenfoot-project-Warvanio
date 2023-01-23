import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Bullet extends Actor
{
    /**
     * Act - do whatever the Bread wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
   
    

    
    public void act() 
    {

	
        setLocation(getX() - 4, getY());
        
        
        //end game
        MyWorld world = (MyWorld) getWorld();
        if(getX() <= 0)
        {
            //world.gameOver();
            world.increaseScore();
            world.removeObject(this);
            
        }
    }    
}
