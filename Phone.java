/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication54;
import java.util.Scanner; 
import static javaapplication54.Flower.room1;
import static javaapplication54.Flower.ui;
import static javaapplication54.Room1.ui;

/**
 *
 * @author Gab
 */
public class Phone {
     //add class objects here to access their functions
     //Code code = new Code();
     //BookShelf bookshelf = new BookShelf();
     Room1 room1 = new Room1();
     Painting painting = new Painting();
     CracktheCode Code = new CracktheCode();
     Bookshelf bookshelf = new Bookshelf();
     Timer timer = new Timer();
     UserInterface ui = new UserInterface();
     Scanner keyboard = new Scanner(System.in);
     void printStatement() throws InterruptedException
    {
        ui.printGameOutput("you try the phone, but there are keys missing 57136\n" +
                            "What do you want to do?\n\n"); 
        
        String userInput = ui.getGameInput(keys.CODE.name(), keys.BOOKSHELF.name(), keys.PAINTING.name());
        CodeBookshelfPainting(userInput);
         
         
    }


     /*
    void printStatement -- no arguments
        print: you try the phone, but there are keys missing 57136
        What do you want to do?
        get userinput 
        call CodeBookshelfPainting function with userInput as argument
        
    */
    
    public void CodeBookshelfPainting(String u) throws InterruptedException
    {
        if(u == null)
        {
            ui.printGameOutput("\nYou have given up by clicking QUIT!\n"); 
            ui.restart();
        }
        else if(keys.CODE.name().equalsIgnoreCase(u))
        {
            Code.code();             
        }
        else if(keys.BOOKSHELF.name().equalsIgnoreCase(u))
        {
             bookshelf.printStatement(); 
        }
        else if(keys.PAINTING.name().equalsIgnoreCase(u))
        {           
            painting.printStatement(); 
        }
       else
        {
            //else = a word we dont recognize or a word that will not get the 
            //user out of this situation
            ui.printGameOutput("Sorry, we do not recognize that word\n"); 
            printStatement(); 
        }
    }
    /*
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
