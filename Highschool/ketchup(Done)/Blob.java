import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Blob here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Blob  extends Mover
{
    private int life = Greenfoot.getRandomNumber(10)+10;
    
    public void act() 
    {
       move(10.0);
       life--;
       if(life==0)-
       {
          getWorld().addObject(new Splat(), getX(), getY());
          getWorld().removeObject(this);
        }
    }    
}
