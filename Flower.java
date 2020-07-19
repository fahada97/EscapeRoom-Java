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
public class Flower {
    static Couch couch = new Couch();
    static UserInterface ui = new UserInterface();
    static Room1 room1 = new Room1(); //room object
    String userInput;
    //Scanner keyboard = new Scanner(System.in);
    //String keyWords[] = {"throw", "smell"}; 
    void printStatement() throws InterruptedException
    {
        ui.printGameOutput("The aroma of flowers has grown. You feel around and\n"
                + "there are flowers in a glass vase.\n\n");
        ui.printGameOutput("What do you want to do with the flowers in the glass vase?\n\n"); 
        
        //looking for answers: THROW OR SMELL
        userInput = ui.getGameInput(keys.THROW.name(), keys.SMELL.name());
        
        //room1.setUserInput(userInput); 
        ThrowOrSmell(userInput); 
    }
    void ThrowOrSmell(String u) throws InterruptedException
    {
        if(u == null)
        {
            ui.printGameOutput("\nYou have given up by clicking QUIT!\n"); 
            ui.restart();
        }
        else if(keys.THROW.name().equalsIgnoreCase(u))
        {
            ui.printGameOutput("You threw the vase\n"); 
            ui.printGameOutput("You managed to grab a piece of broken glass and cut yourself free!\n");
            ui.printGameOutput("You begin to feel your way through the dark and bump into a couch!\n");
            couch.printStatement();
        }
        else if(keys.SMELL.name().equalsIgnoreCase(u))
        {
            ui.printGameOutput("The flowers smell beautiful\n");
            ui.printGameOutput("Now what do you want to do?\n\n");
            
            userInput = ui.getGameInput(keys.THROW.name(), keys.SMELL.name()); 
            ThrowOrSmell(userInput);
            
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

