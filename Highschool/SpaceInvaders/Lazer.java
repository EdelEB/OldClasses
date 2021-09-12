import greenfoot.*;

public class Lazer extends Actor
{
    private int delay=1;
    
    public void act() 
    {
        move(5);
    
        if(getOneIntersectingObject(Alien.class)!=null)
        {
            //getWorld().removeObject(Alien.class);
            if(delay>0)
                delay--;
            else
            {
                getWorld().removeObject(this);
            }
        }
        else
        {
            if(getY()<=0)
                getWorld().removeObject(this);
        }
    }    
}
