package solutions.hackerrank.interview.dictionaries.unit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

import solutions.hackerrank.interview.dictionaries.TwoStrings;

public class TwoStringsTests {
    private final TwoStrings tests = new TwoStrings();

    @Test
    void test1() {
        String s1 = "hello", s2 = "world";
        String expect = "YES";
        String actual = tests.solution(s1, s2);
        System.out.println("Actual: " + actual + "  Expected: " + expect);
        assertEquals(expect, actual);
    }

    @Test
    void test2() {
        String s1 = "hi", s2 = "world";
        String expect = "NO";
        String actual = tests.solution(s1, s2);
        System.out.println("Actual: " + actual + "  Expected: " + expect);
        assertEquals(expect, actual);
    }

    @Test
    void test3() {
        String s1 = "wouldyoulikefries", s2 = "abcabcabcabcabcabc";
        String expect = "NO";
        String actual = tests.solution(s1, s2);
        System.out.println("Actual: " + actual + "  Expected: " + expect);
        assertEquals(expect, actual);
    }

    @Test
    void test4() {
        String s1 = "hackerrankcommunity", s2 = "cdecdecdecde";
        String expect = "YES";
        String actual = tests.solution(s1, s2);
        System.out.println("Actual: " + actual + "  Expected: " + expect);
        assertEquals(expect, actual);
    }

    @Test
    void test5() {
        String s1 = "jackandjill", s2 = "wentupthehill";
        String expect = "YES";
        String actual = tests.solution(s1, s2);
        System.out.println("Actual: " + actual + "  Expected: " + expect);
        assertEquals(expect, actual);
    }

    @Test
    void test6() {
        String s1 = "writetoyourparents", s2 = "fghmqzldbc";
        String expect = "NO";
        String actual = tests.solution(s1, s2);
        System.out.println("Actual: " + actual + "  Expected: " + expect);
        assertEquals(expect, actual);
    }

}
