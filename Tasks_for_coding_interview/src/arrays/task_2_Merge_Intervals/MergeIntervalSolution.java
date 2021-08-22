package arrays.task_2_Merge_Intervals;

import java.util.Arrays;
import java.util.Comparator;

/**
 *  Given an array of intervals where intervals[i] = [starti, endi],
 *  merge all overlapping intervals,
 *  and return an array of the non-overlapping intervals that cover all the intervals in the input.
 *
 *  [[1,3],[2,6],[8,10],[15,18]] => [[1,6],[8,10],[15,18]]
 *  [[1,4],[4,5]] => [[1,5]]
 * */

public class MergeIntervalSolution {

    public int[][] mergedIntervalsArr(int[][] intervals) {
        int[][] mergedArr = {};
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));

        for (int[] interval : intervals) {
            if (mergedArr.length > 0 && interval[0] <= mergedArr[mergedArr.length - 1][1]) {
                mergedArr[mergedArr.length - 1][1] = Math.max((mergedArr[mergedArr.length - 1][1]), (interval[1]));
            } else {
                mergedArr = Arrays.copyOf(mergedArr, mergedArr.length + 1);
                mergedArr[mergedArr.length - 1] = interval;
            }
        }
        return mergedArr;
    }
}
