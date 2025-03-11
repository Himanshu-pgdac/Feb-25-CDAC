/*   Write a Java program to  multiply a number by 8  without using  *  or  /  operators. 
Hint  : Use bitwise left shift (  <<  ). */ 

// Code

import java.util.Scanner;

class Problem12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        int result = num << 3;

        System.out.println(num + " multiplied by 8 is: " + result);

        scanner.close();
    }
}

/* Output 
Enter a number: 12
12 multiplied by 8 is: 96  */