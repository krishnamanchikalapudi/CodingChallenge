package solutions.hackerrank.prepkit1week.unit;

import static org.junit.jupiter.api.Assertions.assertIterableEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

import solutions.hackerrank.prepkit1week.PlusMinus;

public class PlusMinusTests {
    private final PlusMinus tests = new PlusMinus();
    
    @Test
    void test1() {
        List<String> expect = Arrays.asList("0.400000", "0.400000", "0.200000");
        List<String> actual = tests.solution(Arrays.asList(1, 1, 0, -1, -1));
        System.out.println("Actual: "+ Arrays.toString(actual.toArray()) +"; Expect: " + Arrays.toString(expect.toArray()));
        assertIterableEquals(expect, actual);
    }

    @Test
    void test2() {
        List<String> expect = Arrays.asList("0.500000", "0.333333", "0.166667");
        List<String> actual = tests.solution(Arrays.asList(-4, 3, -9, 0, 4, 1));
        System.out.println("Actual: "+ Arrays.toString(actual.toArray()) +"; Expect: " + Arrays.toString(expect.toArray()));
        assertIterableEquals(expect, actual);
    }
}
