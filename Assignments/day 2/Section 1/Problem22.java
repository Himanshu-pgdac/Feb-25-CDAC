/*

public class Main { 
    public static void main(String[] args) { 
        static void displayMessage() { 
            System.out.println("Message"); 
        } 
    } 
}

*/


/* Error - Main22.java:3: error: illegal start of expression
        static void displayMessage() {
        ^
Main22.java:7: error: class, interface, or enum expected
}
^
2 errors  */


// correct code - 



public class Main { 
    static void displayMessage() { 
        System.out.println("Message"); 
    } 

    public static void main(String[] args) { 
        displayMessage();
    } 
}


/* Can a method be declared inside another method? - No, Java does not allow method declarations inside another method. */