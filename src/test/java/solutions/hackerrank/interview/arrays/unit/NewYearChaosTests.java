package solutions.hackerrank.interview.arrays.unit;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

import solutions.hackerrank.interview.arrays.NewYearChaos;

/**
 * 
 * Problem:
 */
class NewYearChaosTests {
	private final NewYearChaos tests = new NewYearChaos();

	@Test
	void test1() {
		int t = 2, n = 8;
		List<Integer> q = Arrays.asList(1, 2, 5, 3, 4, 7, 8, 6);
	}

	@Test
	void test2() {
		int t = 2, n = 8;
		List<Integer> q1 = Arrays.asList(5, 1, 2, 3, 7, 8, 6, 4), q2 = Arrays.asList(1, 2, 5, 3, 7, 8, 6, 4);
	}

	@Test
	void test3() {
		int t = 2, n = 5;
		List<Integer> q1 = Arrays.asList(2, 1, 5, 3, 4), q2 = Arrays.asList(2, 5, 1, 3, 4);
	}

}
