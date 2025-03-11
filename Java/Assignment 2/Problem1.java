/* Q1:  Write a program to swap two numbers  without using a third variable  and without 
using arithmetic operators like  +  or  - */

// Code 

import java.util.Scanner;

class SwapUsingXOR {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		
        System.out.print("Enter first number: ");
        int a = scanner.nextInt();

        System.out.print("Enter second number: ");
        int b = scanner.nextInt();

        System.out.println("Before swapping: a = " + a + ", b = " + b);
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("After swapping: a = " + a + ", b = " + b);
        scanner.close();
    }
}


/* Output - 
Enter first number: 2
Enter second number: 4
Before swapping: a = 2, b = 4
After swapping: a = 4, b = 2 */