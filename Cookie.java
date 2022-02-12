/********************************************************************
 * Programmer:    Samarjeet Randhawa 
 * Class:  CS30S
 *
 * Description: create an associoation between cookies and jars using OOP
 ***********************************************************************/

// import libraries as needed here

public class Cookie {
    //*** Class Variables ***
    
    private String nl = System.lineSeparator();
    
    private static int nextId = 1000 ;
    
    //*** Instance Variables ***
    
    private String flavour;
    private Jar jar;
    
    private int id; 
    
    //*** Constructors ***
    
    // method to automatically assign id to new object 
    // public static void ID(){
        // id = nextId++; 
        // }// end ID
    
    //no arg constructor 
    public Cookie(){
        //id = nextId++;
        id = nextId++;  
        
        this.flavour = "None";
        //this.jar = "None"; 
    }// end cookie no-argument constrcutor 
    
    // argument constructor 
    public Cookie (String f){
        //id = nextId++;
        id = nextId++; 
        
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
        StringBuilder cookie = new StringBuilder();
        cookie.append("Id:" + getId() + " flavour: " + getFlavour() + nl); 

        return cookie.toString();
    }// end toString 
    
} // end of public class