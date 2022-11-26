import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import greenfoot.GreenfootSound;
/**
 * Write a description of class FlappyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FlappyWorld extends World
{
    int pipeCounter = 0;
    int flappyCounter = 0;
    int PIPE_SPEED = 4;
    int heightShift = Greenfoot.getRandomNumber(200);
    int PIPE_SPACING = 400;
    int score = 0;
    int FIRST_PIPE = 240;
    Score scoreObj = null;
    /**
     * Constructor for objects of class FlappyWorld.
     * 
     */
    public FlappyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1, false);
       // GreenfootSound(103-title-main-theme);
        setPaintOrder(GameOver.class, Pipe.class, FlappyBird.class, Score.class);

        FlappyBird flappy = new FlappyBird();
        addObject(flappy, 100, getHeight()/2);

        scoreObj = new Score();
        scoreObj.setScore(0);
        addObject(scoreObj, 40, 20);

        
       
 
        prepare();
    }

    public void act() {
        pipeCounter++;

        if(pipeCounter % 100 == 0){

 
            int heightShift =  Greenfoot.getRandomNumber(150);
            BottomPipe botPipe = new BottomPipe();    
            GreenfootImage botImage = botPipe.getImage();
            addObject(botPipe, getWidth(), getHeight()/2 + botImage.getHeight()/2 + heightShift);

            TopPipe topPipe = new TopPipe();
            GreenfootImage topImage = topPipe.getImage();
            addObject(topPipe, getWidth(), getHeight()/2 + botImage.getHeight()/2 - (430 - heightShift) );

        }


 

        if (pipeCounter >= FIRST_PIPE ) {
            if (flappyCounter % 100 == 0) {
                score ++;
                scoreObj.setScore(score);
            }
            flappyCounter++;
        }

    }

    /**
     * Prepare the world for the start of the program. That is: create the initial
     * objects and add them to the world.
     */
    private void prepare()
    {
    }
}        
      