package solutions.hackerrank.prepkit1week.unit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

import solutions.hackerrank.prepkit1week.Pairs;

public class PairsTests {
    private final Pairs tests = new Pairs();

    @Test
    void test1() {
        int actual = tests.solution(2, Arrays.asList(1, 5, 3, 4, 2));
        int expect=3;
        System.out.println("Actual: "+ actual + "; Expect: "+ expect);
        assertEquals(expect, actual);
    }
    @Test
    void test2() {
        int actual = tests.solution(1, Arrays.asList(363374326, 364147530, 61825163, 1073065718, 1281246024, 1399469912, 428047635, 491595254, 879792181, 1069262793));
        int expect=3;
        System.out.println("Actual: "+ actual + "; Expect: "+ expect);
        assertEquals(expect, actual);
    }
}
