package solutions.hackerrank.unit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import solutions.hackerrank.CountingValleys;

/**
 * 
 */
class CountingValleysTests {
	private final CountingValleys tests = new CountingValleys();

	@Test
	void test1() {
		int expect = 1;
		int actual = tests.solution(8, "UDDDUDUU");
		System.out.println("Actual: " + actual + "  Expected: " + expect);
		assertEquals(expect, actual);
	}

	@Test
	void test2() {
		int expect = 1;
		int actual = tests.solution(8, "DDUUUUDD");
		System.out.println("Actual: " + actual + "  Expected: " + expect);
		assertEquals(expect, actual);
	}

	@Test
	void test3() {
		int expect = 2;
		int actual = tests.solution(12, "DDUUDDUDUUUD");
		System.out.println("Actual: " + actual + "  Expected: " + expect);
		assertEquals(expect, actual);
	}
}
