import greenfoot.*;

public class Space extends World
{
    public Space()
    {    
        super(700, 500, 1); 
        
        //creates and sets player's starting location
        Tank tank = new Tank();
        addObject(tank,getWidth()/2,getHeight()-30);

        //creates and places aliens
        for(int i=40; i<=getHeight()/3; i+=40)
        {
            for(int j=20; j<=getWidth()-80; j+=40)
            {
                addObject(new Alien(),j,i);
            }
        }
    }
}
