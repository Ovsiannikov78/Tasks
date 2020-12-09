package Task_1.Solution_3;

import java.util.List;

/**
 * Есть лист целых ( Integer) чисел.
 * Известно что каждое число, кроме одного, имеет пару.
 * Найти число без пары. {3, 5, 3} -> 5; {3,5,3,3,3} -> 5; {3,5,3,5,3} -> 3
 */

public class Solution {

    public Integer findNumberWithoutPair(List<Integer> list) {
        Integer res = 0;
        for (Integer num : list) {
            res ^= num;
        }
        return res;
    }
}

