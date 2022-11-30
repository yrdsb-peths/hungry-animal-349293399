import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The World of the elephant
 * 
 * @Daniel Xu
 * @version November 2022
 */
public class ele extends Actor
{
    /**
     * Act - do whatever the ele wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.

        if(Greenfoot.isKeyDown("left"))
        {
            move(-1);
        }
        else if (Greenfoot.isKeyDown("right"))
        {
            move(1);
        }
        //Remove apple if ele eats it
        removeTouching(Apple.class);
    }
}
