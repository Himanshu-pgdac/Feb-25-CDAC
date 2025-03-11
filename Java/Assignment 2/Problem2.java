/* Write a program to check whether a given number is  even or odd  using only  bitwise 
operators  . 
Hint  : Use  n & 1  to check. */

// Code 

import java.util.Scanner;

class EvenOddBitwise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        
        if ((n & 1) == 0) {
            System.out.println(n + " is Even");
        } else {
            System.out.println(n + " is Odd");
        }
        
        scanner.close();
    }
}

/*  Output 
Enter a number: 2
2 is Even  */