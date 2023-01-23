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
    private int jumpHeight = 10;
    private int walkSpeed = 5;
    private double fallSpeed = 0.4;
    
    
    private boolean airTime = false;
    private double dX = 0;
    private double dY = 0;
    private int groundHeight = getImage().getHeight()/2;
    private int sideWidth = getImage().getWidth()/2;
    private World myWorld;
    int worldHeight;
    int worldWidth;
    
    public void  addedToWorld(World myWorld)
    {
        this.myWorld = myWorld;
        this.worldHeight = myWorld.getHeight();
        this.worldWidth = myWorld.getWidth();
    }
    
    public void act() 
    {
        // Add your action code here.
        
        if(airTime)
        {
            fall();
        }
        else 
        {
            getCommand();
        }
        move();
    }
    
    
    private void run(String direc)
    {
        if(direc=="left")
            dX = walkSpeed*-1;
        else
            dX = walkSpeed;
    }
    
    private void stop()
    {
        dX = 0;
    }
    
    private void jump()
    {
        dY += jumpHeight;
        airTime = true;
    }
    
    private void fall()
    {
        dY -= fallSpeed;
    }
    
    private void move()
    {
        double newX = getX() + dX;
        double newY = getY() - dY;
        setLocation((int)newX, (int)newY);
    }
    
    private void getCommand()
    {
        if(Greenfoot.isKeyDown("left"))
        {
            run("left");
        }
        else if (Greenfoot.isKeyDown("right"))
        {
            run("right");
        }
        else
        {
            stop();
        }
        
        if(Greenfoot.isKeyDown("up"))
        {
            jump();
        }
        
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
