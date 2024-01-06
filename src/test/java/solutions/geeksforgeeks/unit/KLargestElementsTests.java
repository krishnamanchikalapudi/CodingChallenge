package solutions.geeksforgeeks.unit;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

import solutions.geeksforgeeks.KLargestElements;

class KLargestElementsTests {
	private final KLargestElements test = new KLargestElements();

	@Test
	void test1() {
		int k = 2, arr[] = new int[] { 12, 5, 787, 1, 23 };

		assertArrayEquals(new int[] { 787, 23 }, test.solution(arr, k));
	}

	@Test
	void test2() {
		int k = 3, arr[] = new int[] { 1, 23, 12, 9, 30, 2, 50 };

		assertArrayEquals(new int[] { 50, 30, 23 }, test.solution(arr, k));
	}

}
