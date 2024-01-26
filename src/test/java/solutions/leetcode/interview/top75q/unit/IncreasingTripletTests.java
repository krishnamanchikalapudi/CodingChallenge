package solutions.leetcode.interview.top75q.unit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import solutions.leetcode.interview.top75q.IncreasingTriplet;


public class IncreasingTripletTests {
    private final IncreasingTriplet tests = new IncreasingTriplet();

    @Test
    void test1() {
        boolean actual = tests.solution(new int[]{1,2,3,4,5});
        boolean expect = true;
        System.out.println("Actual: "+ actual +  " ; Expect: "+ expect);
        assertEquals(expect, actual);
    }
     @Test
    void test2() {
        boolean actual = tests.solution(new int[]{5,4,3,2,1});
        boolean expect = false;
        System.out.println("Actual: "+ actual +  " ; Expect: "+ expect);
        assertEquals(expect, actual);
    }
     @Test
     void test3() {
         boolean actual = tests.solution(new int[] { 2, 1, 5, 0, 4, 6 });
         boolean expect = true;
         System.out.println("Actual: " + actual + " ; Expect: " + expect);
         assertEquals(expect, actual);
     }
    
    
     @Test
     void test4() {
         boolean actual = tests.solution(new int[] { 20, 100, 10, 12, 5, 13 });
         boolean expect = true;
         System.out.println("Actual: " + actual + " ; Expect: " + expect);
         assertEquals(expect, actual);
     }
    
}