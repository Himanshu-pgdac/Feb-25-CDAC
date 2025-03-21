/*
public class MisplacedForLoopBody { 
    public static void main(String[] args) { 
        for (int i = 0; i < 5; i++) 
            System.out.println(i); 
            System.out.println("Done"); 
    } 
}


 
 Error to investigate: Why does "Done" print only once, outside the loop? How should the loop body be enclosed to 
include all statements within the loop? 

OUTPUT - 0
1
2
3
4
Done  */




// Correct code 

public class MisplacedForLoopBody { 
    public static void main(String[] args) { 
        for (int i = 0; i < 5; i++) {
            System.out.println(i); 
            System.out.println("Done"); // Now this is part of the loop body
        }
    } 
}

/* OUTPUT - 

0
Done
1
Done
2
Done
3
Done 
4
Done  */