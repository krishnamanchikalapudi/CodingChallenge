package solutions.leetcode.interview.top150q.unit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import solutions.leetcode.interview.top150q.RemoveDuplicatesFromSortedArray2;

public class RemoveDuplicatesFromSortedArray2Tests {
    private RemoveDuplicatesFromSortedArray2 tests = new RemoveDuplicatesFromSortedArray2();

    @Test
    void test1() {
        int[] nums = new int[] {1,1,1,2,2,3};
        int expect = 5;
        int actual = tests.solution(nums);
        System.out.println("Actual: " + actual + "  Expected: " + expect);
        assertEquals(expect, actual);
    }
    @Test
    void test2() {
        int[] nums = new int[] {0,0,1,1,1,1,2,3,3};
        int expect = 7;
        int actual = tests.solution(nums);
        System.out.println("Actual: " + actual + "  Expected: " + expect);
        assertEquals(expect, actual);
    }
}