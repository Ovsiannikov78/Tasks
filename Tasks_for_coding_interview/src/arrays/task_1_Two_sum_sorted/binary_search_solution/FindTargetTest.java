package arrays.task_1_Two_sum_sorted.binary_search_solution;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindTargetTest {

    private FindTarget findTarget = new FindTarget();
    int[] numbers = {1,2,4,7,9,15,20,30,45,55};

    @Test
    void testFindTargetNum_9() {
        int targetNum = 9;
        boolean akt = findTarget.findTargetNum(numbers, targetNum);

        assertTrue(akt);
    }
    @Test
    void testFindTargetNum_10() {
        int targetNum = 10;
        boolean akt = findTarget.findTargetNum(numbers, targetNum);

        assertTrue(akt);
    }
    @Test
    void testFindTargetNum_6() {
        int targetNum = 6;
        boolean akt = findTarget.findTargetNum(numbers, targetNum);

        assertTrue(akt);
    }

    @Test
    void testFindTargetNum_5() {
        int targetNum = 5;
        boolean akt = findTarget.findTargetNum(numbers, targetNum);

        assertTrue(akt);
    }

    @Test
    void testFindTargetNum_29() {

        int targetNum = 29;
        boolean akt = findTarget.findTargetNum(numbers, targetNum);

        assertTrue(akt);
    }

    @Test
    void testFindTargetNum_100() {
        int targetNum = 100;
        boolean akt = findTarget.findTargetNum(numbers, targetNum);

        assertTrue(akt);
    }

    @Test
    void testFindTargetNum_7() {
        int targetNum = 7;
        boolean akt = findTarget.findTargetNum(numbers, targetNum);

        assertFalse(akt);
    }

    @Test
    void testFindTargetNum_20() {
        int targetNum = 20;
        boolean akt = findTarget.findTargetNum(numbers, targetNum);

        assertFalse(akt);
    }
}
