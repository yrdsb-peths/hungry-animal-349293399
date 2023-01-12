import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class bow here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class bow extends Actor
{
    GreenfootImage[] Crosshairs=new GreenfootImage[6];
    int crossCount=0;
    public bow(){
        for(int i=0; i<Crosshairs.length; i++)
        {
            Crosshairs[i] = new GreenfootImage("images/Crosshairs/"+i+".png");
        }
        setImage(Crosshairs[crossCount]);
    }
    //to prevent you from quick scrolling through the crosshairs are breaking the code
    public void pause()
    {
        Greenfoot.delay(1);
    }
    public void checkCross()
    {
        if(Greenfoot.isKeyDown("left"))
        {
            pause();
            if(crossCount==0)
            {
                crossCount=5;
            }
            else
            {
                crossCount--;
            }
            setImage(Crosshairs[crossCount]);
        }
        if(Greenfoot.isKeyDown("right"))
        {
            pause();
            if(crossCount==5)
            {
                crossCount=0;
            }
            else
            {
                crossCount++;
            }
            setImage(Crosshairs[crossCount]);
        }
    }

    public void act(){
        MouseInfo info = Greenfoot.getMouseInfo();
        if(info != null){
            int x = info.getX();
            int y = info.getY();
            setLocation(x, y);
        }
        checkCross();
    }
}
