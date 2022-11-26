import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
import java.awt.Font;
/**
 * Write a description of class Score here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Score extends Actor
{
    /**
     * Act - do whatever the Score wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Score() 
    {
        GreenfootImage num = new GreenfootImage (80,30);
        
        setImage(num);
        
        
        
        
        
    
    } 
    public void setScore(int Score){
        GreenfootImage num = getImage();
        num.clear();
        Font f = new Font (" Small Fonts", Font.BOLD, 30);
        num.setFont(f);
        //Color c = new Color(127, 127, 130);
        num.setColor(Color.black);        
        num.fill();
        num.setColor(Color.blue);
        num.drawString("" + Score, 30, 30);
        setImage(num);
        
    }
}
