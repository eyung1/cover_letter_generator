/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package IO;
import java.io.BufferedReader;
import java.io.InputStreamReader;
/**
 *
 * @author Alex
 * This class allows easy input from the user via the keyboard. 
 */
public class Keyboard {
    
    //A method to get input from the 
    public static String getInput(String prompt) {
        String input = "";
        try{
            //Test to see if there is a prompt fed to the method
            if(prompt.equals(null) || prompt == null || prompt.equals(""))
                prompt = "";
            else //Otherwise append a colon and a tab to allow for easy to read input
                prompt += ":\t";        

            //Output the prompt to the user
            System.out.print(prompt);

            //Get input from user
            InputStreamReader reader = new InputStreamReader(System.in);
            BufferedReader in = new BufferedReader(reader);
            input = in.readLine();

        }
        catch(Exception e){
            System.out.println(e.toString());
        }
        //Return the acquired input to the program
        return input;
    }//End of method
    
    public static char getChar(String prompt){
        return getInput(prompt).charAt(0);        
    }
    
}//End of class