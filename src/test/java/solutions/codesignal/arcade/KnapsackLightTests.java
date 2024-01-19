package solutions.codesignal.arcade;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class KnapsackLightTests {
    private final KnapsackLight tests = new KnapsackLight();

    @Test
    void test1() {
        int actual = tests.solution(10, 5, 6,4,8);
        int expect=10;
        System.out.println("Actual: "+ actual + "; Expect: "+ expect);
        assertEquals(expect, actual);
    }
    @Test
    void test2() {
        int actual = tests.solution(10, 5, 6,4,9);
        int expect=16;
        System.out.println("Actual: "+ actual + "; Expect: "+ expect);
        assertEquals(expect, actual);
    }
    @Test
    void test3() {
        int actual = tests.solution(6, 3, 7,4,6);
        int expect=7;
        System.out.println("Actual: "+ actual + "; Expect: "+ expect);
        assertEquals(expect, actual);
    }
}
