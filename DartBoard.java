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
public class DartBoard {
    UserInterface ui = new UserInterface(); 
    String userInput = ""; 
    /**
     * method prints a description of the dartboard 
     * asks for user input: CARDS or TABLE
     * passes user input to CardsOrTable method
     */
    void printStatement() throws InterruptedException
    {
        ui.printGameOutput("\nThe dartboard is hung on the wall with 4 darts scattered\n"
                + "around the board. One dart is at 9 points, the second is at 1 point, \n"
                + "the third is at 5 points, and the fourth is at 6 points.\n"
                + "Do you want to investigate the CARDS on the floor or\n"
                + "the small TABLE with objects littered across it?\n"); 
        userInput = ui.getGameInput(keys.CARDS.name(), keys.TABLE.name());
        CardsOrTable(userInput);
    }
    /**
     * if user entered CARDS - cards object and print statement called (commented out for now)
     * if user entered TABLE - table object and print statement called
     * @param u - userinput passed from print statement method
     */
    void CardsOrTable(String u) throws InterruptedException
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
        else if(keys.TABLE.name().equalsIgnoreCase(u))
        {
            Table3 table3 = new Table3(); 
            table3.printStatement(); 
        }
        else
        {
            ui.printGameOutput("\nSorry, we do not recognize that word\n"); 
            printStatement();  
        }
    }
}
