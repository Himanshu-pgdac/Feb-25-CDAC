/* 

public class Main { 
    public static void main(String[] args) { 
        double num = "Hello"; 
        System.out.println(num); 
    } 
}

*/


/* Error - Main.java:3: error: incompatible types: String cannot be converted to double
        double num = "Hello"; 
                     ^
1 error  */


// correct code 



public class Main { 
    public static void main(String[] args) { 
        String num = "Hello";
        System.out.println(num); 
} 
}



/*  Why does Java enforce data type constraints? - Because of type safety, reliability, and performance. java is statically typed language. */
