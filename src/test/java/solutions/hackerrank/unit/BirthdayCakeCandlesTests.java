package solutions.hackerrank.unit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

import solutions.hackerrank.BirthdayCakeCandles;

/**
 * 
 */
class BirthdayCakeCandlesTests {
	private final BirthdayCakeCandles test = new BirthdayCakeCandles();

	@Test
	void test1() {
		List<Integer> input = Arrays.asList(4, 4, 1, 3);
		int expect = 2;
		int actual = test.solution(input);
		System.out.println("Expected: " + expect + "  Actual: " + actual);
		assertEquals(expect, actual);
	}

	@Test
	void test2() {
		List<Integer> input = Arrays.asList(3, 2, 1, 4);
		int expect = 2;
		int actual = test.solution(input);
		System.out.println("Expected: " + expect + "  Actual: " + actual);
		assertEquals(expect, actual);
	}

	@Test
	void test3() {
		List<Integer> input = Arrays.asList(4, 2, 1, 3);
		int expect = 1;
		int actual = test.solution(input);
		System.out.println("Expected: " + expect + "  Actual: " + actual);
		assertEquals(expect, actual);
	}

	@Test
	void test4() {
		List<Integer> input = Arrays.asList(4, 4, 1, 3, 4);
		int expect = 3;
		int actual = test.solution(input);
		System.out.println("Expected: " + expect + "  Actual: " + actual);
		assertEquals(expect, actual);
	}
}
