/********************************************************************
 * Programmer:    Samarjeet Randhawa 
 * Class:  CS30S
 *
 * Assignment: Assignment 2 cookies and jars 
 *
 * Description: create an associoation between cookies and jars using OOPa
 ***********************************************************************/

// import libraries as needed here

public class Cookie {
    //*** Class Variables ***
    
    private static int nextId = 1000 ;
    
    //*** Instance Variables ***
    
    private String flavour;
    private Jar jar;
    private static int id; 
    
    //*** Constructors ***
    
    // method to automatically assign id to new object 
    public static void ID(){
        id = nextId++; 
        }// end ID
    
    //no arg constructor 
    public Cookie(){
        //id = nextId++;
        ID(); 
        
        this.flavour = "None";
        //this.jar = "None"; 
    }// end cookie no-argument constrcutor 
    
    // argument constructor 
    public Cookie (String f){
        //id = nextId++;
        ID();
        
        this.flavour = f;  
        //this.jar = j;
    }// end argument constructor
    
    /*****************************************
    * Description: brief description of the methods purpose
    * 
    * Interface:
    * 
    * @param        each parameter of the method should be listed with an @param
    * @param        parametername description of parameter
    * 
    * @return       any return value will be noted here
    * ****************************************/
    
    //*** Getters ***
    
    public int getId(){
        return id; 
    }// end getId
    
    public String getFlavour(){
        return flavour; 
    }// end getFlavour
    
    public Jar getJar(){
        return jar; 
    }
    
    //*** Setters ***
    
    public void setFlavour(String f){
        this.flavour = f; 
    }// end setFlavour
    
    public void setJar(Jar j){
        this.jar = j; 
    }// end setJar 
    
    //**** other **** 
    
    @Override 
    public String toString(){
        String st = "";
        st += "Id: " + id;
        st += "flavour: " + flavour;
        //st += "Jar : " + jar;
        
        return st; 
    }// end toString 
    
} // end of public class