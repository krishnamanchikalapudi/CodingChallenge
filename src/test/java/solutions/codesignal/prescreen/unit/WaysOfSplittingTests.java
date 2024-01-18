package solutions.codesignal.prescreen.unit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import solutions.codesignal.prescreen.WaysOfSplitting;


public class WaysOfSplittingTests {
     private final WaysOfSplitting tests = new WaysOfSplitting();
    @Test
    void test1() {
        String s="xzxzx";
        int actual = tests.solution(s);
        int expect= 5;
        System.out.println("Actual: " + actual + "  Expected: " + expect );
        assertEquals(expect, actual);
    }
    @Test
    void test2() {
        String s="xzy";
        int actual = tests.solution(s);
        int expect= 1;
        System.out.println("Actual: " + actual + "  Expected: " + expect );
        assertEquals(expect, actual);
    }
    @Test
    void test3() {
        String s="xxx";
        int actual = tests.solution(s);
        int expect= 0;
        System.out.println("Actual: " + actual + "  Expected: " + expect );
        assertEquals(expect, actual);
    }
    @Test
    void test4() {
        String s="xzxzxzxzxz";
        int actual = tests.solution(s);
        int expect= 30;
        System.out.println("Actual: " + actual + "  Expected: " + expect );
        assertEquals(expect, actual);
    }
    @Test
    void test5() {
        String s="xxxxxxxxxx";
        int actual = tests.solution(s);
        int expect= 24;
        System.out.println("Actual: " + actual + "  Expected: " + expect );
        assertEquals(expect, actual);
    }
}
