/* 

public class Main { 
    public static void main(String[] args) { 
        String str = null; 
        System.out.println(str.length()); 
    } 
}

*/


/* Error - Exception in thread "main" java.lang.NullPointerException: Cannot invoke "String.length()" because "str" is null
    at Main.main(Main.java:4) */


// correct code 



public class Main { 
    public static void main(String[] args) { 
        String str = null; 
        if (str != null) {
            System.out.println(str.length()); 
        } else {
            System.out.println("String is null! Cannot get length.");
}
} 
}


/*  Why does it occur? - The variable str is initialized as null. */