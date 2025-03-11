/*  Implement a Java program that finds the  minimum of four numbers  using nested 
ternary operators. */

// Code 

import java.util.Scanner;

class Problem17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter four numbers: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();

        int min = (a < b) 
                    ? ((a < c) 
                        ? ((a < d) ? a : d) 
                        : ((c < d) ? c : d)) 
                    : ((b < c) 
                        ? ((b < d) ? b : d) 
                        : ((c < d) ? c : d));

        System.out.println("The minimum number is: " + min);

        scanner.close();
    }
}

/* Output 
Enter four numbers: 5 8 6 9
The minimum number is: 5
*/