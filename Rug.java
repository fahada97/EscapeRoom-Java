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
public class Rug {
    UserInterface ui = new UserInterface(); 
    Room2 room2 = new Room2(); 
    void printStatement() throws InterruptedException
    {
        ui.printGameOutput("Further exploring the room, you trip over a rug and find a trap door."
                + "\nYou use the key and you are free!");
        room2.OpeningScenario();
    }
}
