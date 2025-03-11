/*   Implement a program that calculates the  sum of digits  of an integer using  modulus 
(  %  ) and division (  /  ) operators  . */

// Code 

import java.util.Scanner;

 class SumOfDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = scanner.nextInt();
        
        int sum = 0;
     
        while (num != 0) {
            sum += num % 10; 
            num /= 10; 
        }
         System.out.println("Sum of digits: " + sum);
        scanner.close();
    }
}

/* Output 
Enter an integer: 456
Sum of digits: 15 */