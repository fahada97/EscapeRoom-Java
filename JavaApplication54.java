/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication54;
import java.*;
import java.util.*;
/**
 *
 * @author Guest 1
 */
public class JavaApplication54 {

   //static Room1 room1 = new Room1(); 
    //static UserInterface ui = new UserInterface(); 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        Room1 room1 = new Room1();
        Room2 room2 = new Room2(); 
        Room3 room3 = new Room3();
        Maze maze = new Maze();
        UserInterface ui = new UserInterface(); 
        //get user input
        ui.setInterface();
        int userInput;
        Scanner keyboard = new Scanner(System.in); 
       // ui.printGameOutput("test output");
        //welcoming message
        //System.out.println("Welcome!"); 
        ui.printGameOutput("Welcome to Escape Room!\n The rules are as follows:\n"
                + "Enter key words to move ahead in the game\n"
                + "***Correct input will only be ONE word long***\n"
                + "Helpful key words will be shown in the dialog box.\n"
                + "The first room will now begin\nGOOD LUCK\n\n\n");
        
        
        //open room 1
        room1.OpeningScenario();
        //after room1 finishes, user moves to room2
        //room2.OpeningScenario(); 
        //after user complete room1 and room2, user moves to room3
        //room3.OpeningScenario();
        
    }
    
 }
    

