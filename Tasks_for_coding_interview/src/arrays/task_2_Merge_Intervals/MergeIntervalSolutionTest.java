package arrays.task_2_Merge_Intervals;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MergeIntervalSolutionTest {

   private final MergeIntervalSolution mergeIntervalSolution = new MergeIntervalSolution();


    @Test
    void testMergedIntervalsArr_1() {
        int[][] intervals = {{1,4},{4,5}};
        int[][] expArr = {{1,5}};
        int[][] aktArr = mergeIntervalSolution.mergedIntervalsArr(intervals);

        assertArrayEquals(expArr,aktArr);
    }

    @Test
    void testMergedIntervalsArr_2() {
        int[][] intervals = {{1,3},{2,6},{8,10},{15,18}};
        int[][] expArr = {{1,6},{8,10},{15,18}};
        int[][] aktArr = mergeIntervalSolution.mergedIntervalsArr(intervals);

        assertArrayEquals(expArr,aktArr);
    }

    @Test
    void testMergedIntervalsArr_3() {
        int[][] intervals = {{1,4},{3,9},{5,10}};
        int[][] expArr = {{1,10}};
        int[][] aktArr = mergeIntervalSolution.mergedIntervalsArr(intervals);

        assertArrayEquals(expArr,aktArr);
    }

    @Test
    void testMergedIntervalsArr_4() {
        int[][] intervals = {{1,3},{7,9},{2,5}};
        int[][] expArr = {{1,5},{7,9}};
        int[][] aktArr = mergeIntervalSolution.mergedIntervalsArr(intervals);

        assertArrayEquals(expArr,aktArr);
    }

    @Test
    void testMergedIntervalsArr_5() {
        int[][] intervals = {{1,4},{1,5}};
        int[][] expArr = {{1,5}};
        int[][] aktArr = mergeIntervalSolution.mergedIntervalsArr(intervals);

        assertArrayEquals(expArr,aktArr);
    }

    @Test
    void testMergedIntervalsArr_6() {
        int[][] intervals = {{1,4}};
        int[][] expArr = {{1,4}};
        int[][] aktArr = mergeIntervalSolution.mergedIntervalsArr(intervals);

        assertArrayEquals(expArr,aktArr);
    }

    @Test
    void testMergedIntervalsArr_7() {
        int[][] intervals = {{1,3},{5,8},{9,11}};
        int[][] expArr = {{1,3},{5,8},{9,11}};
        int[][] aktArr = mergeIntervalSolution.mergedIntervalsArr(intervals);

        assertArrayEquals(expArr,aktArr);
    }
}
