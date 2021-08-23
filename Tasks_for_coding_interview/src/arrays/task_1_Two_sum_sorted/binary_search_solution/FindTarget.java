package arrays.task_1_Two_sum_sorted.binary_search_solution;

import java.util.Arrays;

/**
 * Given a sorted array of integers
 * and a target sum T
 * Return true if there exists a pair in the array, that sums to T
 */

// Performance <<<==== O(log_n) ====>>>

public class FindTarget {

    public boolean findTargetNum(int[] numbers, int T) {

        for (int i = 0; i < numbers.length; i++) {
            int searchedNumber = Arrays.binarySearch(numbers, T - numbers[i]);
            if (searchedNumber > 0) {
                return true;
            }
        }
        return false;
    }
}
