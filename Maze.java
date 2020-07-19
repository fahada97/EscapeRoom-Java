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
public class Maze {
    
    UserInterface ui = new UserInterface(); 
    String userInput = ""; 
    
    /**
     * 
     */
    void OpeningScenario() throws InterruptedException
    {
        ui.printGameOutput("\n\nCongrats! You have escape room 3!!\n"
                + "You are fre.... Oh wait..\n"
                + "Just kidding, you have to solve a maze to get free.\n"
                + "Where do you want to move?"); 
        //ui.printGameOutput("\n you are in corner 0\n");
        userInput = ui.getGameInput(keys.RIGHT.name(), keys.BACKWARD.name()); 
        Corner0(userInput);      
    }
    
    /**
     * 
     */
    void Corner0(String u) throws InterruptedException
    {
        if(u == null)
        {
            ui.printGameOutput("\nYou have given up by clicking QUIT!\n"); 
            ui.restart(); 
        }
        else if(keys.RIGHT.name().equalsIgnoreCase(u))
        {
            //corner1
            //ui.printGameOutput("\n you are in corner 1\n");
            ui.printGameOutput("Where do you want to move now?");
            u = ui.getGameInput(keys.LEFT.name(), keys.FORWARD.name());
            Corner1(u);
        }
        else if(keys.BACKWARD.name().equalsIgnoreCase(u))
        {
           //opening
            //ui.printGameOutput("\n you are in corner 0\n");
            OpeningScenario();
        }
        else
        {
            ui.printGameOutput("\nSorry, we do not recognize that word\n"); 
            //ui.printGameOutput("\n you are in corner 0\n");
            u = ui.getGameInput(keys.RIGHT.name(), keys.BACKWARD.name()); 
            Corner0(u); 
        }
    }
    
    void Corner1(String u) throws InterruptedException
    {
        if(u == null)
        {
            ui.printGameOutput("\nYou have given up by clicking QUIT!\n");
            ui.restart();
        }
        else if(keys.LEFT.name().equalsIgnoreCase(u))
        {
            //openingstatement
            //ui.printGameOutput("\n you are in corner 0\n");
            OpeningScenario();
        }
        else if(keys.FORWARD.name().equalsIgnoreCase(u))
        {
           //corner2
            //ui.printGameOutput("\n you are in corner 2\n");
            ui.printGameOutput("Where do you want to move now?");
            u = ui.getGameInput(keys.LEFT.name(), keys.BACKWARD.name());
            Corner2(u);
        }
        else
        {
            ui.printGameOutput("\nSorry, we do not recognize that word\n"); 
            //ui.printGameOutput("\n you are in corner 1\n");
            ui.printGameOutput("Where do you want to move now?");
            u = ui.getGameInput(keys.LEFT.name(), keys.FORWARD.name());
            Corner1(u);
        }
    }
    
    void Corner2(String u) throws InterruptedException
    {
        if(u == null)
        {
            ui.printGameOutput("\nYou have given up by clicking QUIT!\n");
            ui.restart();
        }
        else if(keys.LEFT.name().equalsIgnoreCase(u))
        {
            //corner3
            //ui.printGameOutput("\n you are in corner 3\n");
            ui.printGameOutput("Where do you want to move now?");
            u = ui.getGameInput(keys.RIGHT.name(), keys.FORWARD.name(), keys.BACKWARD.name());
            Corner3(u);
        }
        else if(keys.BACKWARD.name().equalsIgnoreCase(u))
        {
           //corner1
            //ui.printGameOutput("\n you are in corner 1\n");
            ui.printGameOutput("Where do you want to move now?");
            u = ui.getGameInput(keys.LEFT.name(), keys.FORWARD.name());
            Corner1(u);
        }
        else
        {
            ui.printGameOutput("\nSorry, we do not recognize that word\n"); 
            //ui.printGameOutput("\n you are in corner 2\n");
            ui.printGameOutput("Where do you want to move now?");
            u = ui.getGameInput(keys.LEFT.name(), keys.BACKWARD.name());
            Corner2(u); 
        }
    }
     
