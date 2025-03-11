// Q5:  Write a Java program to  swap two numbers  using the  +=  and  -=  operators only. 

// Code


import java.util.Scanner;

class SwapUsingAddSub {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter first number: ");
        int a = scanner.nextInt();
        System.out.print("Enter second number: ");
        int b = scanner.nextInt();
        
        System.out.println("Before swapping: a = " + a + ", b = " + b);
        a += b; 
        b = a - b; 
        a -= b; 
        
        System.out.println("After swapping: a = " + a + ", b = " + b);
        
        scanner.close();
    }
}

/* Output 
Enter first number: 3
Enter second number: 5
Before swapping: a = 3, b = 5
After swapping: a = 5, b = 3   */