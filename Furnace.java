/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication54;

/**
 *
 * @author ahmed
 */
public class Furnace {
    UserInterface ui = new UserInterface(); 
    Toolbox toolbox = new Toolbox();
    FilingCabinet cabinet = new FilingCabinet();
    String userInput = ""; 
    
     /**
     * printStatement describes the furnace, and what the user options are 
     * userInput is accepted and sent to method ToolboxOrCabinet.
     */
    void printStatement() throws InterruptedException
    {
        ui.printGameOutput("\n\nYou walked towards the furnace. It is a very "
                + "old and rusty furnace but you are able to read the model number."
                + " The model is: Massachusetts Furnace CO: 18"); 
        ui.printGameOutput("\nWhere do you want to go?");
        
        userInput = ui.getGameInput(keys.TOOLBOX.name(), keys.CABINET.name()); 
        ToolBoxOrCabinet(userInput); 
    }
    /**
     * this method checks the userinput. if the input is TOOLBOX, the user will be taken to the toolbox printstatement method.
     * if the input is cabinet, the user will be taken to the cabinet printstatement method.
     * Wrong inputs will repeat the printstatement.
     * 
     * @param u 
     */
    void ToolBoxOrCabinet(String u) throws InterruptedException
    {
        if(userInput == null)
        {
            ui.printGameOutput("\nYou have given up by clicking QUIT!\n"); 
            ui.restart(); 
        }
        else if(keys.TOOLBOX.name().equalsIgnoreCase(userInput))
        {
            toolbox.printStatement();
        }
        else if(keys.CABINET.name().equalsIgnoreCase(userInput))
        {
            cabinet.printStatement();
        }
        else
        {
            ui.printGameOutput("\nPlease enter a valid command.");
            printStatement();

        }       
    }
}
