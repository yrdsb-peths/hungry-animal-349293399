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
            move(-2);
        }
        else if (Greenfoot.isKeyDown("right"))
        {
            move(2);
        }
        //Remove apple if ele eats it
        eat();
    }
    //Eat the apple and create a new one
    public void eat()
    {
        if(isTouching(Apple.class))
        {
            removeTouching(Apple.class);
            MyWorld world=(MyWorld) getWorld();
            world.createApple();
            world.increaseScore();
        }
    }
}
