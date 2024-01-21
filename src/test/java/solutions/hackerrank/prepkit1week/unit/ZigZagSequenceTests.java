package solutions.hackerrank.prepkit1week.unit;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

import solutions.hackerrank.prepkit1week.ZigZagSequence;

public class ZigZagSequenceTests {
    private final ZigZagSequence tests = new ZigZagSequence();

    @Test
    void test1() {
        int[] actual = tests.solution(new int[]{2,3,5,1,4});
        int[] expect = new int[]{1,2,5,4,3};
        System.out.println("Actual: "+ Arrays.toString(actual) + "; Expect: "+ Arrays.toString(expect));
        assertArrayEquals(expect, actual);
    }
    @Test
    void test2() {
        int[] actual = tests.solution(new int[]{1,2,3,4,5,6,7});
        int[] expect = new int[]{1,2,3,7,6,5,4};
        System.out.println("Actual: "+ Arrays.toString(actual) + "; Expect: "+ Arrays.toString(expect));
        assertArrayEquals(expect, actual);
    }
    @Test
    void test3() {
        int[] actual = tests.solution(new int[]{25, 8, 20, 45, 49, 12, 35, 36, 39, 31, 3, 47, 30, 33, 37, 23, 14, 9, 27, 6, 10, 22, 24, 15, 43, 28, 38, 40, 17, 34, 21, 16, 4, 46, 7, 5, 44, 50, 26, 18, 32, 29, 42, 1, 48, 41, 19, 11, 2});
        int[] expect = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 50, 49, 48, 47, 46, 45, 44, 43, 42, 41, 40, 39, 38, 37, 36, 35, 34, 33, 32, 31, 30, 29, 28, 27, 26};
        System.out.println("Actual: "+ Arrays.toString(actual) + "; Expect: "+ Arrays.toString(expect));
        assertArrayEquals(expect, actual);
    }

}
