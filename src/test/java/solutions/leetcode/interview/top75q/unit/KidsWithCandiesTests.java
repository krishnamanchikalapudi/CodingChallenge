package solutions.leetcode.interview.top75q.unit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

import solutions.leetcode.interview.top75q.KidsWithCandies;

public class KidsWithCandiesTests {
    private KidsWithCandies tests = new KidsWithCandies();

    @Test
    void test1(){
        int[] candies = new int[]{2,3,5,1,3}; int extraCandies = 3;
        List<Boolean> expect = Arrays.asList(true,true,true,false,true);
        List<Boolean> actual = tests.solution(candies, extraCandies);

        System.out.println("Actual: "+ Arrays.toString(actual.toArray()) + " ; Expect: "+ Arrays.toString(expect.toArray())); 
        assertEquals(expect, actual);
    }

    @Test
    void test2(){
        int[] candies = new int[]{4,2,1,1,2}; int extraCandies = 1;
        List<Boolean> expect = Arrays.asList(true,false,false,false,false);
        List<Boolean> actual = tests.solution(candies, extraCandies);

        System.out.println("Actual: "+ Arrays.toString(actual.toArray()) + " ; Expect: "+ Arrays.toString(expect.toArray())); 
        assertEquals(expect, actual);
    }

    @Test
    void test3(){
        int[] candies = new int[]{12,1,12}; int extraCandies = 10;
        List<Boolean> expect = Arrays.asList(true,false,true);
        List<Boolean> actual = tests.solution(candies, extraCandies);

        System.out.println("Actual: "+ Arrays.toString(actual.toArray()) + " ; Expect: "+ Arrays.toString(expect.toArray())); 
        assertEquals(expect, actual);
    }
}
