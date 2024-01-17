package solutions.leetcode.interview.top150q.unit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

import solutions.leetcode.interview.top150q.RemoveElement;

public class RemoveElementTests {
    private final RemoveElement test = new RemoveElement();

    @Test
    void test1() {
        int[] nums = new int[] {3,2,2,3};
        int expect = 2;
        int actual = test.solution(nums, 3);
        System.out.println("Actual: " + actual + "  Expected: " + expect);
        assertEquals(expect, actual);
    }

    @Test
    void test2() {
        int[] nums = new int[] {0,1,2,2,3,0,4,2};
        int expect = 5;
        int actual = test.solution(nums, 2);
        System.out.println("Actual: " + actual + "  Expected: " + expect);
        assertEquals(expect, actual);
    }

}
