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
public class CracktheCode {
UserInterface ui = new UserInterface(); 
    Rug rug = new Rug();
    String userInput = " "; 
    
    void code() throws InterruptedException
    {
        //ui.printGameOutput("\nEnter the code: \n");
        //userInput = ui.getGameInput(); 
        userInput = ui.getPassword();
        if(userInput == null)
        {
            ui.printGameOutput("\nYou have given up by clicking QUIT!\n"); 
            ui.restart();
        }
        else if(keys.TEAM.name().equals(userInput))
        {
            ui.printGameOutput("Congrats! You got the code right!\n"
                    + "The drawer slides open and reveals the contents inside.\n"
                    + "A medical kit and key are inside."); 
            
            rug.printStatement(); 
        }
        else 
        {
            ui.printGameOutput("\nWrong code! What would you like to do now?\n"); 
            
            userInput = ui.getGameInput(keys.CODE.name(), keys.BOOKSHELF.name(), keys.PAINTING.name()); 
            CodeBookshelfPainting(userInput); 
        }
        
        
    }
    
    void CodeBookshelfPainting(String u) throws InterruptedException
    {
        if(u == null)
        {
            ui.printGameOutput("\nYou have given up by clicking QUIT!\n");
            ui.restart();
        }
       else if(keys.CODE.name().equalsIgnoreCase(u))
       {
           code(); 
       }
       else if(keys.BOOKSHELF.name().equalsIgnoreCase(u))
       {
           Bookshelf bookshelf = new Bookshelf();
           bookshelf.printStatement();
       }
       else if(keys.PAINTING.name().equalsIgnoreCase(u))
       {
            ui.printGameOutput("\nYou walk over to the painting above the couch.\n");
            Painting painting = new Painting(); 
            painting.printStatement(); 
        }
        else
        {
            ui.printGameOutput("Sorry, we do not recognize that word\nWhat would you like to do?"); 
            userInput = ui.getGameInput(keys.CODE.name(), keys.BOOKSHELF.name(), keys.PAINTING.name()); 
            CodeBookshelfPainting(userInput); 
        }
       
    }
    
    /*
    void code
        ask user for code
        get there input
        check if its right
        if code == correct one from key word list
            print: drawer opens and theres a medical kit and key inside. 
            ask user what they want to do now
            get userinput
            call explore function
        else 
            error
            ask user what they want to do
            get userinput
            call BookshelfPaintingCode
    
    
    void CodeBookshelfPainting(String u)
    {
        //make sure to add keywords: CODE, BOOKSHELF, PAINTING, and code word WAIKA to key word list in Room1 file!
        if user entered CODE
            call CODE 
         else if user entered BOOKSHELF
            call bookshelf
         else if user entered PAINTING
            call painting
         else if user entered TIMER
            call timer 
            call print statement of this class again
         else
            ERROR we dont recognize this word
            call print statemnt of this class again
    }
    

*/
    
    
}
