package solutions.leetcode.interview.top150q.unit;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

import solutions.leetcode.interview.top150q.MajorityElement;

public class MajorityElementTests {
    private final MajorityElement tests = new MajorityElement();
    @Test
    void test1() {
        int[] nums = new int[] {3,2,3};
        int actual = tests.solution(nums);
        int expect= 3;
        System.out.println("Actual: " + actual + "  Expected: " + expect );
        assertEquals(expect, actual);
    }
    @Test
    void test2() {
        int[] nums = new int[] {2,2,1,1,1,2,2};
        int actual = tests.solution(nums);
        int expect= 2;
        System.out.println("Actual: " + actual + "  Expected: " + expect );
        assertEquals(expect, actual);
    }
}
