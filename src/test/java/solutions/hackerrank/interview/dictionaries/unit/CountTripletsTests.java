package solutions.hackerrank.interview.dictionaries.unit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

import solutions.hackerrank.interview.dictionaries.CountTriplets;

public class CountTripletsTests {
    private final CountTriplets tests = new CountTriplets();
    
    @Test
    void test1() {
        List<Long> arr = Arrays.asList( (long)1, (long)4, (long)16, (long)64);
        int r=4;
        long expect=2;
        long actual = tests.solution(arr, r);
        System.out.println("Actual: "+ actual +"; Expect: "+ expect);
        assertEquals(expect, actual);
    }
    @Test
    void test2() {
        List<Long> arr = Arrays.asList( (long)1, (long)2, (long)2, (long)4);
        int r=2;
        long expect=2;
        long actual = tests.solution(arr, r);
        System.out.println("Actual: "+ actual +"; Expect: "+ expect);
        assertEquals(expect, actual);
    }
    @Test
    void test3() {
        List<Long> arr = Arrays.asList( (long)1, (long)3, (long)9, (long)9, (long)27, (long)81);
        int r=3;
        long expect=6;
        long actual = tests.solution(arr, r);
        System.out.println("Actual: "+ actual +"; Expect: "+ expect);
        assertEquals(expect, actual);
    }
    @Test
    void test4() {
        List<Long> arr = Arrays.asList( (long)1, (long)5, (long)5, (long)25, (long)125);
        int r=5;
        long expect=4;
        long actual = tests.solution(arr, r);
        System.out.println("Actual: "+ actual +"; Expect: "+ expect);
        assertEquals(expect, actual);
    }

    
}
