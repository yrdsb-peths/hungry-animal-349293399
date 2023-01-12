import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author Daniel 
 * @version 1.00
 */
public class MyWorld extends World
{
    SimpleTimer TargetTimer = new SimpleTimer();
    public MyWorld()
    {    
        super(800, 800, 1, false);
        
        TargetTimer.mark();
        
        bow bow = new bow();
        
        addObject(bow, -10, -10);
    }
    public int randomNumber(int min, int max)
    {
        int result= Greenfoot.getRandomNumber(max-min+1);
        return result + min;
    }
    public void createTarget()
    {
        Target target = new Target();
        int x=randomNumber(150, 650);
        int y=randomNumber(150, 650);
        addObject(target,x,y);
    }
    public void act(){
        int level=1;
        if(level==1)
        {
            if(TargetTimer.millisElapsed() > 1500){
                createTarget();
                createTarget();
                TargetTimer.mark();
            }
        }
        if(level==2)
        {
            if(TargetTimer.millisElapsed() > 1000){
                createTarget();
                createTarget();
                TargetTimer.mark();
            }
        }
        if(level==3)
        {
            if(TargetTimer.millisElapsed() > 500){
                createTarget();
                createTarget();
                TargetTimer.mark();
            }
        }
    }


}
