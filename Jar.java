import java.util.ArrayList;

/********************************************************************
 * Programmer: Samarjeet Randhawa
 * Class:  CS30S
 *
 * Assignment: Assingment 2 cookie and jars 
 *
 * Description: create an associoation between cookies and jars using OOP
 ***********************************************************************/

// import libraries as needed here

public class Jar  {
    //*** Class Variables ***
    
    private String nl = System.lineSeparator();
    
    private static int nextId = 1000; 
    
    //private ArrayList<Cookie> jars; 
    
    //*** Instance Variables ***
    
    //private ArrayList<Jar> Cookie = new ArrayList<>();
    
    private String name;           // name of jar 
    private Cookie cookie;         // cookie 
    
    private int id; 
    
    //*** Constructors ***
    
    // no arg-constructor 
    public Jar(){
        id = nextId++;
        
        this.name = "Unknown"; 
    }// end no-arg constructor 
    
    // arg-constructor 
    public Jar(String n){
        id = nextId++;
        
        this.name = n; 
    }// end arg-constructor 
    
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
    
    public String getName(){
        return name;
    }// end getName 
    
    public int getId(){
        return id;
    }// end getId
    
    public Cookie getCookie(){
        return cookie;
    }// end getCookie 
    
    //*** Setters ***
    
    public void setName(String n){
        this.name = n;
    }// end setName 
    
    public void setCookie(Cookie c){
        this.cookie = c;
    }// end setCookie 
    
    //*** other *** 
    public String toString(){
        StringBuilder jar = new StringBuilder();
        jar.append("jar name: " + getName() + " cookie: " + getCookie() + nl); 
        
        return jar.toString(); 
    }// end toString 
} // end of public class