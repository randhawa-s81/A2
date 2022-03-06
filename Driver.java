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
 *  Description:    Accociations between two class objects 
 * 
 *************************************************************/

public class Driver {
    public static void main(String[] args) throws IOException{
        // ***** constants *******
    
        // ***** variables *****

        String name = ""; 

        String banner = "";             // output banner
        String prompt = "";             // prompt for user input

        String strin = "";              // string fro keyboard input
        String strout = "";             // string for formatted output

        String delim = "[, ]+";          // delimiter for splitting input records
        String[] tokens = null;         // used to split input records
        BufferedReader fin = null;
        
        String jars = "";
        String flavour = "";
        
        int n = 0; // number of itereration per while loop

        // a new line character that works on every computer system
        String nl = System.lineSeparator();

        // ***** objects *****

        ArrayList<Jar> jar = new ArrayList<>();
        ArrayList<Cookie> cookie = new ArrayList<>();
        
        /* you don't really need an arraylist for cookies,
        the way i picture this association is that the cookies 
        can't be accessed except by using their associated jar
        for example
        System.out.println("Chocolate: " + chocolateJar.getCookie());
        
        would call the toString() method of the cookie assiciated with the chocolateJar jar*/

        // file io buffers for reading and writing to text file
        try{
            fin = new BufferedReader(new FileReader("A2InputFile.txt"));
        }// end try 
        catch(FileNotFoundException e) {
            System.out.println("file has not been found");
            fin = null; 
        }// end catch FileNotFoundException e
        // ***** print banners *****

        // ***** Get Input *****
    
        // ***** Main Processing *****

        strin = fin.readLine();
        while(strin != null){
            //System.out.println(strin); // testing if data is being read correctly
            
            tokens = strin.split(delim); // splitting data 
        
            //System.out.println(tokens.length); // checking if tokens.split is correct 
            
            jars = tokens[0];       
            jar.add(new Jar(jars));                     // this is good to create and add all of the jars
         
            Cookie c1 = new Cookie(tokens[1]);
            //Cookie c2 = new Cookie(tokens[1]);
            
            associations(jar.get(0), c1);
            //associations(jar.get(0), c2);
            
            //cookie.add(new Cookie(flavour));
        
            strin = fin.readLine(); // prime the loop 
        }// end while eof loop
        
         // printing the name of jars 
        for(Jar e: jar)
        System.out.println(e.toString());
    
        // printing the names of cookies 
        
        // ***** Print Formatted Output *****
    
        // ***** Closing Message *****

        System.out.println();
        System.out.println("end of processing");
        //fout.println("End of Processing");

        // **** close io buffers *****

        //fin.close();
        //fout.close();
    } // end main 
    
    public static void associations(Jar j, Cookie c){
        j.setCookie(c);
        c.setJar(j);
    }// end associations '
    
} // end FormatTemplate