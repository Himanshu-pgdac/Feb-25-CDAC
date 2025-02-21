/*

public class Main { 
    public static void main(String[] args) { 
        int class = 10; 
        System.out.println(class); 
    } 
} 

*/

/* Error - Main.java:3: error: class is a keyword
        int class = 10; 
            ^
1 error */

// correct code 


public class Main { 
    public static void main(String[] args) { 
        int myClass = 10;
        System.out.println(myClass); 
    } 
}


/* Why can't reserved keywords be used as identifiers? - Reserved keywords can't be used as identifiers because they have special meanings in the language. */

