import java.util.Scanner;
import javax.swing.*;
import java.io.*;
import java.text.NumberFormat;
import java.util.ArrayList;

/** ***************************************************
 *  Name:           Samarjeet Randhawa 
 *  Class:          CS30S
 * 
 *  Assignment:     Assignment 2 cookies and jars 
 * 
 *  Description:    Place a short description of your program here
 * 
 *************************************************************/

public class Driver  {

    public static void main(String[] args) throws IOException{
    // ***** constants *******
    
    // ***** variables *****
    
        String name = ""; 
        
    
        String banner = "";             // output banner
        String prompt = "";             // prompt for user input
        
        String strin = "";              // string fro keyboard input
        String strout = "";             // string for formatted output
        
        String delim = "[ ]+";          // delimiter for splitting input records
        String[] tokens = null;         // used to split input records
        BufferedReader fin = null;
        
        // a new line character that works on every computer system
        String nl = System.lineSeparator();
    
    // ***** objects *****
    
         ArrayList<Jar> jar = new ArrayList<>();
        
        // file io buffers for reading and writing to text files
        
        //BufferedReader fin = new BufferedReader(new FileReader("filename.txt"));
        //PrintWriter fout = new PrintWriter(new BufferedWriter(new FileWriter("outfle.txt")));
    
        
         try{
        fin = new BufferedReader(new FileReader(".txt"));
    }// end try 
    catch(FileNotFoundException e) {
        System.out.println("file has not been found");
        fin = null; 
    }// end catch FileNotFoundException e
    // ***** print banners *****
    
        // banner = "*****************************" + nl;
        // banner += "Name:        Sveinson" + nl;
        // banner += "Class:       CS30S" + nl;
        // banner += "Assignment:  Ax Qy" + nl;
        // banner += "*****************************" + nl + nl;
        
        // System.out.println(banner);
         //fout.print(banner);
    
    // ***** Get Input *****
    
        // prompt for input
        // read input from keyboard
        // echo input back to console window
    
    // ***** Main Processing *****
    
    strin = fin.readLine();
    while(strin != null){
        System.out.println(strin);
        
        
        
        
        
    
        
        strin = fin.readLine(); 
    }// end while 
    
    // ***** Print Formatted Output *****
    
    // ***** Closing Message *****
    
        System.out.println();
        System.out.println("end of processing");
        //fout.println("End of Processing");
        
    // **** close io buffers *****
    
        //fin.close();
        //fout.close();
    } // end main 
    
} // end FormatTemplate