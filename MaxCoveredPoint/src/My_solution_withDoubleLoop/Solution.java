package My_solution_withDoubleLoop;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public int maxCoveredPoints(List<Integer> list, int cut) {
        List<Integer> numbers = new ArrayList<>(list);
        int res = 0;
        if (!numbers.isEmpty()) {
            for (int i = 0; i < numbers.size(); i++) {
                int pointCounter = 1;
                for (int j = i + 1; j < numbers.size(); j++) {
                    if (cut >= (numbers.get(j) - numbers.get(i))) {
                        pointCounter++;
                    } else {
                        break;
                    }
                }
                if (res < pointCounter) {
                    res = pointCounter;
                }
            }
        }
        return res;
    }
}
