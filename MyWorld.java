import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    public int score = 0;
    Label scoreLabel;
    
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    SimpleTimer Timer = new SimpleTimer();
    int spawnRate = 1;
    boolean canSpawn = true;
    
    public MyWorld()
    {    
        super(900, 900, 1, false);
        
        Runner runner = new Runner ();
        addObject(runner, 400, 700);
        
        //create label here
               
        scoreLabel = new Label(0, 80);
        addObject(scoreLabel, 30, 30);
        createBullet();
    }
    
    public void act()
    {
        if (canSpawn)
    {
        createBullet();
        Timer.mark();
        canSpawn = false;
    }
    if (Timer.millisElapsed()/1000 >= spawnRate)
    {
        canSpawn = true;
    }
    }
    
    //game ends
    
    public void gameOver()
    {
        Label gameOverLabel = new Label("game over", 100);
        addObject(gameOverLabel, 400, 400);
    }
    
    //increase the score
    
    public void increaseScore()
    {
        score++;
        scoreLabel.setValue(score);
    }
    
    public void createBullet()
    {
        Bullet bullet = new Bullet();
        int x = getWidth() - 1;
        int y = Greenfoot.getRandomNumber(900);
        addObject(bullet, x, y);
    }
    

}

