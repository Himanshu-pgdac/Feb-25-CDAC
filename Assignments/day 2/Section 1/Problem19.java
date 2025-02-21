/* 

public class Main { 
    public static void main(String[] args) { 
        int a = 10; 
        int b = 0; 
        int result = a / b; 
        System.out.println(result); 
    } 
}

*/


/* Error - Exception in thread "main" java.lang.ArithmeticException: / by zero
    at Main.main(Main.java:5)  */


// correct code 


public class Main { 
    public static void main(String[] args) { 
        int a = 10; 
        int b = 0; 
        
        if (b != 0) {
            int result = a / b;
            System.out.println(result);
} else {
            System.out.println("Division by zero is not allowed");
}
} 
}


/* Why does division by zero cause an issue in Java? 

Division by zero is undefined in mathematics, so Java doesn’t allow it for integers. Java does not have a way to represent infinity (∞) for integers. */