    void Corner3(String u) throws InterruptedException
    {
        if(u == null)
        {
            ui.printGameOutput("\nYou have given up by clicking QUIT!\n"); 
            ui.restart();
        }
        else if(keys.RIGHT.name().equalsIgnoreCase(u))
        {
            //corner2
            //ui.printGameOutput("\n you are in corner 2\n");
            ui.printGameOutput("Where do you want to move now?");
            u = ui.getGameInput(keys.LEFT.name(), keys.BACKWARD.name());
            Corner2(u);
        }
        else if(keys.FORWARD.name().equalsIgnoreCase(u))
        {
           //corner4
            //ui.printGameOutput("\n you are in corner 4\n");
            ui.printGameOutput("Where do you want to move now?");
            u = ui.getGameInput(keys.RIGHT.name(), keys.FORWARD.name(), keys.BACKWARD.name());
            Corner4(u);
        }
        else if(keys.BACKWARD.name().equalsIgnoreCase(u))
        {
           //corner5
            //ui.printGameOutput("\n you are in corner 5\n");
            ui.printGameOutput("Where do you want to move now?");
            u = ui.getGameInput(keys.FORWARD.name());
            Corner5(u);
        }
        else
        {
            ui.printGameOutput("\nSorry, we do not recognize that word\n"); 
            //ui.printGameOutput("\n you are in corner 3\n");
            ui.printGameOutput("Where do you want to move now?");
            u = ui.getGameInput(keys.RIGHT.name(), keys.FORWARD.name(), keys.BACKWARD.name());
            Corner3(u); 
        }
    }
      
    void Corner4(String u) throws InterruptedException
    {
        if(u == null)
        {
            ui.printGameOutput("\nYou have given up by clicking QUIT!\n"); 
            ui.restart();
        }
        else if(keys.RIGHT.name().equalsIgnoreCase(u))
        {
            //corner6
            //ui.printGameOutput("\n you are in corner 6\n");
            ui.printGameOutput("Where do you want to move now?");
            u = ui.getGameInput(keys.LEFT.name(), keys.FORWARD.name(), keys.RIGHT.name());
            Corner6(u);
        }
        else if(keys.FORWARD.name().equalsIgnoreCase(u))
        {
           //corner7
           // ui.printGameOutput("\n you are in corner 7\n");
            ui.printGameOutput("Where do you want to move now?");
            u = ui.getGameInput(keys.RIGHT.name(), keys.BACKWARD.name());
            Corner7(u);
        }
        else if(keys.BACKWARD.name().equalsIgnoreCase(u))
        {
           //corner3
            //ui.printGameOutput("\n you are in corner 3\n");
            ui.printGameOutput("Where do you want to move now?");
            u = ui.getGameInput(keys.RIGHT.name(), keys.FORWARD.name(), keys.BACKWARD.name());
            Corner3(u);
        }
        else
        {
            ui.printGameOutput("\nSorry, we do not recognize that word\n"); 
            //ui.printGameOutput("\n you are in corner 4\n");
            ui.printGameOutput("Where do you want to move now?");
            u = ui.getGameInput(keys.RIGHT.name(), keys.FORWARD.name(), keys.BACKWARD.name());
            Corner4(u); 
        }
    }
       
    void Corner5(String u) throws InterruptedException
    {
        if(u == null)
        {
            ui.printGameOutput("\nYou have given up by clicking QUIT!\n");
            ui.restart();
        }
        else if(keys.FORWARD.name().equalsIgnoreCase(u))
        {
           //corner3
            //ui.printGameOutput("\n you are in corner 3\n");
            ui.printGameOutput("Where do you want to move now?");
            u = ui.getGameInput(keys.FORWARD.name(), keys.RIGHT.name(), keys.BACKWARD.name());
            Corner3(u);
        }
        else
        {
            ui.printGameOutput("\nSorry, we do not recognize that word\n"); 
            //ui.printGameOutput("\n you are in corner 5\n");
            ui.printGameOutput("Where do you want to move now?");
            u = ui.getGameInput(keys.FORWARD.name());
            Corner5(u); 
        }
    }
     
