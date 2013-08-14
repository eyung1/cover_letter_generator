/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package IO;

/**
 *
 * @author Alex
 * The class where business happens. 
 */
public class CreateLetter {
    
    //A method that generates a cover letter for co-op work terms at Waterloo
    public static boolean makeLetter(String [] personalInformation, String [] employerInformation, String date){
        
        //Make an empty file for the cover letter to go into
        String filename = "Cover Letter for a position at " + employerInformation[4] + ".txt";
        FileIO.createFile(filename);
        
        //Write your address to the file
        FileIO.writeToFile(personalInformation[1], filename);
        FileIO.writeToFile(personalInformation[2] + ", " + personalInformation[3] , filename);
        FileIO.writeToFile(personalInformation[4], filename);
        FileIO.writeToFile("", filename);
        
        //Add today's date
        FileIO.writeToFile(date, filename);
        FileIO.writeToFile("", filename);
        FileIO.writeToFile("", filename);
        
        if(!employerInformation[0].equals("NULL")){
            FileIO.writeToFile(employerInformation[0] + ". " + employerInformation[1] + " " + employerInformation[2], filename);
        }
        else {/*Dn't write employer's name to file*/}
        
        //Write the company's address to file
        FileIO.writeToFile(employerInformation[3], filename);
        FileIO.writeToFile(employerInformation[4], filename);
        FileIO.writeToFile(employerInformation[5], filename);
        FileIO.writeToFile(employerInformation[6], filename);
        FileIO.writeToFile(employerInformation[7], filename);
        FileIO.writeToFile(employerInformation[8], filename);
        
        FileIO.writeToFile("", filename);
        FileIO.writeToFile("", filename);
        
        //Write the employer's name as Dear XX XXXXX if there is sufficient data
        if(!employerInformation[0].equals("NULL")){
            FileIO.writeToFile("Dear " + employerInformation[0] + ". " + employerInformation[1] + " " + employerInformation[2] + ",", filename);
        }
        else {
            FileIO.writeToFile("To whom it may concern,", filename);
        }
        FileIO.writeToFile("I wish to apply for a full-time co-op placement with your company in the area of " + personalInformation[6].toLowerCase()
                + ". ", filename);
        
        FileIO.writeToFile("I am currently enrolled at Waterloo university in my 1st year, specializing in " + personalInformation[6] + 
                ", and planning on minoring in computer science as well. With this mix of courses, " + 
                "I have learned how to effectively use sepcialized GIS software such as ArcGIS, and how to program in Scheme and C++. " + 
                " This mix of subjects has allowed me to gain skills with time management and efficient computer use. " 
                , filename);
        
        FileIO.writeToFile("I have done extensive programming work with the FIRST Robotics team at my high school, being the lead programmer for two years in a row. " + 
                "The team made it to world championships twice, which meant that often times I had very little time to make a fix to the code if a part of the robot " + 
                "was malfunctioning. As well, I have developed various applications in my spare time, including a social network, artificial intelligence for a game, " +
                "and a program to help the robotics team scout out the best teams on the field."
                + "In regards to geographical knowledge, I have participated and run many different geocaching games with my Dorchester scouting troop. As well in our troop, we did"
                + "activities like map making and surveying parts of the forest for the best places to make new camp sites. My knowledge of programming and geography that I have gained"
                + "will benefit your company greatly.", filename);
        
        FileIO.writeToFile("I am pleased to have this opportunity to interview with you. For your convenience, I have attached my resume and references, outlining my "
                + "education, work experience, and interests. If you choose to interview me, I can be reached via cell phone at " + personalInformation[5] + ". I am usually available, but"
                + "if I am not, I do have voicemail. I look forward to hearing from you.", filename);
        
        FileIO.writeToFile("", filename);
        FileIO.writeToFile("Sincerely yours,", filename);
        FileIO.writeToFile("", filename);
        FileIO.writeToFile(personalInformation[0], filename);
        
        
        System.out.println("Cover letter generated. [File name '" + filename + "'");
        
        return true;
    }
    
}
