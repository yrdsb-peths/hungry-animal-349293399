import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * TitleScreen
 * 
 * @author Daniel 
 * @version December 2022
 */
public class TitleScreen extends World
{
    Label titleLabel = new Label("The Elephant", 60);
    /**
     * Constructor for objects of class TitleScreen.
     * 
     */
    public TitleScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        
        
        addObject(titleLabel, getWidth()/2, 200);
        prepare();
        
    }
    
    public void act()
    {
        if(Greenfoot.isKeyDown("space"))
        {
            MyWorld gameWorld = new MyWorld();
            Greenfoot.setWorld(gameWorld);
        }
    }
    
    private void prepare()
    {
        ele elephant = new ele();
        addObject(elephant, 479,87);

        Label label = new Label("Use space to Start", 40);
        addObject(label,290,255);
        label.setLocation(303,263);
    }
}
