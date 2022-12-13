import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public int score=0;
    Label scoreLabel;
    int level=1;
    
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1, false); 
        
        // Create the elepant object
        ele elephant=new ele();
        addObject(elephant,300,300);
        //Create a label
        scoreLabel = new Label(0,80);
        addObject(scoreLabel,50,50);
        
        createApple();
    }
    
    //End Game
    
    public void gameOver()
    {
        Label gameOver=new Label("Game Over",100);
        addObject(gameOver, 300, 200);
    }
    //Increases score
    public void increaseScore()
    {
        score++;
        scoreLabel.setValue(score);
        
        if(score % 5==0)
        {
            level+=1;
        }
    }
    //Creates a new apple at random location at top of screen
    public void createApple()
    {
        Apple apple =new Apple();
        apple.setSpeed(level);
        int x=Greenfoot.getRandomNumber(600);
        int y=0;
        addObject(apple,x,y);
    }
}
