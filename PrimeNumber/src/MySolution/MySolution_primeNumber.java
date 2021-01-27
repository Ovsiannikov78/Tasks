package MySolution;

import java.util.ArrayList;
import java.util.List;


/**
 * Простым (prime) числом называется число, не имеющее делителей, кроме 1 и самого себя (кроме 1).
 * Написать метод, находящий все простные числа от 2 до N.
 * List<Integer> getPrimes(int upperBound)
 */

public class MySolution_primeNumber {

    public List<Integer> getPrimes(int upperBound) {
        List<Integer> numbers = new ArrayList<>();

        for (int i = 2; i <= upperBound; i++) {
            boolean isPrime = true;
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime)
                numbers.add(i);
        }
        return numbers;
    }
}
