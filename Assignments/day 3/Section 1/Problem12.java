/*
public class LoopVariableScope { 
    public static void main(String[] args) { 
        for (int i = 0; i < 5; i++) { 
            int x = i * 2; 
        } 
        System.out.println(x); // Error: 'x' is not accessible here 
    } 
} */

// Error to investigate: Why does the variable 'x' cause a compilation error? How does scope

/* Error - LoopVariableScope.java:6: error: cannot find symbol
        System.out.println(x); // Error: 'x' is not accessible here
                           ^
  symbol:   variable x
  location: class LoopVariableScope
1 error */




// correct code 

public class LoopVariableScope { 
    public static void main(String[] args) { 
        int x = 0; 

        for (int i = 0; i < 5; i++) { 
            x = i * 2;
        } 

        System.out.println(x);    
   }  
}

// OUTPUT - 8 
 



