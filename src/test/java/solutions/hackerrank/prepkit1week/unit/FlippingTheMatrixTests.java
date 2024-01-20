package solutions.hackerrank.prepkit1week.unit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

import solutions.hackerrank.prepkit1week.FlippingTheMatrix;

public class FlippingTheMatrixTests {
   private final FlippingTheMatrix test = new FlippingTheMatrix();
   
    @Test
    void test1() {
        List<List<Integer>> matrix = Arrays.asList( Arrays.asList(112, 42, 83, 119),Arrays.asList(56, 125, 56, 49), Arrays.asList(15, 78, 101, 43), Arrays.asList(62, 98, 114, 108) );
        int expect = 414;
        int actual = test.solution(matrix);
        System.out.println("Actual: "+ actual +" ; Expect: "+ expect);
        assertEquals(expect, actual);
    }
    @Test
    void test2() {
        List<List<Integer>> matrix = Arrays.asList( Arrays.asList(107,54,128,15), Arrays.asList(12,75,110,138), Arrays.asList(100,96,34,85), Arrays.asList(75,15,28,112) );
        int expect = 488;
        int actual = test.solution(matrix);
        System.out.println("Actual: "+ actual +" ; Expect: "+ expect);
        assertEquals(expect, actual);
    }

}
