/**
 * 
 */
package solutions.hackerrank.unit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

import solutions.hackerrank.PlusMinus;

/**
 * 
 */
class PlusMinusTests {
	private PlusMinus test = new PlusMinus();

	@Test
	void test1() {
		List<Integer> nums = Arrays.asList(1, 1, 0, -1, -1);
		List<Double> expect = Arrays.asList(0.4, 0.4, 0.2);
		List<Double> actual = test.solution(nums);
		System.out.println(
				"Actual: " + Arrays.toString(actual.toArray()) + "  Expected: " + Arrays.toString(expect.toArray()));
		assertEquals(expect, actual);
	}

	@Test
	void test2() {
		List<Integer> nums = Arrays.asList(-4, 3, -9, 0, 4, 1);
		List<Double> expect = Arrays.asList(0.5, 0.3333333333333333, 0.16666666666666666);
		List<Double> actual = test.solution(nums);
		System.out.println(
				"Actual: " + Arrays.toString(actual.toArray()) + "  Expected: " + Arrays.toString(expect.toArray()));
		assertEquals(expect, actual);
	}

	@Test
	void test3() {
		List<Integer> nums = Arrays.asList(1, 2, 3, -1, -2, -3, 0, 0);
		List<Double> expect = Arrays.asList(0.5, 0.3333333333333333, 0.16666666666666666);
		List<Double> actual = test.solution(nums);
		System.out.println(
				"Actual: " + Arrays.toString(actual.toArray()) + "  Expected: " + Arrays.toString(expect.toArray()));
		assertEquals(expect, actual);
	}

}
