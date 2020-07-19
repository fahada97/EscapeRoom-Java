/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication54;

/**
 *
 * @author Gab
 */
public class Pooltable {
    UserInterface ui = new UserInterface(); 
    String userInput = ""; 
    
    /**
     * printStatement describes the pooltable to the user, the objects on it, and displays user options 
     * userInput is accepted and sent to method YesOrNo
     */
    void printStatement() throws InterruptedException
    {
        ui.printGameOutput("\nA magic 8-ball is laying in the middle of the table, among 8 other billiard balls.\n"
                + "Do you want to try and ask it a question?\n"); 
        userInput = ui.getGameInput(keys.YES.name(), keys.NO.name()); 
        YesOrNo(userInput); 
    }
    /**
     * YesOrNo method accepts user input passed from the print Statement method
     * if user enters yes, then the EightBall method is called
     * if user enters no, then they are prompted to enter either BAR or DARTBOARD
     * @param u - userinput passed from print Statement
     */
    void YesOrNo(String u) throws InterruptedException
    {
        if(u == null)
        {
            ui.printGameOutput("\nYou have given up by clicking QUIT!\n"); 
            ui.restart();
        }
        else if(keys.YES.name().equalsIgnoreCase(u))
        {
           EightBall(); 
        }
        else if(keys.NO.name().equalsIgnoreCase(u))
        {
            ui.printGameOutput("\nDo you want to go to the BAR or DARTBOARD?\n"
                    + "Or have you just thought of a question to ask the magic BALL?"); 
            userInput = ui.getGameInput(keys.BAR.name(), keys.DARTBOARD.name(), keys.BALL.name()); 
            BarOrDartBoardOrBall(userInput);  
        }
        else
        {
            ui.printGameOutput("\nSorry, we do not recognize that word\n"); 
            printStatement();  
        }
    }
    /**
     * EightBall method uses a do-while loop to ask the user what question they would like to ask
     * if the input contains the word "DARTBOARD" or "BAR" or "PLAY" there are specific 8-ball messages
     * after receiving an answer from the 8-ball the game asks if you want to continue asking questions
     * if you type anything other than YES, the do-while loop stops and asks where you want to go now
     * the options are: BAR and DARTBOARD
     * BarOrDartBoard() method is called and accepts input
     */
    void EightBall() throws InterruptedException
    {
        String answer; 
        do{
            answer = ""; 
            String u = ""; 
            ui.printGameOutput("\nAsk the magic 8-ball a yes or no question!\n"
                + "HINT: Ask a question pertaining to the BAR or suspicious DARTBOARD on the wall!\n");  
            u = ui.getGameInput(); 
        
            if(u == null)
            {
                ui.printGameOutput("\nYou have given up by clicking QUIT!\n"); 
            }
            else if(u.toLowerCase().contains("dartboard") == true)
            {
                ui.printGameOutput("\nAll signs point to yes\n"); 
            }
            else if(u.toLowerCase().contains("bar") == true)
            {
                ui.printGameOutput("\nMy sources say no\n");
            }
            else if(u.toLowerCase().contains("play") == true)
            {
                ui.printGameOutput("\nBetter not tell you now\n"); 
            }
            else
            {
                ui.printGameOutput("\nCannot predict now\n");
            }
            ui.printGameOutput("\nEnter: YES to ask another question or QUIT to exit the 8-ball\n"); 
            answer = ui.getGameInput(); 
            
            while(!(keys.YES.name().equalsIgnoreCase(answer)) && !(keys.QUIT.name().equalsIgnoreCase(answer)) && answer != null)
            {
                ui.printGameOutput("\nIncorrect input.\n"); 
                ui.printGameOutput("\nEnter: YES to ask another question or QUIT to exit the 8-ball\n"); 
                answer = ui.getGameInput(keys.YES.name(), keys.QUIT.name());  
            }
        }while(keys.YES.name().equalsIgnoreCase(answer));
        
        ui.printGameOutput("\nWhat do you want to do now? Go investigate the BAR, DARTBOARD\n"
                + ", or have you thought of another question for the magic BALL?\n"); 
        userInput = ui.getGameInput(keys.BAR.name(), keys.DARTBOARD.name(), keys.BALL.name());
        BarOrDartBoardOrBall(userInput); 
    }
    /**
     * method accepts user input from Eightball and YesOrNo method
     * if user enters BAR - bar object and print statement called (commented out now as Bar file/class have not been created)
     * if user enters DartBoard - dartboard object and print statement called 
     * @param u 
     */
    void BarOrDartBoardOrBall(String u) throws InterruptedException
    {
        if(u == null)
        {
            ui.printGameOutput("\nYou have given up by clicking QUIT!\n"); 
            ui.restart();
        }
        else if(keys.BAR.name().equalsIgnoreCase(u))
        {
            bar Bar = new bar();
            Bar.printStatement(); 
        }
        else if(keys.DARTBOARD.name().equalsIgnoreCase(u))
        {
            DartBoard dart = new DartBoard(); 
            dart.printStatement(); 
        }
        else if(keys.BALL.name().equalsIgnoreCase(u))
        {
            EightBall(); 
        }
        else
        {
            ui.printGameOutput("\nSorry, we do not recognize that word\n"); 
            userInput = ui.getGameInput(keys.BAR.name(), keys.DARTBOARD.name(), keys.BALL.name());
            BarOrDartBoardOrBall(userInput); 
        }
    }
    /**
     * method is called when user returns to pooltable
     * asks to PLAY or pick up BALL
     * passes user input to PlayOrBall method
     */
    void printStatement2() throws InterruptedException
    {
        ui.printGameOutput("\nDo you want to PLAY? Or do you want to pick up the 8-BALL?\n"); 
        userInput = ui.getGameInput(keys.PLAY.name(), keys.BALL.name()); 
        PlayOrBall(userInput); 
    }
    /**
     * accepts user input from printStatement2
     * if user entered PLAY - output is displayed and printStatement2 called again
     * if user entered BALL - they are given the key
     * @param u - user input passed from printStatement2
     */
    void PlayOrBall(String u) throws InterruptedException
    {
        if(u == null)
        {
            ui.printGameOutput("\nYou have given up by clicking QUIT!\n");
            ui.restart();
        }
        else if(keys.PLAY.name().equalsIgnoreCase(u))
        {
           ui.printGameOutput("\nThere are no pool sticks.\n"); 
           printStatement2(); 
        }
        else if(keys.BALL.name().equalsIgnoreCase(u))
        {
            ui.printGameOutput("\nThere is a small clanking noise as you lift the 8-ball!\n"
                    + "You throw it on the floor and the ball shatters, leaving a small\n"
                    + "key in its wake. You can unlock the door!\n");  
            Maze maze = new Maze(); 
            maze.OpeningScenario();
        }
        else
        {
            ui.printGameOutput("\nSorry, we do not recognize that word\n"); 
            printStatement2();  
        }
    }
}
