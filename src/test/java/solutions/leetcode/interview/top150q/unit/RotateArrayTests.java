package solutions.leetcode.interview.top150q.unit;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

import solutions.leetcode.interview.top150q.RotateArray;

public class RotateArrayTests {
    private final RotateArray tests = new RotateArray();

    @Test
    void test1() {
        int[] nums = new int[] {1,2,3,4,5,6,7};
        int k=3;
        int[] expect = new int[]{5,6,7,1,2,3,4};
        int[] actual = tests.solution(nums, k);
        System.out.println("Actual: " + Arrays.toString(actual) + "  Expected: " + Arrays.toString(expect) );
        assertArrayEquals(expect, actual);
    }
    @Test
    void test2() {
        int[] nums = new int[] {-1,-100,3,99};
        int k=2;
        int[] expect = new int[]{3,99,-1,-100};
        int[] actual = tests.solution(nums, k);
        System.out.println("Actual: " + Arrays.toString(actual) + "  Expected: " + Arrays.toString(expect) );
         assertArrayEquals(expect, actual);
    }
    @Test
    void test3() {
        int[] nums = new int[] {1,2};
        int k=3;
        int[] expect = new int[]{2,1};
        int[] actual = tests.solution(nums, k);
        System.out.println("Actual: " + Arrays.toString(actual) + "  Expected: " + Arrays.toString(expect) );
         assertArrayEquals(expect, actual);
    }
}
