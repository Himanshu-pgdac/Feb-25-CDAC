/*  Q7:  Implement a Java program that checks whether a given year is a  leap year or not  using 
logical (  &&  ,  ||  ) operators  */

// 	Code 


import java.util.Scanner;

class LeapYearCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int year = scanner.nextInt();

        boolean isLeap = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
		
        if (isLeap) {
            System.out.println(year + " is a Leap Year.");
        } else {
            System.out.println(year + " is not a Leap Year.");
        }

        scanner.close();
    }
}


/* Output 
Enter a year: 2024
2024 is a Leap Year. */