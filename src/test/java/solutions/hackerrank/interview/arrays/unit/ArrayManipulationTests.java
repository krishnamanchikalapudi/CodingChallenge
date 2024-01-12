package solutions.hackerrank.interview.arrays.unit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

import solutions.hackerrank.interview.arrays.ArrayManipulation;

/**
 * 
 * Problem:
 */
class ArrayManipulationTests {

	private final ArrayManipulation tests = new ArrayManipulation();

	@Test
	void test1() {
		List<List<Integer>> input = Arrays.asList(Arrays.asList(2, 6, 8), Arrays.asList(3, 5, 7),
				Arrays.asList(1, 8, 1), Arrays.asList(5, 9, 15));
		long expect = 31;
		long actual = tests.solution(10, input);

		System.out.println("Actual: " + actual + "  Expected: " + expect);
		assertEquals(expect, actual);
	}

	@Test
	void test2() {
		List<List<Integer>> input = Arrays.asList(Arrays.asList(1, 5, 3), Arrays.asList(4, 8, 7),
				Arrays.asList(6, 9, 1));
		long expect = 10;
		long actual = tests.solution(10, input);

		System.out.println("Actual: " + actual + "  Expected: " + expect);
		assertEquals(expect, actual);
	}

	@Test
	void test3() {
		List<List<Integer>> input = Arrays.asList(Arrays.asList(1, 2, 100), Arrays.asList(2, 5, 100),
				Arrays.asList(3, 4, 100));
		long expect = 200;
		long actual = tests.solution(5, input);

		System.out.println("Actual: " + actual + "  Expected: " + expect);
		assertEquals(expect, actual);
	}
}
