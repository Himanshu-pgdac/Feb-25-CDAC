// Write a Java program to demonstrate the use of both pre-increment and post-decrement operators in a single expression.


class PreIncrementPostDecrement {
    public static void main(String[] args) {
        int a = 7, b = 16;
        
        int result = ++a + b--; 
        
        System.out.println("Value of a: " + a); 
        System.out.println("Value of b: " + b);  
        System.out.println("Result: " + result); 
    }
}



/* Output - 

Value of a: 8
Value of b: 15
Result: 24   */