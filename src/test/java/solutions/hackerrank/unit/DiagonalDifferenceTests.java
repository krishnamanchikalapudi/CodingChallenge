/**
 * 
 */
package solutions.hackerrank.unit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

import solutions.hackerrank.DiagonalDifference;

/**
 * 
 */
class DiagonalDifferenceTests {
	private final DiagonalDifference test = new DiagonalDifference();

	@Test
	void test1() {
		List<List<Integer>> nums = Arrays.asList(Arrays.asList(1, 2, 3), Arrays.asList(4, 5, 6),
				Arrays.asList(9, 8, 9));
		int expect = 2;
		int actual = test.solution(nums);
		System.out.println("Actual: " + actual + "  Expected: " + expect);
		assertEquals(expect, actual);
	}

	@Test
	void test2() {
		List<List<Integer>> nums = Arrays.asList(Arrays.asList(11, 2, 4), Arrays.asList(4, 5, 6),
				Arrays.asList(10, 8, -12));
		int expect = 15;
		int actual = test.solution(nums);
		System.out.println("Actual: " + actual + "  Expected: " + expect);
		assertEquals(expect, actual);
	}

}
