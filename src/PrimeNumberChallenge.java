public class PrimeNumberChallenge {
    public static void main(String[] args) {
//        System.out.println("Number 1 is " + (isPrime(1)? "" : "not ") + "a prime number.");
        System.out.println(primeNumberCounter(150, 1000));
        System.out.println(isPrime(4));
    }
    public static boolean isPrime(int number) {
        boolean isPrime = true;
        if (number <= 2) {
            isPrime = (number == 2);
        }
        for (int divisor = 2; divisor < number /2; divisor++) {
            if (number % divisor == 0 ){
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }

    public static String primeNumberCounter(int minNumberRange, int maxNumberRange) {
        int primeNumberCount = 0;
        for (int i  = minNumberRange; i <= maxNumberRange; i++) {
            if (isPrime(i)) {
               primeNumberCount++;
               System.out.println("Number " + i + " is prime.");
            }
        }
        return "Between " + minNumberRange + " and " + maxNumberRange + " are " + primeNumberCount + " prime numbers.";
    }
}
