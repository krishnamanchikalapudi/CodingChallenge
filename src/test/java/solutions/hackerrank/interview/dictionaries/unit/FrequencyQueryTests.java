package solutions.hackerrank.interview.dictionaries.unit;

import static org.junit.jupiter.api.Assertions.assertIterableEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

import solutions.hackerrank.interview.dictionaries.FrequencyQuery;

public class FrequencyQueryTests {
    private final FrequencyQuery tests = new FrequencyQuery();

    @Test
    void test1() {
        List<List<Integer>> queries = Arrays.asList( 
            Arrays.asList(1,1), Arrays.asList(2,2),Arrays.asList(3,2),Arrays.asList(1,1),Arrays.asList(1,1),Arrays.asList(2,1),Arrays.asList(3,2));
        List<Integer> expect= Arrays.asList(0,1);
        List<Integer> actual = tests.solution(queries);
        System.out.println("Actual: "+ Arrays.toString(actual.toArray()) +"; Expect: "+ Arrays.toString(expect.toArray()));
        assertIterableEquals(expect, actual);
    }

    @Test
    void test2() {
        List<List<Integer>> queries = Arrays.asList( 
            Arrays.asList(1,5), Arrays.asList(1,6),Arrays.asList(3,2),Arrays.asList(1,10),Arrays.asList(1,10),Arrays.asList(1,6),Arrays.asList(2,5), Arrays.asList(3,2));
        List<Integer> expect= Arrays.asList(0,1);
        List<Integer> actual = tests.solution(queries);
        System.out.println("Actual: "+ Arrays.toString(actual.toArray()) +"; Expect: "+ Arrays.toString(expect.toArray()));
        assertIterableEquals(expect, actual);
    }
    @Test
    void test3() {
        List<List<Integer>> queries = Arrays.asList( 
            Arrays.asList(3,4), Arrays.asList(2,1003), Arrays.asList(1,16), Arrays.asList(3,1));
        List<Integer> expect= Arrays.asList(0,1);
        List<Integer> actual = tests.solution(queries);
        System.out.println("Actual: "+ Arrays.toString(actual.toArray()) +"; Expect: "+ Arrays.toString(expect.toArray()));
        assertIterableEquals(expect, actual);
    }
    @Test
    void test4() {
        List<List<Integer>> queries = Arrays.asList( 
            Arrays.asList(1,3), Arrays.asList(2,3), Arrays.asList(3,2), Arrays.asList(1,4), Arrays.asList(1,5), Arrays.asList(1,5), Arrays.asList(1,4), Arrays.asList(3,2), Arrays.asList(2,4), Arrays.asList(3,2));
        List<Integer> expect= Arrays.asList(0,1,1);
        List<Integer> actual = tests.solution(queries);
        System.out.println("Actual: "+ Arrays.toString(actual.toArray()) +"; Expect: "+ Arrays.toString(expect.toArray()));
        assertIterableEquals(expect, actual);
    }
}
