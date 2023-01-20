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
    //GreenfootSound dolphinSound = new GreenfootSound();
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(900, 900, 1, false);
        
        Runner runner = new Runner ();
        addObject(runner, 400, 700);
        
        //create label here
        scoreLabel = new Label(0, 80);
        addObject(scoreLabel, 30, 30);
        
        createBullet();
    }
    
    //game ends
    
    public void gameOver()
    {
        //dolphinSound.play();
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
        int x = Greenfoot.getRandomNumber(600);
        int y = 0;
        addObject(bullet, x, y);
    }
}

