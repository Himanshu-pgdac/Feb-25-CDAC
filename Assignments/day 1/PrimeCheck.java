class PrimeCheck {
    public static void main(String[] args) {
        int num = 17;
        boolean isPrime = true;

        for (int i = 2; i < num; i++) {
            if (num % i == 0) { 
                isPrime = false;
                break;
            }
        }

        if (isPrime && num > 1) {
            System.out.println(num + " is Prime.");
        } else {
            System.out.println(num + " is Not Prime.");
        }
    }
}
