public class NestedIncrement { 
    public static void main(String[] args) { 
        int a = 10; 
        int b = 5; 
        int result = ++a * b-- - --a + b++; 
        System.out.println(result); 
    } 
} 

// Guess the output of this code snippet. 

// Output - 49




/* Dry Run - 


Initialization:
a = 10
b = 5

First Term: ++a * b--

Pre-increment a   a becomes 11.
Use a: 11

Use b: 5
Post-decrement b   b becomes 4.

Computation: 11 * 5 = 55

Second Term: --a
Pre-decrement a    a becomes 10.
Use a: 10

Third Term: b++
Use b: 4
Post-increment b   b becomes 5.

result = ++a * b-- - --a + b++;
       =  55 - 10 + 5
       =  49
*/