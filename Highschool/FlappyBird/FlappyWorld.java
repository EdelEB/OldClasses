import greenfoot.*;

/**
 * Write a description of class FlappyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FlappyWorld extends World
{
    int counter=0;
    Score scoreObj = null;
    int score = 0;
    int start = 240;
    public FlappyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1, false); 
        FlappyBird flappy =new FlappyBird();
        addObject(flappy,100,getHeight()/2);
        
        Score score = new Score();
        score.setScore(0);
        addObject(score,getWidth()/2,100);
    }
    
    public void act()
    {
        counter++;
        if(counter%100==0)
        {
            PipeTop tp = new PipeTop();
            PipeBottom bp = new PipeBottom();
            
            int random=(int)(Math.random()*200+275);
            
            addObject(bp,getWidth(),random);
            random-=400;
            addObject(tp,getWidth(),random);
            random+=200;
        }
        
        
    }
}