    void Corner6(String u) throws InterruptedException
    {
        if(u == null)
        {
            ui.printGameOutput("\nYou have given up by clicking QUIT!\n"); 
            ui.restart();
        }
        else if(keys.RIGHT.name().equalsIgnoreCase(u))
        {
            //corner11
            //ui.printGameOutput("\n you are in corner 11\n");
            ui.printGameOutput("Where do you want to move now?");
            u = ui.getGameInput(keys.LEFT.name(), keys.RIGHT.name(), keys.BACKWARD.name());
            Corner11(u);
        }
        else if(keys.FORWARD.name().equalsIgnoreCase(u))
        {
           //corner8
            //ui.printGameOutput("\n you are in corner 8\n");
            ui.printGameOutput("Where do you want to move now?");
            u = ui.getGameInput(keys.RIGHT.name(), keys.BACKWARD.name());
            Corner8(u);
        }
        else if(keys.LEFT.name().equalsIgnoreCase(u))
        {
           //corner4
            //ui.printGameOutput("\n you are in corner 4\n");
            ui.printGameOutput("Where do you want to move now?");
            u = ui.getGameInput(keys.FORWARD.name(), keys.RIGHT.name(), keys.BACKWARD.name());
            Corner4(u);
        }
        else
        {
            ui.printGameOutput("\nSorry, we do not recognize that word\n"); 
           // ui.printGameOutput("\n you are in corner 6\n");
            ui.printGameOutput("Where do you want to move now?");
            u = ui.getGameInput(keys.LEFT.name(), keys.FORWARD.name(), keys.RIGHT.name());
            Corner6(u); 
        }
    }
      
    void Corner7(String u) throws InterruptedException
    {
        if(u == null)
        {
            ui.printGameOutput("\nYou have given up by clicking QUIT!\n");
            ui.restart();
        }
        else if(keys.RIGHT.name().equalsIgnoreCase(u))
        {
            //corner17
            //ui.printGameOutput("\n you are in corner 17\n");
            ui.printGameOutput("Where do you want to move now?");
            u = ui.getGameInput(keys.FORWARD.name(), keys.LEFT.name());
            Corner17(u);
        }
        else if(keys.BACKWARD.name().equalsIgnoreCase(u))
        {
           //corner4
            //ui.printGameOutput("\n you are in corner 4\n");
            ui.printGameOutput("Where do you want to move now?");
            u = ui.getGameInput(keys.FORWARD.name(), keys.RIGHT.name(), keys.BACKWARD.name());
            Corner4(u);
        }
        else
        {
            ui.printGameOutput("\nSorry, we do not recognize that word\n"); 
            //ui.printGameOutput("\n you are in corner 7\n");
            ui.printGameOutput("Where do you want to move now?");
            u = ui.getGameInput(keys.RIGHT.name(), keys.BACKWARD.name());
            Corner7(u); 
        }
    }
       
