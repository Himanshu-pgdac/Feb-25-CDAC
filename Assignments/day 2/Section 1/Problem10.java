/* 

public class Main { 
    public void display() { 
        System.out.println("No parameters"); 
    } 
    public void display(int num) { 
        System.out.println("With parameter: " + num); 
    } 
    public static void main(String[] args) { 
        display(); 
        display(5); 
    } 
}

*/


/* Error - Main.java:10: error: non-static method display() cannot be referenced from a static context
        display(); 
        ^
Main.java:11: error: non-static method display(int) cannot be referenced from a static context
        display(5); 
        ^
2 errors */


// correct code 


public class Main { 
    public void display() { 
        System.out.println("No parameters"); 
    } 

    public void display(int num) { 
        System.out.println("With parameter: " + num); 
    } 

    public static void main(String[] args) { 
        Main obj = new Main();
        obj.display(); 
        obj.display(5); 
    } 
}


/*  Is method overloading allowed? - Yes, method overloading is allowed in Java. */