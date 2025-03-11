/*   Implement a program to swap  odd and even bits  of a number using bitwise 
operators. */

// Code 

import java.util.Scanner;
class Problem15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int x = scanner.nextInt();

        int even = 0xAAAAAAAA; 
        int odd = 0x55555555;  
        int swapped = ((x & even) >> 1) | ((x & odd) << 1);
        System.out.println("Number after swapping odd and even bits: " + swapped);

        scanner.close();
    }
}

/* Output
Enter a number: 7
Number after swapping odd and even bits: 11 */