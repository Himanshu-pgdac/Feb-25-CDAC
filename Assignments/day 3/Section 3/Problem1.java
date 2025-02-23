// 1. Write a program to calculate the sum of the first 50 natural numbers.


class Sum {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 50; i++) {
          sum = sum + i;
        }
        System.out.println("The sum of the first 50 natural numbers is: " + sum);
    }
}




// Output - The sum of the first 50 natural numbers is: 1275
