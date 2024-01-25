package solutions.leetcode.interview.top75q.unit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import solutions.leetcode.interview.top75q.GreatestCommonDivisorOfString;

public class GreatestCommonDivisorOfStringTests {
    private final GreatestCommonDivisorOfString tests = new GreatestCommonDivisorOfString();

    @Test
    void test1() {
        String actual = tests.solution("ABCABC", "ABC");
        String expect = "ABC";
        System.out.println("Actual: "+ actual +" ; Expect: "+ expect);
        assertEquals(expect, actual);
    }
    @Test
    void test2() {
        String actual = tests.solution("ABABAB", "ABAB");
        String expect = "AB";
        System.out.println("Actual: "+ actual +" ; Expect: "+ expect);
        assertEquals(expect, actual);
    }
    @Test
    void test3() {
        String actual = tests.solution("LEET", "CODE");
        String expect = "";
        System.out.println("Actual: "+ actual +" ; Expect: "+ expect);
        assertEquals(expect, actual);
    }
}
