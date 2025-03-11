/*   Write a program to find whether a given number is  divisible by 3  without using the 
modulus (  %  ) or division (  /  ) operators. */

// Code 

import java.util.Scanner;

class SumOfDigits {
    public static boolean isDivisibleBy3(int num) {
        if (num < 0) {
            num = -num;
        }
        while (num > 3) {
            int sum = 0;
            while (num != 0) {
                sum += num & 1;
                num >>= 1;
            }
            num = sum;
        }
        return num == 0 || num == 3;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = scanner.nextInt();
        
        if (isDivisibleBy3(num)) {
            System.out.println(num + " is divisible by 3.");
        } else {
            System.out.println(num + " is not divisible by 3.");
        }
        
        scanner.close();
    }
}

/* Output
Enter an integer: 8001
8001 is divisible by 3. */


