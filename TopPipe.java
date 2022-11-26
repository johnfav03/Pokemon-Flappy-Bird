import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
/**
 * Write a description of class TopPipe here.
 * 
 * @author (your name ) 
 * @version (a version number or a date)
 */
public class TopPipe extends Pipe
{
    int PIPE_SPEED = 4;
    int FIRST_PIPE = 240;
    int pipeCounter = 0;
    int flappyCounter = 0;
    int score = 0;
  // int heightShift = Greenfoot.getRandomNumber(200);
//int PIPE_SPACING = 200;

   /**
     * Act - do whatever the TopPipe wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        setLocation( getX() - PIPE_SPEED, getY());
        //Pipe.setColor(Color.blue);
        //pipeCounter++;
         //if (pipeCounter >= FIRST_PIPE ) {
           // if (flappyCounter % 100 == 0) {
             //   score ++;
               //  }
           // flappyCounter++;
       // }
        //if (score % 10 == 0){
        //PIPE_SPEED ++;    
       
       // }
       
    }    
}
