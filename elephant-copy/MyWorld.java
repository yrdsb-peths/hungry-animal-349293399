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
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        ele elephant=new ele();
        addObject(elephant,300,300);
        createApple();
    }
    //Creates a new apple at random location at top of screen
    public void createApple()
    {
        Apple apple =new Apple();
        int x=Greenfoot.getRandomNumber(600);
        int y=0;
        addObject(apple,x,y);
    }
}