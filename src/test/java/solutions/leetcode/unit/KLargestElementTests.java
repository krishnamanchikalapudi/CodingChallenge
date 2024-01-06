package solutions.leetcode.unit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import solutions.leetcode.KLargestElement;

class KLargestElementTests {

	private final KLargestElement test = new KLargestElement();

	@Test
	void test1() {
		int[] nums = new int[] { 3, 2, 1, 5, 6, 4 };
		int k = 2;
		assertEquals(5, test.solution(nums, k));
	}

	@Test
	void test2() {
		int[] nums = new int[] { 3, 2, 3, 1, 2, 4, 5, 5, 6 };
		int k = 4;
		assertEquals(4, test.solution(nums, k));
	}

	@Test
	void test1WithNoSort() {
		int[] nums = new int[] { 3, 2, 1, 5, 6, 4 };
		int k = 2;
		assertEquals(5, test.solutionWithNoSort(nums, k));
	}

	@Test
	void test2WithNoSort() {
		int[] nums = new int[] { 3, 2, 3, 1, 2, 4, 5, 5, 6 };
		int k = 4;
		assertEquals(4, test.solutionWithNoSort(nums, k));
	}

}
