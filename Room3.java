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
public class Room3 {
    UserInterface ui = new UserInterface(); 
    String userInput = ""; 
    
    /**
     * opening scenario prints a description of room 3
     * Called by the main after room 1 and 2 are completed by the user
     * takes user input and sends it to the ToolboxOrTable method
     */
    void OpeningScenario() throws InterruptedException
    {
        ui.printGameOutput("\n\nCongrats! You have made it to Room 3\n"
                + "You are one step closer to escaping.\n\n"
                + "This room is brightly lit, with objects and furniture littering the room.\n"
                + "There is a POOLTABLE across the room and a BAR to your left with a computer on it.\n"
                + "Where do you want to go?"); 
        userInput = ui.getGameInput(keys.POOLTABLE.name(), keys.BAR.name()); 
        PoolTableOrBar(userInput);      
    }
    
    /**
     * Pooltable or Bar method accepts user input passed from OpeningScenario method
     * Method compares input to key words: POOLTABLE and BAR
     * if POOLTABLE - pooltable object created and print statement called (commented out as POOLTABLE file/class has not been created yet)
     * if BAR - bar object created and print statement called (commented out as BAR file has not been created yet)
     * input validation implemented
     * @param u - userinput passed from Opening Scenario method
     */
    void PoolTableOrBar(String u) throws InterruptedException
    {
        if(u == null)
        {
            ui.printGameOutput("\nYou have given up by clicking QUIT!\n"); 
            ui.restart();
        }
        else if(keys.POOLTABLE.name().equalsIgnoreCase(u))
        {
            Pooltable pooltable = new Pooltable(); 
            pooltable.printStatement(); 
        }
        else if(keys.BAR.name().equalsIgnoreCase(u))
        {
            bar Bar = new bar(); 
            Bar.printStatement();
        }
        else
        {
            ui.printGameOutput("\nSorry, we do not recognize that word\n"); 
            OpeningScenario(); 
        }
    }
}
