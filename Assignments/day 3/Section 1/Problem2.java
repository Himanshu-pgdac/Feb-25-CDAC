/*

public class IncorrectWhileConditio { 
    public static void main(String[] args) { 
        int count = 5; 
        while (count = 0) {
            System.out.println(count); 
            count--; 
        } 
    } 
} 

*/



 // Error to investigate: Why does the loop not execute as expected? What is the issue with the condition in the `while` loop?

// Correct code 


public class IncorrectWhileConditio { 
    public static void main(String[] args) { 
        int count = 5; 
        while (count > 0) {
            System.out.println(count); 
            count--; 
        } 
    } 
} 



 /* Output - 
           5
           4
           3
           2
           1 */



