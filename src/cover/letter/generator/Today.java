/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cover.letter.generator;
import java.util.Date;

/**
 *
 * @author Alex
 * A class that uses java's Date class to find today's date
 */
public class Today {
    //A method that returns today's date in DD Month, YYYY format
    public static String getTodaysDate(){
        Date date = new Date();
        
        //Get the day of the month
        String today = date.getDate() + " ";
        
        
        //An if block to convert the integer month into a string
        if(date.getMonth() == 0) { 
            today += "January";
        }
        else if(date.getMonth() == 1) {
            today +=  "February";
        }
        else if(date.getMonth() == 2) {
            today += "March";
        }
        else if(date.getMonth() == 3) {
            today += "April";
        }
        else if(date.getMonth() == 4) {
            today += "May";
        }
        else if(date.getMonth() == 5) {
            today += "June";
        }
        else if(date.getMonth() == 6) {
            today += "July";
        }
        else if(date.getMonth() == 7) {
            today += "August";
        }
        else if(date.getMonth() == 8) {
            today += "September";
        }
        else if(date.getMonth() == 9) {
            today += "October";
        }
        else if(date.getMonth() == 10) {
            today += "November";
        }
        else {
            today += "December";
        }
        
        //Append the year to the date
        today += (", " + (date.getYear() - 100 + 2000));
        
        //Return the date as a string
        return today;
        
    }//End of method
    
}//End of class