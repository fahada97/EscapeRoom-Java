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
public class FilingCabinet {
    UserInterface ui = new UserInterface(); 
    String userInput = ""; 
    
    /**
     * printStatement describes the filing cabinet and what the user options are 
     * userInput is accepted and sent to method YesOrNo
     */
    void printStatement() throws InterruptedException
    {
        ui.printGameOutput("\n\nThe filing cabinet is large with one drawer "
                + "that does not appear to be locked.\n Would you like to open it?\n"); 
        userInput = ui.getGameInput(keys.YES.name(), keys.NO.name()); 
        YesOrNo(userInput); 
    }
    
    /**
     * YesOrNo method accepts userInput and compares it to YES or NO key words
     * If user enters YES then ask for a file number to read, pass this String to method File
     * If user enters NO then asks user whether they want to go to the Furnace or stay at the cabinet
     * Input under NO is passed to a method in the Table file called CabinetOrFurnace
     * @param u - userInput String passed from the printStatement
     */
    void YesOrNo(String u) throws InterruptedException
    {
        if(u == null)
        {
            ui.printGameOutput("\nYou have given up by clicking QUIT!\n");
            ui.restart();
        }
        else if(keys.YES.name().equalsIgnoreCase(u))
        {
            File(); 
        }
        else if(keys.NO.name().equalsIgnoreCase(u))
        {
            ui.printGameOutput("\nDo you want to go to the FURNACE or stay at the CABINET?");
            userInput = ui.getGameInput(keys.FURNACE.name(), keys.CABINET.name()); 
            Table table = new Table(); 
            table.CabinetOrFurnace(userInput);
        }
        else
        {
            ui.printGameOutput("\nSorry, we do not recognize that word\n"); 
            printStatement();  
        }
    }
    /**
     * File method asks for user input
     * if user enters 18 (the desired file number), output will be displayed that contains secret code
     * any other file number entered (in 1-20 range) will have a random file content displayed (meaningless)
     * all options given 3 options: FURNACE, TOOLBOX, or CABINET
     * @param u - userInput String passed from YesOrNo method
     */
    void File() throws InterruptedException
    {
        String u; 
        String answer; 
        ui.printGameOutput("\n\nThe drawer slides open and creaks loudly. Inside\n"
            + "there are around 20 files stuffed with papers.\n"); 
        do{
            u = ""; 
            answer = ""; 
            ui.printGameOutput("\nEnter a number in the range of 1-20 to investigate a file.\n"); 
            u = ui.getGameInput(); 
        if(u == null)
        {
            ui.printGameOutput("\nYou have given up by clicking QUIT!\n");  
        }
        else if(u.equals("18"))
        {
            ui.printGameOutput("\nThe file says: MIT, 77 Massachusetts Ave, Cambridge, MA 02139\n");
        }
        else if(u.equals("4") || u.equals("20") || u.equals("11")|| u.equals("8") || u.equals("15") || u.equals("10")|| u.equals("17"))
        {
            ui.printGameOutput("\nThe file says: YOU'LL NEVER LEAVE THIS ROOM\n");  
        }
        else if(u.equals("1") || u.equals("13") || u.equals("5") || u.equals("19") || u.equals("7") || u.equals("12")|| u.equals("16"))
        {
            ui.printGameOutput("\nThe file says: YOU AREN'T SMART ENOUGH TO ESCAPE\n"); 
        }
         else if(u.equals("2") || u.equals("3") || u.equals("6") || u.equals("7") || u.equals("9") || u.equals("14"))
        {
            ui.printGameOutput("\nThe file says: HAHA\n"); 
        }
        
        else
        {
            ui.printGameOutput("\nSorry, we do not recognize that file number\n"); 
        }
        ui.printGameOutput("\nPick another file?\nEnter YES or anything else to move on.\n"); 
        answer = ui.getGameInput(); 
        if(answer == null)
        {
            ui.printGameOutput("\nYou have given up by clicking QUIT!\n");  
        }
        }while(keys.YES.name().equalsIgnoreCase(answer));
        
        ui.printGameOutput("\nWould you like to go to the TOOLBOX, FURNACE, or stay at the CABINET?"); 
        userInput = ui.getGameInput(keys.TOOLBOX.name(), keys.FURNACE.name(), keys.CABINET.name()); 
        ToolBoxOrFurnaceOrCabinet(userInput); 
    }
    /**
     * if user enters TOOLBOX - object created of that class and print statement called
     * if user enters FURNACE - object created of that class and print statement called
     * if user enters CABINET - user prompted to enter another file number (user input sent to File method)
     * @param u - userinput from File method
     */
    void ToolBoxOrFurnaceOrCabinet(String u) throws InterruptedException
    {
        if(u == null)
        {
            ui.printGameOutput("\nYou have given up by clicking QUIT!\n"); 
            ui.restart(); 
        }
        else if(keys.TOOLBOX.name().equalsIgnoreCase(u))
        {
            Toolbox toolbox = new Toolbox();
            toolbox.printStatement(); 
        }
        else if(keys.FURNACE.name().equalsIgnoreCase(u))
        {
            Furnace furnace = new Furnace(); 
            furnace.printStatement(); 
        }
        else if(keys.CABINET.name().equalsIgnoreCase(u))
        {
            File(); 
        }
        else
        {
            ui.printGameOutput("\nSorry, we do not recognize that word\n"); 
            ui.printGameOutput("Would you like to go to the TOOLBOX, FURNACE or stay at the CABINET?"); 
            userInput = ui.getGameInput(keys.FURNACE.name(), keys.TOOLBOX.name(), keys.CABINET.name()); 
            ToolBoxOrFurnaceOrCabinet(userInput);
        }
    }
}
