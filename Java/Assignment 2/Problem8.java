/*   Write a program that  takes three boolean inputs  and prints  true  if at least two of 
them are  true  . 
Hint  : Use logical operators (  &&  ,  ||  ) */

// Code 

import java.util.Scanner;

class Problem8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first boolean value (true/false): ");
        boolean a = scanner.nextBoolean();
        System.out.print("Enter second boolean value (true/false): ");
        boolean b = scanner.nextBoolean();
        System.out.print("Enter third boolean value (true/false): ");
        boolean c = scanner.nextBoolean();

        boolean result = (a && b) || (b && c) || (a && c);

        System.out.println("At least two are true: " + result);

        scanner.close();
    }
}

/* Output 
Enter first boolean value (true/false): true
Enter second boolean value (true/false): false
Enter third boolean value (true/false): false
At least two are true: false  */
