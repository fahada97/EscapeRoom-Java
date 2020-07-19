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
public class Table {
    UserInterface ui = new UserInterface(); 
    String userInput = ""; 
    
    /**
     * printStatement describes the table, location in the room, and what the user options are 
     * userInput is accepted and sent to method UnderOrCandle
     */
    void printStatement() throws InterruptedException
    {
        ui.printGameOutput("\n\nYou reach the small table. The table has a\n"
                + "candle on it and a tablecloth across it, hiding what could\n"
                + "be underneath. Would you like to look UNDER the table or\n"
                + "light the CANDLE"); 
        userInput = ui.getGameInput(keys.UNDER.name(), keys.CANDLE.name()); 
        UnderOrCandle(userInput); 
    }
    /**
     * UnderOrCandle method accepts userInput and compares it to UNDER and CANDLE
     * If user enters UNDER then describe the situation, ask for userInput and send String to CabinetOrFurnace
     * If user enters CANDLE then describe the situation, ask for userINput, and send String to CabinetOrFurnace
     * @param u - userInput String passed from the printStatement
     */
    void UnderOrCandle(String u) throws InterruptedException
    {
        if(u == null)
        {
            ui.printGameOutput("\nYou have given up by clicking QUIT!\n"); 
            ui.restart();
        }
        else if(keys.UNDER.name().equalsIgnoreCase(u))
        {
            
            ui.printGameOutput("\n\nNothing is there. Closest to you now are the\n"
                    + "filing CABINET and the FURNACE. Where do you want to go?");
            userInput = ui.getGameInput(keys.CABINET.name(), keys.FURNACE.name()); 
            CabinetOrFurnace(userInput); 
        }
        else if(keys.CANDLE.name().equalsIgnoreCase(u))
        {
            ui.printGameOutput("\n\nYou light the candle, but the room was already lit.\n"
                    + "Closest to you now are thefiling CABINET and the FURNACE.\n"
                    + "Where do you want to go?");
            userInput = ui.getGameInput(keys.CABINET.name(), keys.FURNACE.name()); 
            CabinetOrFurnace(userInput); 
        }
        else
        {
            ui.printGameOutput("\nSorry, we do not recognize that word\n"); 
            printStatement();  
        }
    }
    /**
     * CabinetOrFurnace method accepts a String, the userInput
     * method compares input to CABINET or FURNACE
     * depending on which choice the user made, an object is created from the respective class and the print statement is called
     * @param u - String userInput passed from UnderOrCandle. 
     */
    void CabinetOrFurnace(String u) throws InterruptedException
    {
        if(u == null)
        {
            ui.printGameOutput("\nYou have given up by clicking QUIT!\n"); 
            ui.restart();
        }
        else if(keys.CABINET.name().equalsIgnoreCase(u))
        {
            FilingCabinet cabinet = new FilingCabinet(); 
            cabinet.printStatement(); 
        }
        else if(keys.FURNACE.name().equalsIgnoreCase(u))
        {
            Furnace furnace = new Furnace(); 
            furnace.printStatement(); 
        }
        else
        {
            ui.printGameOutput("\nSorry, we do not recognize that word\n"); 
            userInput = ui.getGameInput(keys.CABINET.name(), keys.FURNACE.name()); 
            CabinetOrFurnace(userInput); 
        }
    }
}
