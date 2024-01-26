package solutions.leetcode.interview.top75q.unit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import solutions.leetcode.interview.top75q.ReverseVowels;

public class ReverseVowelsTests {
    private final ReverseVowels tests = new ReverseVowels();

    @Test
    void test1() {
        String actual = tests.solution("hello");
        String expect = "holle";
        System.out.println("Actual: " + actual + " ; Expect: " + expect);
        assertEquals(expect, actual);
    }
    
    @Test
    void test2() {
        String actual = tests.solution("HellO");
        String expect = "HOlle";
        System.out.println("Actual: " + actual + " ; Expect: " + expect);
        assertEquals(expect, actual);
    }

    @Test
    void test3() {
        String actual = tests.solution("HellO");
        String expect = "HOlle";
        System.out.println("Actual: " + actual + " ; Expect: " + expect);
        assertEquals(expect, actual);
    }
    @Test
    void test4() {
        String actual = tests.solution("leetcode");
        String expect = "leotcede";
        System.out.println("Actual: " + actual + " ; Expect: " + expect);
        assertEquals(expect, actual);
    }
}