    void Corner8(String u) throws InterruptedException
    {
        if(u == null)
        {
            ui.printGameOutput("\nYou have given up by clicking QUIT!\n"); 
            ui.restart();
        }
        else if(keys.RIGHT.name().equalsIgnoreCase(u))
        {
            //corner9
            //ui.printGameOutput("\n you are in corner 9\n");
            ui.printGameOutput("Where do you want to move now?");
            u = ui.getGameInput(keys.FORWARD.name(), keys.LEFT.name());
            Corner9(u);
        }
        else if(keys.BACKWARD.name().equalsIgnoreCase(u))
        {
           //corner6
            //ui.printGameOutput("\n you are in corner 6\n");
            ui.printGameOutput("Where do you want to move now?");
            u = ui.getGameInput(keys.FORWARD.name(), keys.RIGHT.name(), keys.LEFT.name());
            Corner6(u);
        }
        else
        {
            ui.printGameOutput("\nSorry, we do not recognize that word\n"); 
            //ui.printGameOutput("\n you are in corner 8\n");
            ui.printGameOutput("Where do you want to move now?");
            u = ui.getGameInput(keys.RIGHT.name(), keys.BACKWARD.name());
            Corner8(u); 
        }
    }
        
    void Corner9(String u) throws InterruptedException
    {
        if(u == null)
        {
            ui.printGameOutput("\nYou have given up by clicking QUIT!\n"); 
            ui.restart();
        }
        else if(keys.LEFT.name().equalsIgnoreCase(u))
        {
            //corner8
           // ui.printGameOutput("\n you are in corner 8\n");
            ui.printGameOutput("Where do you want to move now?");
            u = ui.getGameInput(keys.RIGHT.name(), keys.BACKWARD.name());
            Corner8(u);
        }
        else if(keys.FORWARD.name().equalsIgnoreCase(u))
        {
           //corner10
            //ui.printGameOutput("\n you are in corner 10\n");
            ui.printGameOutput("Where do you want to move now?");
            u = ui.getGameInput(keys.BACKWARD.name());
            Corner10(u);
        }
        else
        {
            ui.printGameOutput("\nSorry, we do not recognize that word\n"); 
            //ui.printGameOutput("\n you are in corner 9\n");
            ui.printGameOutput("Where do you want to move now?");
            u = ui.getGameInput(keys.FORWARD.name(), keys.LEFT.name());
            Corner9(u); 
        }
    }
     
    void Corner10(String u) throws InterruptedException
    {
        if(u == null)
        {
            ui.printGameOutput("\nYou have given up by clicking QUIT!\n");
            ui.restart();
        }
        else if(keys.BACKWARD.name().equalsIgnoreCase(u))
        {
           //corner9
            //ui.printGameOutput("\n you are in corner 9\n");
            ui.printGameOutput("Where do you want to move now?");
            u = ui.getGameInput(keys.FORWARD.name(), keys.LEFT.name());
            Corner9(u);
        }
        else
        {
            ui.printGameOutput("\nSorry, we do not recognize that word\n"); 
            //ui.printGameOutput("\n you are in corner 10\n");
            ui.printGameOutput("Where do you want to move now?");
            u = ui.getGameInput(keys.BACKWARD.name());
            Corner10(u); 
        }
    }
      
    void Corner11(String u) throws InterruptedException
    {
        if(u == null)
        {
            ui.printGameOutput("\nYou have given up by clicking QUIT!\n"); 
            ui.restart();
        }
        else if(keys.LEFT.name().equalsIgnoreCase(u))
        {
            //corner6
           // ui.printGameOutput("\n you are in corner 6\n");
            ui.printGameOutput("Where do you want to move now?");
            u = ui.getGameInput(keys.FORWARD.name(), keys.RIGHT.name(), keys.LEFT.name());
            Corner6(u);
        }
        else if(keys.BACKWARD.name().equalsIgnoreCase(u))
        {
           //corner13
            //ui.printGameOutput("\n you are in corner 13\n");
            ui.printGameOutput("Where do you want to move now?");
            u = ui.getGameInput(keys.FORWARD.name(), keys.RIGHT.name(), keys.BACKWARD.name());
            Corner13(u);
        }
        else if(keys.RIGHT.name().equalsIgnoreCase(u))
        {
           //corner12
            //ui.printGameOutput("\n you are in corner 12\n");
            ui.printGameOutput("Where do you want to move now?");
            u = ui.getGameInput(keys.LEFT.name());
            Corner12(u);
        }
        else
        {
            ui.printGameOutput("\nSorry, we do not recognize that word\n"); 
            //ui.printGameOutput("\n you are in corner 11\n");
            ui.printGameOutput("Where do you want to move now?");
            u = ui.getGameInput(keys.LEFT.name(), keys.RIGHT.name(), keys.BACKWARD.name());
            Corner11(u);
        }
    }
    
