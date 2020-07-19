/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication54;
import java.awt.BorderLayout;
import java.awt.Color;
import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.text.DefaultCaret;
import javax.swing.JPanel; 
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.UIManager;
/**
 *
 * @author Gab
 */
public class UserInterface extends JFrame{
    static private JTextArea gameText;
    static Scanner keyboard;
    static JFrame frame;
    static JPanel panel; 
    
    static final int FRAME_LENGTH = 650;
    static final int FRAME_WIDTH = 1300;
    
    static final String GAME_TEXT = "The Defeated Presents: Escape Room";
    static final String DEFAULT_PROMPT = "> ";
    static Room1 room1 = new Room1(); 
     /**
     * Constructor - set up JFRAME for Game Output
     */
    UserInterface() {}
    void setInterface()
    {
        frame = new JFrame();
        frame.add( new JLabel(GAME_TEXT ), BorderLayout.NORTH );

        gameText = new JTextArea();
        gameText.setBackground(Color.black);
        gameText.setForeground(Color.green);
        gameText.setLineWrap(true);
        gameText.setWrapStyleWord(true);

        frame.add(new JScrollPane(gameText));

        // frame.pack();   not needed for now, revisit
        frame.setVisible( true );
        frame.setSize(FRAME_WIDTH,FRAME_LENGTH);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // was used for gameInput2() method
        //   no longer used w/ switch to JOptionPane
        keyboard = new Scanner(System.in);
        
    }
    /**
     * getPassword method creates a dialog box where the userInput will be hidden behind asterisks
     * @return userInput - returns userInput so the input can be compared with the key word
     */
    String getPassword()//*********************************
    {
        JLabel code = new JLabel("Enter Code"); 
        JTextField password = new JPasswordField(); 
        
        Object[] ob = {code, password};//required for the showConfirmDialog method below
        String userInput = ""; 
        int result = JOptionPane.showConfirmDialog(frame, ob, "Enter: ", JOptionPane.OK_CANCEL_OPTION); 
        if(result == JOptionPane.OK_OPTION)//if user pressed OK on the dialog box
        {
            userInput = password.getText(); 
            
        }
        return userInput; 
    }
    static void printGameOutput(String printString) throws InterruptedException {
        
        for(int i = 0; i < printString.length(); i++)
        {
            char c = printString.charAt(i);
            String s = String.valueOf(c);
            gameText.append(s);
            gameText.setCaretPosition(gameText.getDocument().getLength());
            Thread.sleep(10);

        }
        //the following text was added to automatically focus on the most recent line added on the frame - Gab
        gameText.setCaretPosition(gameText.getDocument().getLength());
    }
    static void printConsole(String printString) {
        System.out.print(printString);
    }
     static String getGameInput(String output) {
        String input = JOptionPane.showInputDialog(frame, output);
        return input;
    }
     //method below not used anymore
    static String getGameInput() {
        String input = JOptionPane.showInputDialog(frame, DEFAULT_PROMPT);
        return input;
    }
    /**
     * accepts String of key words and displays them in the input dialog box
     * returns input String to method that called it for comparison to other key words 
     * @param x - first String
     * @param y - second String 
     * @return input - to be compared to key words 
     * @throws InterruptedException 
     */
    static String getGameInput(String x, String y)throws InterruptedException {
        UIManager.put("OptionPane.okButtonText", "Enter"); 
        UIManager.put("OptionPane.cancelButtonText", "Quit");
        String input = JOptionPane.showInputDialog(frame, "Enter " + x + " or " + y);
        printGameOutput("\nYou entered: " + input + "\n"); 
        return input; 
    }
    
    static String getGameInput(String x, String y, String z)throws InterruptedException {
        UIManager.put("OptionPane.okButtonText", "Enter"); 
        UIManager.put("OptionPane.cancelButtonText", "Quit");
        String input = JOptionPane.showInputDialog(frame, "Enter " + x + " or " + y + " or " + z);
        printGameOutput("\nYou entered: " + input + "\n"); 
        return input; 
    }
    static void restart()throws InterruptedException { 
        int i = JOptionPane.showConfirmDialog(frame, "Restart the game?", null, JOptionPane.YES_NO_OPTION); 
        if(i == JOptionPane.YES_OPTION)
        {
            gameText.setText(null);
            room1.OpeningScenario();
        }
        else if(i == JOptionPane.NO_OPTION)
        {
            printGameOutput("\nThe Defeated thanks you for playing."); 
        }
    }
    /*
    static String getGameInput2() {
        String userInput = keyboard.nextLine();
        return (userInput);
    }
    static String getGameInput2(String output) {
        System.out.print(output);
        return getGameInput2();
    }*/
}

