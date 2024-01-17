package solutions.leetcode.interview.top150q.unit;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

import solutions.leetcode.interview.top150q.MergeArrays;

public class MergeArraysTests {
    private final MergeArrays tests = new MergeArrays();
    
    @Test
    void test1() {
        int[] num1 = new int[] {1,2,3,0,0,0};
        int[] num2 = new int[] {2,5,6};
        int m=3, n=3;
        int[] actual = tests.solution(num1, m, num2, n);
        int[] expect=new int[] {1,2,2,3,5,6};
        System.out.println("Actual: " + Arrays.toString(actual) + "  Expected: " + Arrays.toString(expect) );
        assertArrayEquals(expect, actual);
    }
    @Test
    void test2() {
        int[] num1 = new int[] {1};
        int[] num2 = new int[] {};
        int m=1, n=0;
        int[] actual = tests.solution(num1, m, num2, n);
        int[] expect=new int[] {1};
        System.out.println("Actual: " + Arrays.toString(actual) + "  Expected: " + Arrays.toString(expect) );
        assertArrayEquals(expect, actual);
    }
    @Test
    void test3() {
        int[] num1 = new int[] {0};
        int[] num2 = new int[] {1};
        int m=0, n=1;
        int[] actual = tests.solution(num1, m, num2, n);
        int[] expect=new int[] {1};
        System.out.println("Actual: " + Arrays.toString(actual) + "  Expected: " + Arrays.toString(expect) );
        assertArrayEquals(expect, actual);
    }

}
