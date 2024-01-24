package solutions.leetcode.interview.top75q.unit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import solutions.leetcode.interview.top75q.MergeAlternately;

public class MergeAlternatelyTests {
    private final MergeAlternately tests = new MergeAlternately();

    @Test
    void test1() {
        String word1="abc", word2="pqr";
        String actual = tests.solution(word1, word2);
        String expect="apbqcr";
        System.out.println("Actual: "+ actual +" ; Expect: "+ expect);
        assertEquals(expect, actual);

    }
    @Test
    void test2() {
        String word1 = "ab", word2 = "pqrs";
        String actual = tests.solution(word1, word2);
        String expect="apbqrs";
        System.out.println("Actual: "+ actual +" ; Expect: "+ expect);
        assertEquals(expect, actual);
    }

    @Test
    void test3() {
        String word1 = "abcd", word2 = "pq";
        String actual = tests.solution(word1, word2);
        String expect="apbqcd";
        System.out.println("Actual: "+ actual +" ; Expect: "+ expect);
        assertEquals(expect, actual);
    }

}
