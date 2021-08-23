package arrays.task_1_Two_sum_sorted.two_pointer_solution;

/**
 * Given a sorted array of integers
 * and a target sum T
 * Return true if there exists a pair in the array, that sums to T
 */

// Performance <<<==== O(n) ====>>>

public class FindTarget {

    public boolean findTargetNum(int[] numbers, int T) {

        int start = 0;
        int end = numbers.length - 1;

        for (int i = 0; i < numbers.length; i++) {
            int searchedNumber = numbers[start] + numbers[end];
            if (searchedNumber == T) {
                return true;
            } else if (searchedNumber > T) {
                end -= 1;
            } else {
                start += 1;
            }
        }
        return false;
    }
}
