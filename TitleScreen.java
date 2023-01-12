import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TitleScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TitleScreen extends World
{
    public int level=1;
    /**
     * Constructor for objects of class TitleScreen.
     * 
     */
    public TitleScreen()
    {    
        //creating size+labels
        super(800, 800, 1); 
        Label titleLabel = new Label("Aim Game",100);
        addObject(titleLabel,400,200);
        
        bow bow = new bow();
        
        addObject(bow, -10, -10);
    }
    public void act()
    {
        if(Greenfoot.isKeyDown("space"))
        {
            MyWorld gameWorld = new MyWorld();
            Greenfoot.setWorld(gameWorld);
        }
        if(Greenfoot.isKeyDown("1"))
        {
            level=1;
        }
        if(Greenfoot.isKeyDown("2"))
        {
            level=2;
        }
        if(Greenfoot.isKeyDown("3"))
        {
            level=3;
        }
    }
}
