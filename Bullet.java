import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Bullet extends Actor
{
    /**
     * Act - do whatever the Bread wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    

    
    public void act() 
    {
        
        setLocation(getY(), getX() + 4);
        
        
        //end game
        MyWorld world = (MyWorld) getWorld();
        if(getX() >= world.getWidth())
        {
            //world.gameOver();
            world.removeObject(this);
            ;
        }
    }    
}
