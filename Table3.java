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
public class Table3 {
    UserInterface ui = new UserInterface(); 
    String userInput = ""; 
    /**
     * method describes the object at the table
     * asks if they want to investigate NECKLACE or NOTE
     * passes userinput to NecklaceOrNote method
     */
    void printStatement() throws InterruptedException
    {
        ui.printGameOutput("\nThe small table is littered with objects.\n"
                + "A whiskey glass is on the table, along with 2 poker chips,\n"
                + "a note, and a necklace.\nDo you want to investigate the NECKLACE or NOTE?\n"); 
        userInput = ui.getGameInput(keys.NECKLACE.name(), keys.NOTE.name()); 
        NecklaceOrNote(userInput); 
    }
    /**
     * if user entered NECKLACE - describes necklace 
     * if user entered NOTE - describes the note
     * user is asked to move to POOLTABLE, CARDS, or TABLE
     * input passed to PooltableOrCardsOrTable method
     * @param u - userinput passed from print statement method
     */
    void NecklaceOrNote(String u) throws InterruptedException
    {
        if(u == null)
        {
            ui.printGameOutput("\nYou have given up by clicking QUIT!\n"); 
            ui.restart();
        }
        else if(keys.NECKLACE.name().equalsIgnoreCase(u))
        {
           ui.printGameOutput("\nThe necklace has 8 large diamonds on it.\n");
           ui.printGameOutput("\nDo you want to move to the POOLTABLE or CARDS or remain at the TABLE?\n"); 
            userInput = ui.getGameInput(keys.POOLTABLE.name(),keys.CARDS.name(), keys.TABLE.name()); 
            PooltableOrCardsOrTable(userInput); 
        }
        else if(keys.NOTE.name().equalsIgnoreCase(u))
        {
            ui.printGameOutput("\nThe note says: Winner, Winner, Chicken Dinner\n"); 
            ui.printGameOutput("\nDo you want to move to the POOLTABLE or CARDS or remain at the TABLE?\n"); 
            userInput = ui.getGameInput(keys.POOLTABLE.name(),keys.CARDS.name(), keys.TABLE.name()); 
            PooltableOrCardsOrTable(userInput); 
        }
        else
        {
            ui.printGameOutput("\nSorry, we do not recognize that word\n"); 
            printStatement();  
        }
        
    }
    /**
     * if user entered CARDS - cards object and print statement called (commented out as Cards file has not been made yet)
     * if user entered POOLTABLE - pooltable object and print statement called
     * if user entered TABLE - print statement called
     * @param u - userinput passed from NecklaceOrNote method
     */
    void PooltableOrCardsOrTable(String u) throws InterruptedException
    {
        if(u == null)
        {
            ui.printGameOutput("\nYou have given up by clicking QUIT!\n");  
            ui.restart();
        }
        else if(keys.CARDS.name().equalsIgnoreCase(u))
        {
          Cards cards = new Cards(); 
          cards.printStatement(); 
        }
        else if(keys.POOLTABLE.name().equalsIgnoreCase(u))
        {
            Pooltable pooltable = new Pooltable(); 
            pooltable.printStatement2(); 
        }
        else if(keys.TABLE.name().equalsIgnoreCase(u))
        {
            printStatement(); 
        }
        else
        {
            ui.printGameOutput("\nSorry, we do not recognize that word\n"); 
            printStatement();  
        }
    }
}
