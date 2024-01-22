package solutions.hackerrank.prepkit1week.unit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

import solutions.hackerrank.prepkit1week.GridChallenge;

public class GridChallengeTests {
    private final GridChallenge tests = new GridChallenge();

    @Test
    void test1(){
        String actual = tests.solution(Arrays.asList("abc", "ade", "efg"));
        String expect = "YES";
        System.out.println("Actual: "+ actual +"; Expect: "+ expect);
        assertEquals(expect, actual);
    }
    @Test
    void test2(){
        String actual = tests.solution(Arrays.asList("ebacd", "fghij", "olmkn", "trpqs", "xywuv"));
        String expect = "YES";
        System.out.println("Actual: "+ actual +"; Expect: "+ expect);
        assertEquals(expect, actual);
    }
    @Test
    void test3(){
        String actual = tests.solution(Arrays.asList("abc", "lmp", "qrt"));
        String expect = "YES";
        System.out.println("Actual: "+ actual +"; Expect: "+ expect);
        assertEquals(expect, actual);
    }
    @Test
    void test4(){
        String actual = tests.solution(Arrays.asList("mpxz", "abcd", "wlmf"));
        String expect = "NO";
        System.out.println("Actual: "+ actual +"; Expect: "+ expect);
        assertEquals(expect, actual);
    }
    @Test
    void test5(){
        String actual = tests.solution(Arrays.asList("abc", "hjk", "mpq", "rtv"));
        String expect = "YES";
        System.out.println("Actual: "+ actual +"; Expect: "+ expect);
        assertEquals(expect, actual);
    }
}
