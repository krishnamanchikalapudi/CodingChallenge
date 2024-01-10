package solutions.hackerrank.unit;

import static org.junit.jupiter.api.Assertions.assertIterableEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

import solutions.hackerrank.AppleAndOrange;

/**
 * 
 * Problem:
 */
class AppleAndOrangeTests {
	private final AppleAndOrange tests = new AppleAndOrange();

	@Test
	void test1() {
		int s = 7, t = 11, a = 5, b = 15, m = 3, n = 2;
		List<Integer> apples = Arrays.asList(-2, 2, 1), oranges = Arrays.asList(5, -6);
		List<Integer> expect = Arrays.asList(1, 1);
		List<Integer> actual = tests.solution(s, t, a, b, apples, oranges);
		System.out.println(
				"Actual: " + Arrays.toString(actual.toArray()) + " Expect: " + Arrays.toString(expect.toArray()));
		assertIterableEquals(expect, actual);
	}

}