    void Corner12(String u) throws InterruptedException
    {
        if(u == null)
        {
            ui.printGameOutput("\nYou have given up by clicking QUIT!\n"); 
            ui.restart();
        }
        else if(keys.LEFT.name().equalsIgnoreCase(u))
        {
            //corner11
            //ui.printGameOutput("\n you are in corner 11\n");
            ui.printGameOutput("Where do you want to move now?");
            u = ui.getGameInput(keys.LEFT.name(), keys.RIGHT.name(), keys.BACKWARD.name());
            Corner11(u);
        }
        else
        {
            ui.printGameOutput("\nSorry, we do not recognize that word\n"); 
            //ui.printGameOutput("\n you are in corner 12\n");
            ui.printGameOutput("Where do you want to move now?");
            u = ui.getGameInput(keys.LEFT.name());
            Corner12(u); 
        }
    }
    
    void Corner13(String u) throws InterruptedException
    {
        if(u == null)
        {
            ui.printGameOutput("\nYou have given up by clicking QUIT!\n");
            ui.restart();
        }
        else if(keys.FORWARD.name().equalsIgnoreCase(u))
        {
            //corner11
            //ui.printGameOutput("\n you are in corner 11\n");
            ui.printGameOutput("Where do you want to move now?");
            u = ui.getGameInput(keys.LEFT.name(), keys.RIGHT.name(), keys.BACKWARD.name());
            Corner11(u);
        }
        else if(keys.BACKWARD.name().equalsIgnoreCase(u))
        {
           //corner14
            //ui.printGameOutput("\n you are in corner 14\n");
            ui.printGameOutput("Where do you want to move now?");
            u = ui.getGameInput(keys.FORWARD.name());
            Corner14(u);
        }
        else if(keys.RIGHT.name().equalsIgnoreCase(u))
        {
           //corner15
           // ui.printGameOutput("\n you are in corner 15\n");
            ui.printGameOutput("Where do you want to move now?");
            u = ui.getGameInput(keys.LEFT.name(), keys.BACKWARD.name());
            Corner15(u);
        }
        else
        {
            ui.printGameOutput("\nSorry, we do not recognize that word\n"); 
           // ui.printGameOutput("\n you are in corner 13\n");
            ui.printGameOutput("Where do you want to move now?");
            u = ui.getGameInput(keys.FORWARD.name(), keys.RIGHT.name(), keys.BACKWARD.name());
            Corner13(u); 
        }
    }
    
    void Corner14(String u) throws InterruptedException
    {
        if(u == null)
        {
            ui.printGameOutput("\nYou have given up by clicking QUIT!\n"); 
            ui.restart();
        }
        else if(keys.FORWARD.name().equalsIgnoreCase(u))
        {
            //corner13
            //ui.printGameOutput("\n you are in corner 13\n");
            ui.printGameOutput("Where do you want to move now?");
            u = ui.getGameInput(keys.FORWARD.name(), keys.RIGHT.name(), keys.BACKWARD.name());
            Corner13(u);
        }
        else
        {
            ui.printGameOutput("\nSorry, we do not recognize that word\n"); 
            //ui.printGameOutput("\n you are in corner 14\n");
            ui.printGameOutput("Where do you want to move now?");
            u = ui.getGameInput(keys.FORWARD.name());
            Corner14(u); 
        }
    }
    
