package solutions.leetcode.interview.top150q.unit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import solutions.leetcode.interview.top150q.RemoveDuplicatesFromSortedArray;

public class RemoveDuplicatesFromSortedArrayTests {
    private RemoveDuplicatesFromSortedArray tests = new RemoveDuplicatesFromSortedArray();
     @Test
    void test1() {
        int[] nums = new int[] {1,1,2};
        int expect = 2;
        int actual = tests.solution(nums);
        System.out.println("Actual: " + actual + "  Expected: " + expect);
        assertEquals(expect, actual);
    }
    @Test
    void test2() {
        int[] nums = new int[] {1,2,2};
        int expect = 2;
        int actual = tests.solution(nums);
        System.out.println("Actual: " + actual + "  Expected: " + expect);
        assertEquals(expect, actual);
    }
    @Test
    void test3() {
        int[] nums = new int[] {0,0,1,1,1,2,2,3,3,4};
        int expect = 5;
        int actual = tests.solution(nums);
        System.out.println("Actual: " + actual + "  Expected: " + expect);
        assertEquals(expect, actual);
    }
}