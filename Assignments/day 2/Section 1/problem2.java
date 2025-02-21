/*

public class problem2 { 
    static void main(String[] args) { 
        System.out.println("Hello, World!"); 
    } 
}

*/



/* Error : Error: Main method not found in class problem2, please define the main method as: public static void main(String[] args)
or a JavaFX application class must extend javafx.application.Application */

// Correct code

 

  
 class problem2 { 
    public static void main(String[] args) { // Added "public" before "static"
        System.out.println("Hello, World!"); 
    } 
}
