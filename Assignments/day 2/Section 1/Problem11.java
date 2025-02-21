/* 

public class Main { 
    public static void main(String[] args) { 
        int[] arr = {1, 2, 3}; 
        System.out.println(arr[5]); 
    } 
}

*/



/* Error - Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 3
    at Main.main(Main.java:4) */




// Correct code - 


public class Main { 
    public static void main(String[] args) { 
        int[] arr = {1, 2, 3}; 
    
        if (arr.length > 5) {
            System.out.println(arr[5]);
        } else {
            System.out.println("Index out of bounds!");
        }
    } 
}


/* Why does it occur? - The error occurs because we're trying to access an array index that does not exist.*/

