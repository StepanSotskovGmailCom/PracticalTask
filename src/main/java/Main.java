import com.sun.deploy.util.StringUtils;

import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String... args) {
        primeNumbers(7);
    }

    public static double areaOfTriangle(double a, double b) {
        if (a <= 0 || b <= 0) {
            throw new IllegalArgumentException("Values should be positive");
        }
        return (a * b) / 2;
    }

    public static boolean isOdd(int a) {
        return a % 2 != 0;
    }

    public static String personalizedGreeting(String name, String friendsName) {
        if (isNullorBlank(name) || isNullorBlank(friendsName)) {
            throw new IllegalArgumentException("Values must be not empty");
        }
        return String.format("Hello %s! Your friend %s invited you to join this app!", name, friendsName);
    }

    private static boolean isNullorBlank(String value) {
        return value == null || value.length() == 0;
    }

    public static void primeNumbers(int x) {

        if (x < 1) {
            throw new IllegalArgumentException("Value should be greater than 0");
        }
        List<Integer> primes = generatePrimes(x);
        for (int i = 0; i < primes.size(); i++) {
            System.out.printf("Prime number (%d): %d %n", i + 1, primes.get(i));
        }
    }

    public static List<Integer> generatePrimes(int x) {
        List<Integer> primes = new LinkedList<>();
        primes.add(2);
        int count = 3;
        while (primes.size() != x) {
            if (isPrime(count)) {
                primes.add(count);
            }
            count += 2;
        }
        return primes;
    }


    public static boolean isPrime(int number) {
        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}