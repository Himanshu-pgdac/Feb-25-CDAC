/*   Write a program to check if a given number is a  power of 2  using bitwise operators. 
Hint  :  n & (n - 1) == 0  for positive numbers.  */

// Code 

import java.util.Scanner;

class Problem11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        
		int n = scanner.nextInt();
        boolean Square = (n > 0) && ((n & (n - 1)) == 0);
        System.out.println(n + " is a power of 2: " + Square);

        scanner.close();
    }
}

/* Output 
Enter a number: 4
4 is a power of 2: true */
