package solutions.hackerrank.prepkit1week.unit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

import solutions.hackerrank.prepkit1week.TruckTour;

public class TruckTourTests {
    private final TruckTour tests = new TruckTour();

    @Test
    void test1() {
        int actual = tests.solution(Arrays.asList(Arrays.asList(1, 5), Arrays.asList(10, 3), Arrays.asList(3, 4)));
        int expect = 1;
        System.out.println("Actual: " + actual + " ; Expect: " + expect);
        assertEquals(expect, actual);
    }

}
