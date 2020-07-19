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
public class Toolbox {
    UserInterface ui = new UserInterface(); 
    Table table = new Table();
    Room3 room3 = new Room3();
    String userInput = ""; 
    
    /**
     * printStatement describes the toolbox, location in the room, and what the user options are 
     * userInput is accepted and sent to method CODE.
     */
    void printStatement() throws InterruptedException
    {
        ui.printGameOutput("\n\nYou walked towards the workbench and examined the"
                + " toolbox. The toolbox is locked! \n"
                + "Enter a code to unlock the toolbox "); 
        userInput = ui.getPassword(); 
        code(userInput); 
    }
    
    /**
     * this method checks the user input. if the input is 1002, the toolbox is unlocked and the key is acquired.
     * if the input is wrong then the user gets a choice of TRYAGAIN or MOVE. This input will be sent to the tryAgainOrMove method.
     * 
     * @param u 
     */
    
     void code(String u) throws InterruptedException
    {
        if(u == null)
        {
            ui.printGameOutput("\nYou have given up by clicking QUIT!\n");
            ui.restart();
        }
        else if(keys.MIT.name().equals(u))
        {
            ui.printGameOutput("Congrats! You got the code right!\n"
                    + "You opened the toolbox and acquired the key"); 
            room3.OpeningScenario();
        }
        else 
        {
            ui.printGameOutput("\nWrong code!\n"
                    + "HINT: The number at the furnace points to a number at the cabinet.\n"
                    + "What would you like to do now?\n"); 
            
            tryAgainOrMove();
            
            
        }       
        
    }
     
     /**
      * This method tests the user input. If the input is TRYAGAIN, the user is taken back to the printstatement method.
      * If the input is MOVE, the user can enter CABINET or FURNACE and this input is passed to the CabinetOrFurnace method 
      * of the table object. 
      */
     void tryAgainOrMove() throws InterruptedException
     {
        userInput = ui.getGameInput(keys.TRYAGAIN.name(), keys.MOVE.name()); 
        if(userInput == null)
           {
               ui.printGameOutput("\nYou have given up by clicking QUIT!\n"); 
               ui.restart();
           }
           else if(keys.TRYAGAIN.name().equalsIgnoreCase(userInput))
           {
               printStatement();
           }
           else if(keys.MOVE.name().equalsIgnoreCase(userInput))
           {
               ui.printGameOutput("\nWhere do you want to go?");
               
               userInput = ui.getGameInput(keys.CABINET.name(), keys.FURNACE.name());
               table.CabinetOrFurnace(userInput);
           }
           else
           {
               ui.printGameOutput("\nPlease enter a choice");
               
               tryAgainOrMove();

           }
         
     }
}
