public class IncrementDecrement { 
    public static void main(String[] args) { 
        int x = 5; 
        int y = ++x - x-- + --x + x++; 
        System.out.println(y); 
    } 
} 

// Guess the output of this code snippet. 

// Output - 8 





/* Dry Run - 


Initialization: x = 5

First Term: ++x
Pre-increment x: x becomes 6.
Use x: 6

Second Term: x--
Use x: 6
Post-decrement x: x becomes 5.

Third Term: --x
Pre-decrement x: x becomes 4.
Use x: 4

Fourth Term: x++
Use x: 4
Post-increment x: x becomes 5.

Substituting Values into the Expression: y = 6 - 6 + 4 + 4
                                           = 8 

*/