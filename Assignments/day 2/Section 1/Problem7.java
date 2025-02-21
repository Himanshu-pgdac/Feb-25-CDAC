/* 

    public static void main(String[] args) { 
        int x = "Hello"; 
        System.out.println(x); 
    } 
} 

*/ 


/* Error - Main.java:3: error: incompatible types: String cannot be converted to int
        int x = "Hello"; 
                ^
1 error */

// correct code 

public class Main { 
    public static void main(String[] args) { 
        String x = "Hello"; // Declare x as a String
        System.out.println(x); 
    } 
}

/* Why does Java enforce type safety? - Java enforces type safety to prevent mistakes in the program */