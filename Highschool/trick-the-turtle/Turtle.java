import greenfoot.*; 

/**
 * This is a turtle in a first, simple video game. It can be controlled 
 * with the cursor keys and likes to eat lettuce.
 */
public class Turtle extends Animal
{
    private int points = 0;

    public void act()
    {
        move(4);
        checkKeys();
        tryToEat();
    }

    /**
     * Check whether the control keys are being pressed, and turn
     * if they are.
     */
    public void checkKeys()
    {
        if ( Greenfoot.isKeyDown("left") )
        {
            turn(-5);
        }
        if ( Greenfoot.isKeyDown("right") )
        {
            turn(5);
        }
    }

    /**
     * Check whether we can see Lettuce or bugs. If we can, eat it.
     */
    public void tryToEat()
    {
        if (canSee(Lettuce.class) )
        {
            eat(Lettuce.class);
            points++;
            Greenfoot.playSound("slurp.wav");
        }
        
        if (canSee(Bug.class) )
        {
            eat(Bug.class);
            points = points+5;
            Greenfoot.playSound("slurp.wav");
            createNewBug();
        }
        
        if (points == 15) {
            gameOver();
        }
    }

    /**
     * Create a new bug and insert it at a random location in the world.
     */
    private void createNewBug()
    {
        Bug newBug;
        newBug = new Bug();
        
        World world;
        world = getWorld();
        
        int worldWidth = world.getWidth();
        int worldHeight = world.getHeight();
        
        int x = Greenfoot.getRandomNumber(worldWidth);
        int y = Greenfoot.getRandomNumber(worldHeight);
        
        world.addObject(newBug, x, y);
    }
    
    /**
     * We have won the game.
     */
    public void gameOver()
    {
        Greenfoot.playSound("fanfare.wav");
        Greenfoot.stop();
    }
}
