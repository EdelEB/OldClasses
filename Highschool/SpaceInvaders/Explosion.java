import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Explosion extends Actor
{
    GifImage myGif=new GifImage("explosion.gif");
    private int delay = 0;
    public void act() 
    {
        for(GreenfootImage image:myGif.getImages())
        {
            image.scale(60,60);
        }
        
        setImage(myGif.getCurrentImage());
        if(delay<10)
            delay++;
        else
            getWorld().removeObject(this);
    }    
}
