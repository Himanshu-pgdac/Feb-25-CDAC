class Swap{
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

     // before swap 
        System.out.println("Before swapping:");
        System.out.println("First number: " + a);
        System.out.println("Second number: " + b);

        // Swap without using a third variable
        a = a + b; 
        b = a - b; 
        a = a - b; 

        // after swapping
        System.out.println("After swapping:");
        System.out.println("First number: " + a);
        System.out.println("Second number: " + b);
    }
}
