/*
public class Main { 
    public static void main() { 
        System.out.println("Hello, World!"); 
    } 
}
*/


/* Error : Main.java:2: error: main method not found in class Main, please define the main method as:
    public static void main(String[] args)
    public static void main() {
                           ^
1 error */


// Correct code 

public class Main { 
    public static void main(String[] args) { 
        System.out.println("Hello, World!"); 
    } 
}

/* Why is String[] args needed? 

The String[] args parameter in the main method is needed because it allows the Java program to accept command-line arguments when it is run. */