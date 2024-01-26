package solutions.leetcode.interview.top75q.unit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import solutions.leetcode.interview.top75q.ReverseWords;

public class ReverseWordsTests {
    private final ReverseWords tests = new ReverseWords();

    @Test
    void test1() {
        String actual = tests.solution("the sky is blue");
        String expect = "blue is sky the";
        System.out.println("Actual: " + actual + " ; Expect: " + expect);
        assertEquals(expect, actual);
    }

    @Test
    void test2() {
        String actual = tests.solution("  hello world  ");
        String expect = "world hello";
        System.out.println("Actual: " + actual + " ; Expect: " + expect);
        assertEquals(expect, actual);
    }

    @Test
    void test3() {
        String actual = tests.solution("a good   example");
        String expect = "example good a";
        System.out.println("Actual: " + actual + " ; Expect: " + expect);
        assertEquals(expect, actual);
    }
}
