package solutions.unit;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

import solutions.ProductOfArrayExceptSelf;

class ProductOfArrayExceptSelfTests {
	private ProductOfArrayExceptSelf test = new ProductOfArrayExceptSelf();

	@Test
	void test1() {
		int[] nums = new int[] { 1, 2, 3, 4 };
		int[] expectedOutput = new int[] { 24, 12, 8, 6 };
		assertArrayEquals(expectedOutput, test.solution(nums));
	}

	@Test
	void test2() {
		int[] nums = new int[] { -1, 1, 0, -3, 3 };
		int[] expectedOutput = new int[] { 0, 0, 9, 0, 0 };
	}

}
