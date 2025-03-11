/* Q13:  Implement a Java program to find the  absolute value  of an integer using bitwise 
operators. */

// Code

import java.util.Scanner;

class Problem13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = scanner.nextInt();
        int mask = num >> 31;  
        int abs = (num + mask) ^ mask; 

        System.out.println("Absolute value: " + abs);

        scanner.close();
    }
}

/* Output 
Enter an integer: 7
Absolute value: 7  */
