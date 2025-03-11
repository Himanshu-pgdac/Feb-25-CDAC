/*   Write a program to count the  number of 1s (set bits)  in a binary representation of a 
number using bitwise operations. */

// Code 

import java.util.Scanner;

class Problem14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        int count = 0;
        while (n > 0) {
            n = n & (n - 1); 
            count++;
        }
        System.out.println("Number of set bits: " + count);

        scanner.close();
    }
}

/* Output
Enter a number: 34
Number of set bits: 2 */