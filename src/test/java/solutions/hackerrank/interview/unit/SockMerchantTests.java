/**
 * 
 */
package solutions.hackerrank.interview.unit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

import solutions.hackerrank.interview.SockMerchant;

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
		assertEquals(3, test.solution(nums));
	}

	@Test
	void test3() {
		List<Integer> nums = Arrays.asList(10, 20, 20, 50, 30, 30, 50, 70, 10, 20, 70);
		assertEquals(5, test.solution(nums));
	}

	@Test
	void test4() {
		List<Integer> nums = Arrays.asList(1, 1, 3, 1, 2, 1, 3, 3, 3, 3);
		assertEquals(4, test.solution(nums));
	}
}
