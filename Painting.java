/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication54;

import static javaapplication54.Room1.ui;

/**
 *
 * @author Gab
 */
public class Painting {
  String userInput = " "; 
    UserInterface ui = new UserInterface(); 
    void printStatement() throws InterruptedException
    {
        ui.printGameOutput("The painting is the famous portrait of dogs\n"
                + "playing a game of cards.\n"
                + "The first dog is holding the number 2.\n"
                + "The second is holding the number 3.\nThe third dog is holding the"
                + "number 1.\nThe fourth dog is holding the 4.\n"
                + "At the bottom it says: Arrange the letters to the numbers.\nWhat do you want to do now?"); 
        
        userInput = ui.getGameInput(keys.CODE.name(), keys.BOOKSHELF.name()); 
        CodeBookshelf(userInput); 
    }
    void CodeBookshelf(String u) throws InterruptedException
    {
        if(u == null)
        {
            ui.printGameOutput("\nYou have given up by clicking QUIT!\n"); 
            ui.restart();
        }
        
        else if(keys.CODE.name().equalsIgnoreCase(u))
       {
           CracktheCode code = new CracktheCode(); 
           code.code(); 
       }
       else if(keys.BOOKSHELF.name().equalsIgnoreCase(u))
       {
           Bookshelf bookshelf = new Bookshelf();
           bookshelf.printStatement();
       }
       else
        {
            ui.printGameOutput("Sorry, we do not recognize that word\n");
            printStatement(); 
        }
    }
    /*
    void printStatement
    print: painting of wizard of oz w/ quote "We arent in Kansas anymore"
    ask user what they want to do
    get userinput 
    call CodeBookshelf w/userinput as argument
    
    
    void CodeBookshelf(userInput)
     if userinput = code 
            call code function of code class 
    else if userinput = bookshelf
            call bookshelf print scenario 
    else if userinput= timer
            call timer
            call printstatement of bookshelf
    else 
        ERROR statement 
        call printstatement of bookshelf
    */
}
