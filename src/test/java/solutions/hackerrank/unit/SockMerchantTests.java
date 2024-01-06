/**
 * 
 */
package solutions.hackerrank.unit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

import solutions.hackerrank.SockMerchant;

public class SockMerchantTests {
	private final SockMerchant test = new SockMerchant();

	@Test
	void test1() {
		List<Integer> nums = Arrays.asList(1, 2, 1, 2, 1, 3, 2);
		assertEquals(2, test.solution(nums));
	}

	@Test
	void test2() {
		List<Integer> nums = Arrays.asList(10, 20, 20, 10, 10, 30, 50, 10, 20);
		int expect = 3;
		int actual = test.solution(nums);
		System.out.println("Actual: " + actual + "  Expected: " + expect);
		assertEquals(expect, actual);
	}

	@Test
	void test3() {
		List<Integer> nums = Arrays.asList(10, 20, 20, 50, 30, 30, 50, 70, 10, 20, 70);
		int expect = 5;
		int actual = test.solution(nums);
		System.out.println("Actual: " + actual + "  Expected: " + expect);
		assertEquals(expect, actual);
	}

	@Test
	void test4() {
		List<Integer> nums = Arrays.asList(1, 1, 3, 1, 2, 1, 3, 3, 3, 3);
		assertEquals(4, test.solution(nums));
	}
}
