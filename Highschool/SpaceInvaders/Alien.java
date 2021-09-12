import greenfoot.*;

public class Alien extends Actor
{
    private int delay=130;
    private int delay2=0;
    public void act() 
    {
        //ends game when aliens reach the bottom
        if(getY()>=450)
        {
            Explosion explosion = new Explosion();
    //        getWorld().addObject(explosion,getWorld().getObject(tank).getX(),getWorld().getObject(tank).getY());
    //        getWorld().removeObject(tank);getWorld().getObject(tank).getX(),getWorld()
            System.out.println("You Lose");
            Greenfoot.stop();
        }
        //controls the speed and direction of alien movements
        if(delay!=0)
        {
            delay--;
            if(delay2<65)
            {
                delay2++;
                move(1);
            }
            else if(delay2>=65&&delay2<130)
            {
                move(-1);
                delay2++;
            }
            else
                delay2=0;
        }
        else
        {
            setLocation(getX(),getY()+20);
            delay=150;
        }
        //removes alien when hit by a lazer
        if(getOneIntersectingObject(Lazer.class)!=null)
        {
            Explosion explosion = new Explosion();
            getWorld().addObject(explosion,getX(),getY());
            getWorld().removeObject(this);
        }
    }
}
