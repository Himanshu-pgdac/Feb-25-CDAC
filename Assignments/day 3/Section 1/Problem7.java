/* 
public class UninitializedWhileLoop { 
    public static void main(String[] args) { 
        int count; 
 
 
        while (count < 10) { 
            System.out.println(count); 
            count++; 
        } 
    } 
} 
 Error to investigate: Why does this code produce a compilation error? What needs to be done to initialize the loop 
variable properly? */



/* Error -  UninitializedWhileLoop.java:6: error: variable count might not have been initialized
        while (count < 10) {
               ^
1 error */






// Correct code 

public class UninitializedWhileLoop { 
    public static void main(String[] args) { 
        int count = 0;

        while (count < 10) { 
            System.out.println(count); 
            count++; 
        } 
    } 
}

/* Output - 

0
1
2
3
4
5
6
7
8
9  */
