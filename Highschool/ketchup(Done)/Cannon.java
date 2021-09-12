import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Cannon here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cannon  extends Actor
{
    /**
     * Act - do whatever the Cannon wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
       if(Greenfoot.isKeyDown("left"))
       {
           setRotation(getRotation()-5);
       }
       if(Greenfoot.isKeyDown("right"))
       {
           setRotation(getRotation()+5);
       }
       if("space".equals(Greenfoot.getKey()))
       {
           fire();
       }
    }    
    
    /**
     * Fire the cannon.
     */
    private void fire()
    {
       Blob blob = new Blob();
       getWorld().addObject(blob, getX(), getY());
       blob.setRotation(getRotation());
       blob.move(40.0);
    }
}
