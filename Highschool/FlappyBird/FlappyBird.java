import greenfoot.*;

/**
 * Write a description of class FlappyBird here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FlappyBird extends Actor
{
    /**
     * Act - do whatever the FlappyBird wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    double dy=0;
    double g = 1.1;
    double BOOST_SPEED= -7.0;
    int points=0;
    public void act() 
    {
        setLocation(getX(),(int)(getY()+dy));
        dy+=g;
        if(Greenfoot.isKeyDown("space"))
        {
            dy=BOOST_SPEED;
        }
        
        if(dy>0 && dy<=10)
        {
            setRotation(0);
        }
        else if(dy<0)
        {
            setRotation(330);
        }
        else if(dy>10)
        {
            setRotation(50);
        }
        if(getY()>getWorld().getHeight())
        {    
            Actor endText = new GameOver();
            getWorld().addObject(endText,getWorld().getWidth()/2,getWorld().getHeight()/2);
            Greenfoot.stop();
        }
        if(getOneIntersectingObject(PipeTop.class)!=null)
        {
            Actor endText = new GameOver();
            getWorld().addObject(endText,getWorld().getWidth()/2,getWorld().getHeight()/2);
            Greenfoot.stop();
        }
        if(getOneIntersectingObject(PipeBottom.class)!=null)
        {
            Actor endText = new GameOver();
            getWorld().addObject(endText,getWorld().getWidth()/2,getWorld().getHeight()/2);
            Greenfoot.stop();
        }
    } 
}
