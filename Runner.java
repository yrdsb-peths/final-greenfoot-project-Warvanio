import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Dolphin here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Runner extends Actor
{
    //GreenfootSound dolphinSound = new GreenfootSound("dolph.mp3");
    
    public void act() 
    {
        // Add your action code here.
        if(Greenfoot.isKeyDown("left"))
        {
            move(-5);
        }
        else if(Greenfoot.isKeyDown("right"))
        {
            move(5);
        }
        
        eat();
    }
    //eats apple spawns new one
    public void eat()
    {
        if(isTouching(Bullet.class))
        {
            removeTouching(Bullet.class);
            MyWorld world = (MyWorld) getWorld();
            world.createBullet();
            world.increaseScore();
        }
    }
}
