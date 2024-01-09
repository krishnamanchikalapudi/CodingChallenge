package solutions.hackerrank.unit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertIterableEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

import solutions.hackerrank.Grading;

/**
 * 
 * Problem:
 */
class GradingTests {
	private final Grading tests = new Grading();

	@Test
	void test1() {
		List<Integer> input = Arrays.asList(73, 67, 38, 33);
		List<Integer> expect = Arrays.asList(75, 67, 40, 33);
		List<Integer> actual = tests.solution(input);

		System.out.println(
				"Actual: " + Arrays.toString(actual.toArray()) + "  Expected: " + Arrays.toString(expect.toArray()));
		assertIterableEquals(expect, actual);
	}

	@Test
	void test2() {
		List<Integer> input = Arrays.asList(39, 27, 89, 56, 47, 38, 12, 98, 72, 85, 76, 72, 56, 23, 77, 25, 49, 4, 52,
				71, 43, 11, 2, 44, 10, 20, 3, 90, 64, 48, 31, 56, 51, 70, 91, 14, 25, 61, 41, 0);
		List<Integer> expect = Arrays.asList(40, 27, 90, 56, 47, 40, 12, 100, 72, 85, 76, 72, 56, 23, 77, 25, 50, 4, 52,
				71, 45, 11, 2, 45, 10, 20, 3, 90, 65, 50, 31, 56, 51, 70, 91, 14, 25, 61, 41, 0);
		List<Integer> actual = tests.solution(input);

		System.out.println(
				"Actual: " + Arrays.toString(actual.toArray()) + "  Expected: " + Arrays.toString(expect.toArray()));
		assertEquals(expect, actual);
	}

}
