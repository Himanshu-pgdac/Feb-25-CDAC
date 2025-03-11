/*  Write a program that determines whether a given number is  positive, negative, or 
zero  using only the  ternary operator */

// Code 

import java.util.Scanner;

class Problem16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        String result = (num == 0) ? "Zero" : (num > 0) ? "Positive" : "Negative";

        System.out.println("The number is: " + result);

        scanner.close();
    }
}

/* Output 
Enter a number: -9
The number is: Negative */
