package solutions.hackerrank.interview.arrays.unit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import solutions.hackerrank.interview.arrays.MinimumSwaps;

/**
 * 
 * Problem:
 */
class MinimumSwapsTests {
	private final MinimumSwaps tests = new MinimumSwaps();

	@Test
	void test1() {
		int[] input = new int[] { 2, 3, 4, 1, 5 };
		int expect = 3;
		int actual = tests.solution(input);

		System.out.println("Actual: " + actual + "  Expected: " + expect);
		assertEquals(expect, actual);
	}

	@Test
	void test2() {
		int[] input = new int[] { 1, 3, 5, 2, 4, 6, 7 };
		int expect = 3;
		int actual = tests.solution(input);

		System.out.println("Actual: " + actual + "  Expected: " + expect);
		assertEquals(expect, actual);
	}

	@Test
	void test3() {
		int[] input = new int[] { 4, 3, 1, 2 };
		int expect = 3;
		int actual = tests.solution(input);

		System.out.println("Actual: " + actual + "  Expected: " + expect);
		assertEquals(expect, actual);
	}

}
