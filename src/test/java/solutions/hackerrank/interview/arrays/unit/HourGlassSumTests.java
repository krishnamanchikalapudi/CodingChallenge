package solutions.hackerrank.interview.arrays.unit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

import solutions.hackerrank.interview.arrays.HourGlassSum;

/**
 * 
 */
class HourGlassSumTests {
	private final HourGlassSum tests = new HourGlassSum();

	@Test
	void test1() {
		int expect = 19;
		int actual = tests.solution(Arrays.asList(Arrays.asList(1, 1, 1, 0, 0, 0), Arrays.asList(0, 1, 0, 0, 0, 0),
				Arrays.asList(1, 1, 1, 0, 0, 0), Arrays.asList(0, 0, 2, 4, 4, 0), Arrays.asList(0, 0, 0, 2, 0, 0),
				Arrays.asList(0, 0, 1, 2, 4, 0)));
		System.out.println("Actual: " + actual + "  Expected: " + expect);
		assertEquals(expect, actual);
	}

	@Test
	void test2() {
		int expect = 13;
		int actual = tests.solution(Arrays.asList(Arrays.asList(1, 1, 1, 0, 0, 0), Arrays.asList(0, 1, 0, 0, 0, 0),
				Arrays.asList(1, 1, 1, 0, 0, 0), Arrays.asList(0, 9, 2, -4, -4, 0), Arrays.asList(0, 0, 0, -2, 0, 0),
				Arrays.asList(0, 0, -1, -2, -4, 0)));
		System.out.println("Actual: " + actual + "  Expected: " + expect);
		assertEquals(expect, actual);
	}

	@Test
	void test3() {
		int expect = 28;
		int actual = tests.solution(Arrays.asList(Arrays.asList(-9, -9, -9, 1, 1, 1), Arrays.asList(0, -9, 0, 4, 3, 2),
				Arrays.asList(-9, -9, -9, 1, 2, 3), Arrays.asList(0, 0, 8, 6, 6, 0), Arrays.asList(0, 0, 0, -2, 0, 0),
				Arrays.asList(0, 0, 1, 2, 4, 0)));
		System.out.println("Actual: " + actual + "  Expected: " + expect);
		assertEquals(expect, actual);
	}

}
