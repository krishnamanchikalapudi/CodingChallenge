package solutions.hackerrank.unit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import solutions.hackerrank.DrawingBook;

public class DrawingBookTests {
    private final DrawingBook tests = new DrawingBook();
    @Test
	void test1() {
        int actual = tests.solution(6, 2);
        int expect = 1;
        System.out.println("Actual: "+actual +"; Expect: "+ expect);
        assertEquals(expect, actual);
    }
    @Test
	void test2() {
        int actual = tests.solution(5, 4);
        int expect = 0;
        System.out.println("Actual: "+actual +"; Expect: "+ expect);
        assertEquals(expect, actual);
    }
}
