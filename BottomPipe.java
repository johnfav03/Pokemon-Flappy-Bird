
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BottomPipe here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BottomPipe extends Pipe
{
    int PIPE_SPEED = 4;
    int FIRST_PIPE = 240;
    int pipeCounter = 0;
    int flappyCounter = 0;
    int score = 0;
    //int heightShift = Greenfoot.getRandomNumber(200);
//int PIPE_SPACING = 200;
    /**
     * Act - do whatever the BottomPipe wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        setLocation( getX() - PIPE_SPEED, getY()); 
        //pipeCounter++;
         //if (pipeCounter >= FIRST_PIPE ) {
            //if (flappyCounter % 100 == 0) {
              //  score ++;
            //     }
          //  flappyCounter++;
        //}
        //if (score % 100 == 0){
        //PIPE_SPEED ++;    
       
       // }
    }    
}
