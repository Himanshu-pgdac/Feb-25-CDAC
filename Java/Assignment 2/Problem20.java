/*   Implement a Java program that  returns the absolute value  of a given number using 
the ternary operator (without using  Math.abs()  */ 

// Code 

import java.util.Scanner;

class Problem20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        int absValue = (num < 0) ? -num : num;
        System.out.println("Absolute value: " + absValue);

        scanner.close();
    }
}


/* Output 
Enter a number: 4
Absolute value: 4 */