public class DoWhileLoop { 
    public static void main(String[] args) { 
        int i = 1; 
        do { 
            System.out.print(i + " "); 
            i++; 
        } while (i < 5); 
        System.out.println(i); 
    } 
} 

// Guess the output of this do-while loop. 


// Output - 1 2 3 4 5


/* Dry Run - 

First Iteration (i = 1):
Print: 1
Increment i   i = 2

Second Iteration (i = 2):
Print: 2
Increment i   i = 3

Third Iteration (i = 3):
Print: 3
Increment i   i = 4

Fourth Iteration (i = 4):
Print: 4
Increment i   i = 5

Loop Condition Check (i < 5):
i = 5, condition fails.
The loop exits.

After the loop, 
System.out.println(i); prints 5. */