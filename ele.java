import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The World of the elephant
 * 
 * @Daniel Xu
 * @version November 2022
 */
public class ele extends Actor
{
    GreenfootSound elephantSound = new GreenfootSound("elephant-trumpets-growls-6047.mp3");
    GreenfootImage[] idle=new GreenfootImage[8];
    
    public ele()
    {
        for(int i=0; i<idle.length; i++)
        {
            idle[i]=new GreenfootImage("images/Idle/I"+i+".png");
            idle[i].scale(100, 50);
        }
        setImage(idle[0]);
    }
    int imageIndex=0;
    public void animateElephant()
    {
        setImage(idle[imageIndex]);
        imageIndex = (imageIndex + 1) % idle.length;
    }
    
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
        
        //Animate the elephant
        animateElephant();
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
            elephantSound.play();
        }
    }
}
