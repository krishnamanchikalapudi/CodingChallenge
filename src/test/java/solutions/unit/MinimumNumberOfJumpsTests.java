package solutions.unit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import solutions.MinimumNumberOfJumps;

class MinimumNumberOfJumpsTests {
	private final MinimumNumberOfJumps tests = new MinimumNumberOfJumps();

	@Test
	void test1() {
		int[] arr = new int[] { 1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9 };
		assertEquals(3, tests.solution(arr));
	}

	@Test
	void test2() {
		int[] arr = new int[] { 1, 4, 3, 2, 6, 7 };
		assertEquals(2, tests.solution(arr));
	}

}
