package solutions.hackerrank.prepkit1week.unit;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

import solutions.hackerrank.prepkit1week.MiniMaxSum;

class MiniMaxSumTests {
	private MiniMaxSum test = new MiniMaxSum();

	@Test
	void test1() {
		List<Integer> input = Arrays.asList(1, 3, 5, 7, 9);
		long[] expect = { 16, 24 };
		long[] actual = test.solution(input);
		System.out.println("Actual: " + Arrays.toString(actual) + "  Expected: " + Arrays.toString(expect));
		assertArrayEquals(expect, actual);
	}

	@Test
	void test2() {
		List<Integer> input = Arrays.asList(1, 2, 3, 4, 5);
		long[] expect = { 10, 14 };
		long[] actual = test.solution(input);
		System.out.println("Actual: " + Arrays.toString(actual) + "  Expected: " + Arrays.toString(expect));
		assertArrayEquals(expect, actual);
	}

	@Test
	void test3() {
		List<Integer> input = Arrays.asList(3, 5, 2, 11, 7, 9);
		long[] expect = { 26, 35 };
		long[] actual = test.solution(input);
		System.out.println("Actual: " + Arrays.toString(actual) + "  Expected: " + Arrays.toString(expect));
		assertArrayEquals(expect, actual);
	}

	@Test
	void test4() {
		List<Integer> input = Arrays.asList(7, 69, 2, 221, 8974);
		long[] expect = { 299, 9271 };
		long[] actual = test.solution(input);
		System.out.println("Actual: " + Arrays.toString(actual) + "  Expected: " + Arrays.toString(expect));
		assertArrayEquals(expect, actual);
	}

	@Test
	void test5() {
		List<Integer> input = Arrays.asList(793810624, 895642170, 685903712, 623789054, 468592370);
		long[] expect = { Long.valueOf("2572095760"), Long.valueOf("2999145560") };
		long[] actual = test.solution(input);
		System.out.println("Actual: " + Arrays.toString(actual) + "  Expected: " + Arrays.toString(expect));
		assertArrayEquals(expect, actual);
	}
}