    void Corner15(String u) throws InterruptedException
    {
        if(u == null)
        {
            ui.printGameOutput("\nYou have given up by clicking QUIT!\n"); 
            ui.restart();
        }
        else if(keys.LEFT.name().equalsIgnoreCase(u))
        {
            //corner13
            //ui.printGameOutput("\n you are in corner 13\n");
            ui.printGameOutput("Where do you want to move now?");
            u = ui.getGameInput(keys.FORWARD.name(), keys.RIGHT.name(), keys.BACKWARD.name());
            Corner13(u);
        }
        else if(keys.BACKWARD.name().equalsIgnoreCase(u))
        {
           //corner16
            //ui.printGameOutput("\n you are in corner 16\n");
            ui.printGameOutput("Where do you want to move now?");
            u = ui.getGameInput(keys.FORWARD.name());
            Corner16(u);
        }
        else
        {
            ui.printGameOutput("\nSorry, we do not recognize that word\n"); 
            //ui.printGameOutput("\n you are in corner 15\n");
            ui.printGameOutput("Where do you want to move now?");
            u = ui.getGameInput(keys.LEFT.name(), keys.BACKWARD.name());
            Corner15(u); 
        }
    }
    
    void Corner16(String u) throws InterruptedException
    {
        if(u == null)
        {
            ui.printGameOutput("\nYou have given up by clicking QUIT!\n"); 
            ui.restart();
        }
        else if(keys.FORWARD.name().equalsIgnoreCase(u))
        {
            //corner15
            //ui.printGameOutput("\n you are in corner 15\n");
            ui.printGameOutput("Where do you want to move now?");
            u = ui.getGameInput(keys.LEFT.name(), keys.BACKWARD.name());
            Corner15(u);
        }
        else
        {
            ui.printGameOutput("\nSorry, we do not recognize that word\n"); 
            //ui.printGameOutput("\n you are in corner 16\n");
            ui.printGameOutput("Where do you want to move now?");
            u = ui.getGameInput(keys.FORWARD.name());
            Corner16(u); 
        }
    }
    
    void Corner17(String u) throws InterruptedException
    {
        if(u == null)
        {
            ui.printGameOutput("\nYou have given up by clicking QUIT!\n");
            ui.restart();
        }
        else if(keys.LEFT.name().equalsIgnoreCase(u))
        {
            //corner7
            //ui.printGameOutput("\n you are in corner 7\n");
            ui.printGameOutput("Where do you want to move now?");
            u = ui.getGameInput(keys.RIGHT.name(), keys.BACKWARD.name());
            Corner7(u);
        }
        else if(keys.FORWARD.name().equalsIgnoreCase(u))
        {
           //win
            ui.printGameOutput("You have reached the end of the maze! Unlock\n"
                    + "the gate to get out.");
            code(); 
        }
        else
        {
            ui.printGameOutput("\nSorry, we do not recognize that word\n"); 
            //ui.printGameOutput("\n you are in corner 17\n");
            ui.printGameOutput("Where do you want to move now?");
            u = ui.getGameInput(keys.FORWARD.name(), keys.LEFT.name());
            Corner17(u); 
        }
    }
    /**
     * method gets the password entered by the user
     * if their code contains the three password of the previous rooms, then they are free
     * @throws InterruptedException 
     */
    void code() throws InterruptedException
    {
        userInput = ui.getPassword(); 
        if(userInput == null)
        {
            ui.printGameOutput("\nYou have given up by clicking QUIT!\n"); 
            ui.restart();
        }
        else if(userInput.contains(keys.MIT.name()) && userInput.contains(keys.BLACKJACK.name()) && userInput.contains(keys.TEAM.name()))
        {
            ui.printGameOutput("\nYou have escaped!"); 
            ui.restart(); 
        }
        else
        {
            ui.printGameOutput("\nWrong code!\n Hint 1: Final password to the maze is a combination of the first 3 passwords.\n"
                    + "Hint 2: Who was the most infamous team at MIT in the 90s?\n"); 
            code(); 
        }
        
    }
       
}
