public class LoopIncrement { 
    public static void main(String[] args) { 
        int count = 0; 
        for (int i = 0; i < 4; i++) { 
            count += i++ - ++i; 
        } 
        System.out.println(count); 
    } 
 
 
} 

// Guess the output of this code

// Output - -4



/* Dry Run - 

Initialization:
count = 0
i = 0

First Iteration (i = 0):
i++ - Use i = 0, then increment (i = 1).
++i - Increment i (i = 2), then use i = 2.

Compute i++ - ++i:
        0 - 2 = -2

count += -2 → count = -2
Loop increments i again (i++ in for statement) → i = 3.

Second Iteration (i = 3):
i++ - Use i = 3, then increment (i = 4).
++i - Increment i (i = 5), then use i = 5.

Compute i++ - ++i:
        3 - 5 = -2

count += -2 → count = -4
Loop increments i again (i++ in for statement) → i = 6, which exits the loop (i < 4 condition fails). 

*/