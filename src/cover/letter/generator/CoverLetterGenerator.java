/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cover.letter.generator;
import IO.Keyboard;
import IO.CreateLetter;
import java.util.Date;



/**
 *
 * @author Alex
 */
public class CoverLetterGenerator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String [] personalInformation = new String [8];
        String [] employerInformation = new String [9];
        String date = Today.getTodaysDate();
        
        System.out.println("COVER LETTER GENERATOR V1.0");
        System.out.println("Written by Alex McVittie 08/2013\n");
        System.out.println("A very basic cover letter generator. This is designed for a co-op student currently at the University of Waterloo.");
        
        personalInformation[0] = Keyboard.getInput("Your name");
        personalInformation[1] = Keyboard.getInput("Street address");
        personalInformation[2] = Keyboard.getInput("City");
        personalInformation[3] = Keyboard.getInput("Province");
        personalInformation[4] = Keyboard.getInput("Postal code");
        personalInformation[5] = Keyboard.getInput("Phone number");
        personalInformation[6] = Keyboard.getInput("Your major (ex Computer Science)");
        personalInformation[7] = Keyboard.getInput("Your upcoming co-op term (ex 2B)");
        
        employerInformation[0] = Keyboard.getInput("Recipient's Salutation (Leave blank if unknown)");
        
        if(employerInformation[0].equals("") || employerInformation[0] == null){
            employerInformation[0] = "NULL";
            employerInformation[1] = "To whom it may concern";
            employerInformation[2] = "To whom it may concern";
        }
        else{
            employerInformation[1] = Keyboard.getInput("Recipient's first name");
            employerInformation[2] = Keyboard.getInput("Recipient's first name");            
        }
        employerInformation[3] = Keyboard.getInput("Recipient's position");
        employerInformation[4] = Keyboard.getInput("Organization");
        employerInformation[5] = Keyboard.getInput("Street address");
        employerInformation[6] = Keyboard.getInput("City");
        employerInformation[7] = Keyboard.getInput("Province");
        employerInformation[8] = Keyboard.getInput("Postal code");
        
        
        CreateLetter.makeLetter(personalInformation, employerInformation, date);
    }
}
