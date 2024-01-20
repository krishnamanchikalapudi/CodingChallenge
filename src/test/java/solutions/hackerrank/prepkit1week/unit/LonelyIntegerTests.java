package solutions.hackerrank.prepkit1week.unit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

import solutions.hackerrank.prepkit1week.LonelyInteger;

public class LonelyIntegerTests {
    private final LonelyInteger tests = new LonelyInteger();

    @Test
    void test1(){
        int expect=4;
        int actual = tests.solution(Arrays.asList(1,2,3,4,3,2,1));
        System.out.println("Actual: "+ actual +"; Expect: "+ expect);
        assertEquals(expect, actual);
    }
    @Test
    void test2(){
        int expect=2;
        int actual = tests.solution(Arrays.asList(1,1,2));
        System.out.println("Actual: "+ actual +"; Expect: "+ expect);
        assertEquals(expect, actual);
    }
    @Test
    void test3(){
        int expect=2;
        int actual = tests.solution(Arrays.asList(0,0,1,2,1));
        System.out.println("Actual: "+ actual +"; Expect: "+ expect);
        assertEquals(expect, actual);
    }
}
