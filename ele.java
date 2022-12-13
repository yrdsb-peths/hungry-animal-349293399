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
    GreenfootImage[] idleRight=new GreenfootImage[8];
    GreenfootImage[] idleLeft=new GreenfootImage[8];
    
    //Direction ele facing
    String facing="right";
    SimpleTimer animationTimer=new SimpleTimer();
    
    public ele()
    {
        for(int i=0; i<idleRight.length; i++)
        {
            idleRight[i]=new GreenfootImage("images/Idle/I"+i+".png");
            idleRight[i].scale(100, 50);
        }
        for(int i=0; i <idleLeft.length; i++)
        {
            idleLeft[i]=new GreenfootImage("images/Idle/I"+i+".png");
            idleLeft[i].mirrorHorizontally();
            idleLeft[i].scale(100, 50);
        }
        
        animationTimer.mark();
        //Initial ele image
        setImage(idleRight[0]);
    }
    int imageIndex=0;
    public void animateElephant()
    {
        if(animationTimer.millisElapsed()<100)
        {
            return;
        }
        animationTimer.mark();
        
        if(facing.equals("right"))
        {
            setImage(idleRight[imageIndex]);
            imageIndex = (imageIndex + 1) % idleRight.length;
        }
        else
        {
            setImage(idleLeft[imageIndex]);
            imageIndex = (imageIndex + 1) % idleLeft.length;
        }
    }
    
    public void act()
    {
        // Add your action code here.

        if(Greenfoot.isKeyDown("left"))
        {
            move(-2);
            facing="left";
        }
        else if (Greenfoot.isKeyDown("right"))
        {
            move(2);
            facing="right";
        }
        if(Greenfoot.isKeyDown("a"))
        {
            move(-10);
            facing="left";
        }
        if(Greenfoot.isKeyDown("d"))
        {
            move(10);
            facing="right";
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
