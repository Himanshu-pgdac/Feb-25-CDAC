/*


public class Main { 
    public static void main(String[] args) { 
        int num1 = 10; 
        double num2 = 5.5; 
        int result = num1 + num2; 
        System.out.println(result); 
    } 
} 


*/


/* Error - Main.java:5: error: incompatible types: possible lossy conversion from double to int
        int result = num1 + num2;
                     ^
1 error */


// correct code - 


public class Main { 
    public static void main(String[] args) { 
        int num1 = 10; 
        double num2 = 5.5; 
        double result = num1 + num2;
        System.out.println(result);  
    } 
}


/*   How should you handle different data types in operations? - By using Type casting method and Implicit Type Conversion. */