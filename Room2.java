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
public class Room2 {
     Room2(){}
    
    UserInterface ui = new UserInterface(); 
    String userInput = ""; 
    
    /**
     * opening scenario prints description of the second room
     * takes user input and sends it to the ToolboxOrTable method
     */
    void OpeningScenario() throws InterruptedException
    {
        ui.printGameOutput("\n\nYou climb down the trapdoor and are in a dimly lit room with small windows.\n"
                + "Closest to you in the room are a table and a toolbox on a work bench.\n"
                + "Where would you like to go first?\n"); 
        userInput = ui.getGameInput(keys.TOOLBOX.name(), keys.TABLE.name()); 
        ToolboxOrTable(userInput);      
    }
    
    /**
     * method determines where to send the user based on the input
     * @param u 
     */
    void ToolboxOrTable(String u) throws InterruptedException
    {
        if(u == null)
        {
            ui.printGameOutput("\nYou have given up by clicking QUIT!\n"); 
            ui.restart();
        }
        else if(keys.TABLE.name().equalsIgnoreCase(u))
        {
            Table table = new Table(); 
            table.printStatement(); 
        }
        else if(keys.TOOLBOX.name().equalsIgnoreCase(u))
        {
            Toolbox toolbox = new Toolbox(); 
            toolbox.printStatement(); 
        }
        else
        {
            ui.printGameOutput("\nSorry, we do not recognize that word\n"); 
            OpeningScenario(); 
        }
    }
}
