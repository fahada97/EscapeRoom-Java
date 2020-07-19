/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication54;

import static javaapplication54.Flower.ui;
import static javaapplication54.Room1.ui;


/**
 *
 * @author Gab
 */
public class Desk {
   String userInput; 
    UserInterface ui = new UserInterface(); 
    Room1 room1 = new Room1(); 
    Phone phone = new Phone(); 
    
    void printStatement() throws InterruptedException
    {
        ui.printGameOutput("\nWith your hands out in front of you, you find a desk.\n"
    + "The desk has multiple wires leading to a phone and a lamp.\n"
                +"You also pull on a mysterious, locked drawer.\n"+
                "What would you like to try first?\n"); 
        
        userInput = ui.getGameInput(keys.PHONE.name(), keys.LAMP.name()); 
        PhoneORLamp(userInput); 
    }
    
/*
    -Options we are looking for: phone OR lamp 
    -Make sure to add the PHONE and LAMP keyword to the keyword array in the Room1 file
    
    -userInput = ui.getUserInput()
    - PhoneORLamp(userInput)
    -end of print statement function*/


    void PhoneORLamp(String u) throws InterruptedException
    {
        if(u == null)
        {
            ui.printGameOutput("\nYou have given up by clicking QUIT!\n");  
            ui.restart();
        }
        else if(keys.PHONE.name().equalsIgnoreCase(u))
        {
            ui.printGameOutput("\nYou touch the keypad and realize there are keys missing\n"
                    + "on the keypad. You cannot see which ones are missing as the room is still dark.\n"
                    + "What do you want to do?\n"); 
            
            userInput = ui.getGameInput(keys.PHONE.name(), keys.LAMP.name()); 
            PhoneORLamp(userInput); 
        }
        else if(keys.LAMP.name().equalsIgnoreCase(u))
        {
            ui.printGameOutput("\nYou turn the lamp on and see a bookshelf across the room\n"
                    + "with only 4 books littering the shelves and a large painting above\n"
                    + "the couch on the other side of the room. The painting has a small\n"
                    + "quote on it. On the desk you see a keypad next to the locked drawer.\n"
                    + "It looks like it will allow a 4 letter/number password.\n");
            phone.printStatement(); 
        }
        /*else if u.equalsIgnoreCase(room1.keyWords[location of TIMER]
        call timer class to display time to user
        call print Scenario (in this desk class) to get user input for this scenario*/
        else
        {
            ui.printGameOutput("Sorry, we do not recognize that word\n\n"); 
            printStatement(); 
        }
    }
    
    //all pseudo code below has been implemented******************************************
    
   /* if u.equalsIgnoreCase(room1.keyWords[location of PHONE]
         print: you feel there are keys missing but cannot see which ones. What do you want to do
         get userinput 
         PhoneORLamp(userInput) 
       
        
    else if u.equalsIgnoreCase(room1.keyWords[location of LAMP]
        print: you turn the lamp on and see a bookshelf across the room with only 5 books
        and a large painting above the couch with a small quote. On the desk you see 
        a keypad next to the locked drawer! 
        The keypad will allow a password of 5 characters. 
    
        Phone class print statement

    else if u.equalsIgnoreCase(room1.keyWords[location of TIMER]
        call timer class to display time to user
        call print Scenario (in this desk class) to get user input for this scenario

    else
        //else = a word we dont recognize or a word that will not get the 
            //user out of this situation
            ui.printGameOutput("Sorry, we do not recognize that word\n"); 
            printStatement(); 
    
    */
    
  
    
}

