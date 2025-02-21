/*

public class Main { 
    public static void main(String[] args) { 
        int a = 10; 
        int b = 5; 
        int result = a ** b; 
        System.out.println(result); 
    } 
} 

*/



/* Error - Main.java:5: error: bad operand types for binary operator '**'
        int result = a ** b; 
                      ^
  first type:  int
  second type: int
1 error

*/



// Correct code - 


public class Main { 
    public static void main(String[] args) { 
        int a = 10; 
        int b = 5; 
        double result = Math.pow(a, b);
        System.out.println(result);  
    } 
}



/* Why is the ** operator not valid in Java? 

In Java, the ** operator is not recognized because Java does not have a built-in exponentiation operator like Python */
