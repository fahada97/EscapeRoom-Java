/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication54;

import java.util.Scanner; 
import static javaapplication54.Room1.ui;
/**
 *
 * @author Gab
 */
public class getKnife {
    static Room1 room1 = new Room1();
    static Couch couch = new Couch();
    //create desk object here
    static Desk desk = new Desk();
    static UserInterface ui = new UserInterface();
    String userInput; 
    Scanner keyboard = new Scanner(System.in);
    void printStatement() throws InterruptedException
    {
        ui.printGameOutput("You begin moving the chair..and OH NO!\n" +
        "The chair has snagged on a piece of rug and you toppled over\n" +
        "You feel around to see if anything can help you escape\n" +
        "and you feel around underneath the table and...OUCH! You\n" +
        "grabbed a knife!. Luckily you can now cut yourself free, but you are hurt!\n"+
        "You keep the knife in your pocket.\n\n");
        ui.printGameOutput("In which direction would you like to go?\n\n"); 
        //forward or right is what we are looking for here
        
        String userInput = ui.getGameInput(keys.FORWARD.name(), keys.RIGHT.name()); 
        ForwardORRight(userInput); 
    }
    void ForwardORRight(String u) throws InterruptedException
    {
        if(u == null)
        {
            ui.printGameOutput("\nYou have given up by clicking QUIT!\n");
            ui.restart();
        }
        //if forward
         if(keys.FORWARD.name().equalsIgnoreCase(u))
        {
            ui.printGameOutput("You advance forward in the dark.\n"
                    + "With your hands out in front of you, you find a desk with\n"
                    + "wires leading to a lamp and a phone. You also find a locked drawer.\n");
                    
           desk.printStatement(); 
        }
         //if right
        else if(keys.RIGHT.name().equalsIgnoreCase(u))
        {
            ui.printGameOutput("You are walking towards the right and run into a couch\n");
            couch.printStatement(); 
           
        }
         /*else if(u.equalsIgnoreCase(keyWords[7]))
        {
            //call timer class and function to display the time
            //call the opening scenario again 
        }*/
        else
        {
            //else = a word we dont recognize or a word that will not get the 
            //user out of this situation
            ui.printGameOutput("Sorry, we do not recognize that word\n"); 
            printStatement(); 
        }
    }
}

