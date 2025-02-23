public class WhileLoopBreak { 
    public static void main(String[] args) { 
        int count = 0; 
        while (count < 5) { 
            System.out.print(count + " "); 
            count++; 
            if (count == 3) break; 
        } 
        System.out.println(count); 
    } 
} 

// Guess the output of this while loop.



// Output - 0 1 2 3





/* Dry Run - 

First Iteration (count = 0):

Print: 0
Increment count - count = 1
Condition count == 3 is false, continue.
Second Iteration (count = 1):

Print: 1
Increment count - count = 2
Condition count == 3 is false, continue.
Third Iteration (count = 2):

Print: 2
Increment count - count = 3
Condition count == 3 is true, so break; is executed.
The loop exits
After the loop, System.out.println(count); prints 3

