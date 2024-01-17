package solutions.hackerrank.interview.dictionaries.unit;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import solutions.hackerrank.interview.dictionaries.SherlockAndAnagrams;

public class SherlockAndAnagramsTests {
    private final SherlockAndAnagrams tests = new SherlockAndAnagrams();

    @Test
    void test1() {
        String s = "abba";
        int actual = tests.solution(s);
        int expect=4;
        System.out.println("Actual: " + actual + "  Expected: " + expect);
        assertEquals(expect, actual);
    }
    @Test
    void test2() {
        String s = "abcd";
        int actual = tests.solution(s);
        int expect=0;
        System.out.println("Actual: " + actual + "  Expected: " + expect);
        assertEquals(expect, actual);
    }
    @Test
    void test3() {
        String s = "ifailuhkqq";
        int actual = tests.solution(s);
        int expect=3;
        System.out.println("Actual: " + actual + "  Expected: " + expect);
        assertEquals(expect, actual);
    }
    @Test
    void test4() {
        String s = "kkkk";
        int actual = tests.solution(s);
        int expect=10;
        System.out.println("Actual: " + actual + "  Expected: " + expect);
        assertEquals(expect, actual);
    }
    @Test
    void test5() {
        String s = "cdcd";
        int actual = tests.solution(s);
        int expect=5;
        System.out.println("Actual: " + actual + "  Expected: " + expect);
        assertEquals(expect, actual);
    }
}
