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
public class bar {
    
    UserInterface ui = new UserInterface();
    Pooltable pooltable = new Pooltable();
    Table3 littletable = new Table3();
    DartBoard dartboard = new DartBoard();
    String userInput = "";
    
    /**
     * printStatement describes the bar with a laptop, and what the user options are 
     * userInput is accepted and sent to method CODE.
     */
    
    void printStatement() throws InterruptedException
    {
        ui.printGameOutput("\n\nYou walked to a bar which has laptop with "
                + "password.! \n"
                + "Enter a code to unlock the laptop "); 
        userInput = ui.getPassword(); 
        code(userInput); 
    }
    
    /**
     * this method checks the userinput. if the input is ROYALFLUSH, the laptop and the user can either go to the POOLTABLE or LITTLETABLE.This input will be sent to the pooltableOrLittleTable method.
     * if the input is wrong then the user gets a choice of CARDS or DARTBOARD. This input will be sent to the cardsOrPoolTable method.
     * 
     * @param u 
     */

     void code(String u) throws InterruptedException
    {
        //ui.printGameOutput("\nEnter the code: \n");
        //userInput = ui.getGameInput(); 
        //userInput = ui.getPassword();
        if(userInput == null)
        {
            ui.printGameOutput("\nYou have given up by clicking QUIT!\n"); 
            ui.restart();
        }
        else if(keys.BLACKJACK.name().equalsIgnoreCase(userInput))
        {
            ui.printGameOutput("\nCongrats! You got the code right!\n"
                    + "You unlocked the laptop which shows an article about "
                    + "a necklace."); 
            ui.printGameOutput("\nWhere do you want to go?");
            
            userInput = ui.getGameInput(keys.POOLTABLE.name(), keys.LITTLETABLE.name());
            PoolTableOrLittleTable(userInput);

        }
        else 
        {
            ui.printGameOutput("\nWrong code! You are locked out!\n"
                    + "What would you like to do now?\n"); 
            
            userInput = ui.getGameInput(keys.CARDS.name(), keys.DARTBOARD.name());
            CardsOrDartBoard(userInput);


        }       

    }
     
     /**
      * This method tests the user input. If the input is POOLTABLE, the user is taken to the printstatement method of pooltable class.
      * If the input is LITTLETABLE, the user is taken to the printstatement method of table3 class. 
      * of the table object. 
      */
     void PoolTableOrLittleTable(String u) throws InterruptedException
     {
        if(u == null)
           {
               ui.printGameOutput("\nYou have given up by clicking QUIT!\n"); 
               ui.restart();
           }
           else if(keys.POOLTABLE.name().equalsIgnoreCase(u))
           {
               pooltable.printStatement();
           }
           else if(keys.LITTLETABLE.name().equalsIgnoreCase(u))
           {
               littletable.printStatement();
           }
           else
           {
               ui.printGameOutput("\nPlease enter a choice");
               
               u = ui.getGameInput(keys.POOLTABLE.name(), keys.LITTLETABLE.name());
               PoolTableOrLittleTable(u);

           }

     }
  /**
      * This method tests the user input. If the input is CARDS, the user is taken to the printstatement method of cards class.
      * If the input is DARTBOARD, the user is taken to the printstatement method of dartboard class. 
      * of the table object. 
      */
      void CardsOrDartBoard(String u) throws InterruptedException
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
           else if(keys.DARTBOARD.name().equalsIgnoreCase(u))
           {
               dartboard.printStatement();
           }
           else
           {
               ui.printGameOutput("\nPlease enter a choice");
               
               u = ui.getGameInput(keys.CARDS.name(), keys.DARTBOARD.name());
               CardsOrDartBoard(u);

           }

     }

       
}
