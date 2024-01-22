package solutions.hackerrank.prepkit1week.unit;

import org.junit.jupiter.api.Test;

import solutions.hackerrank.prepkit1week.PalindromeIndex;

public class PalindromeIndexTests {
    private final PalindromeIndex tests = new PalindromeIndex();

    @Test
    void test1() {
        int actual= tests.solution("aaab");
        int expect = 3;
        System.out.println("Actual: "+ actual +" ; Expect: "+ expect);
    }
    @Test
    void test2() {
        int actual= tests.solution("baa");
        int expect = 0;
        System.out.println("Actual: "+ actual +" ; Expect: "+ expect);
    }
    @Test
    void test3() {
        int actual= tests.solution("aaa");
        int expect = -1;
        System.out.println("Actual: "+ actual +" ; Expect: "+ expect);
    }
    
}
