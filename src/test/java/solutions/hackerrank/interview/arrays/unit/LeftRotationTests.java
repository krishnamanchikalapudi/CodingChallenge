package solutions.hackerrank.interview.arrays.unit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

import solutions.hackerrank.interview.arrays.LeftRotation;

/**
 * 
 * Problem:
 */
class LeftRotationTests {
	private final LeftRotation tests = new LeftRotation();

	@Test
	void test1() {
		List<Integer> input = Arrays.asList(1, 2, 3, 4, 5);
		List<Integer> expect = Arrays.asList(5, 1, 2, 3, 4);
		List<Integer> actual = tests.solution(4, input);
		System.out.println(
				"Actual: " + Arrays.toString(actual.toArray()) + "  Expected: " + Arrays.toString(expect.toArray()));
		assertEquals(expect, actual);
	}

	@Test
	void test2() {
		List<Integer> input = Arrays.asList(41, 73, 89, 7, 10, 1, 59, 58, 84, 77, 77, 97, 58, 1, 86, 58, 26, 10, 86,
				51);
		List<Integer> expect = Arrays.asList(77, 97, 58, 1, 86, 58, 26, 10, 86, 51, 41, 73, 89, 7, 10, 1, 59, 58, 84,
				77);
		List<Integer> actual = tests.solution(10, input);
		System.out.println(
				"Actual: " + Arrays.toString(actual.toArray()) + "  Expected: " + Arrays.toString(expect.toArray()));
		assertEquals(expect, actual);
	}

	@Test
	void test3() {
		List<Integer> input = Arrays.asList(33, 47, 70, 37, 8, 53, 13, 93, 71, 72, 51, 100, 60, 87, 97);
		List<Integer> expect = Arrays.asList(87, 97, 33, 47, 70, 37, 8, 53, 13, 93, 71, 72, 51, 100, 60);
		List<Integer> actual = tests.solution(13, input);
		System.out.println(
				"Actual: " + Arrays.toString(actual.toArray()) + "  Expected: " + Arrays.toString(expect.toArray()));
		assertEquals(expect, actual);
	}

}
