import greenfoot.*;

public class Tank extends Actor
{
    private int shotDelay;
    public void act() 
    { 
        //allows player movement to the left
        if(Greenfoot.isKeyDown("left"))
        {
            setLocation(getX()-2,getY());
        }
        //allows player movement to the right
        if(Greenfoot.isKeyDown("right"))
        {
            setLocation(getX()+2,getY());
        }
        //allows player to fire lazer
        if (shotDelay > 0) 
        {
            shotDelay--;
        }
        else
        {
             if (Greenfoot.isKeyDown("space"))
             {
                 fire();
                 shotDelay = 50;
             }
        }

    } 
    
    //creates and sets rotation of new lazer
    private void fire()
    {
       Lazer lazer = new Lazer();
       getWorld().addObject(lazer, getX(), getY());
       lazer.setRotation(-90);
    }
}
