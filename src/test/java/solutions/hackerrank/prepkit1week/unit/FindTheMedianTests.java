package solutions.hackerrank.prepkit1week.unit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

import solutions.hackerrank.prepkit1week.FindTheMedian;

public class FindTheMedianTests {
    private FindTheMedian tests = new FindTheMedian();

    @Test
    void test1(){
        int actual = tests.solution(Arrays.asList(5,3,1,2,4));
        int expect = 3;
        System.out.println("Actual: "+ actual + "; Expect: "+ expect);
        assertEquals(expect, actual);
    }
    
    @Test
    void test2(){
        int actual = tests.solution(Arrays.asList(0, 1, 2, 4, 6, 5, 3));
        int expect = 3;
        System.out.println("Actual: "+ actual + "; Expect: "+ expect);
        assertEquals(expect, actual);
    }
    @Test
    void test3(){
        int actual = tests.solution(Arrays.asList(0, 1, 2, 3, 4,  5, 6));
        int expect = 3;
        System.out.println("Actual: "+ actual + "; Expect: "+ expect);
        assertEquals(expect, actual);
    }
    @Test
    void test4(){
        int actual = tests.solution(Arrays.asList(0, 1, 2, 3, 4,  5, 6,7,8,9));
        int expect = 4;
        System.out.println("Actual: "+ actual + "; Expect: "+ expect);
        assertEquals(expect, actual);
    }
}
