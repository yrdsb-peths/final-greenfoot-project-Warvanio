import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class platform here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ground extends Actor
{
    GreenfootImage platform = new GreenfootImage("images/brick.jpg");
    
    
    
    public void act()
    {
        platform.scale(50,50);
        setImage(platform);
    }
}
