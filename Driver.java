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

public class Driver  {

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

        // file io buffers for reading and writing to text files

        //BufferedReader fin = new BufferedReader(new FileReader("filename.txt"));
        //PrintWriter fout = new PrintWriter(new BufferedWriter(new FileWriter("outfle.txt")));

        try{
            fin = new BufferedReader(new FileReader("A2InputFile.txt"));
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
            //System.out.println(strin); // testing if data is being read correctly
            
            tokens = strin.split(delim); // splitting data 
            
            /* is your split working? it looks like .split will split the input string at every , (comma) and every space.
            print tokens.size() to see how many tokens have been created. You might need to fine tune your delimiter so that it
            only splits the string on comma's, you might also try editting the data file to remove all of the spaces.*/
            
            jars = tokens[0];       
            flavour = tokens[1];
            
            jar.add(new Jar(jars));                     // this is good to create and add all of the jars
            
            /* create a new cookie and create its association with its jar here
            so, rather than adding the cookie to an arraylist
            pass in the new cookie to the associations method
            You'll have to figure out what jar to pass in as well, it'll be something like jars.get(some index goes here)*/
            cookie.add(new Cookie(flavour));
            
            /* if you do create two arraylists you can iterate through the lists createing the associations later, i.e. after the eof loop*/
            
            // for(int i = 0; i < n; i ++){
                // Cookie c1 = new Cookie(tokens[1]);
                
            // }// end 
            
            strin = fin.readLine(); // prime the loop 
        }// end while eof loop
        
         // printing the name of jars 
        for(Jar e: jar)
        System.out.println(e.toString());
        
        // printing the names of cookies 
        for(Cookie c: cookie)
        System.out.println(c.toString());
        
        // set up associations
        
        
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
    }// end associations 

} // end FormatTemplate
