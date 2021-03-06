import greenfoot.*;
import java.awt.Color;
import java.awt.Font;

public class Score extends Actor
{
    public Score()
    {
        GreenfootImage newImage = new GreenfootImage(100,50);
        setImage(newImage);
    }
    
    public void setScore(int score)
    {
        GreenfootImage newImage = getImage();
        newImage.clear();
        Font f = new Font("Comic Sans MS", Font.PLAIN, 24);
        newImage.setFont(f);
        Color c = new Color(127,127,190,0);
        newImage.setColor(c);
        newImage.fill();
        newImage.setColor(Color.black);
        newImage.drawString(""+score, 30, 30);
        setImage(newImage);
    }
}
