package solutions.hackerrank.interview.warmup.unit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import solutions.hackerrank.interview.warmup.RepeatedString;

/**
 * 
 */
class RepeatedStringTests {
	private final RepeatedString test = new RepeatedString();

	@Test
	void test1() {
		long expect = 7;
		long actual = test.solution("aba", 10);
		System.out.println("Actual: " + actual + "  Expected: " + expect);
		assertEquals(expect, actual);
	}

	@Test
	void test2() {
		long expect = 4;
		long actual = test.solution("abcac", 10);
		System.out.println("Actual: " + actual + "  Expected: " + expect);
		assertEquals(expect, actual);
	}

	@Test
	void test3() {
		long expect = 100;
		long actual = test.solution("a", 100);
		System.out.println("Actual: " + actual + "  Expected: " + expect);
		assertEquals(expect, actual);
	}

	@Test
	void test4() {
		long expect = 50;
		long actual = test.solution("ax", 100);
		System.out.println("Actual: " + actual + "  Expected: " + expect);
		assertEquals(expect, actual);
	}

	@Test
	void test5() {
		long expect = Long.valueOf("1000000000000");
		long actual = test.solution("a", Long.valueOf("1000000000000"));
		System.out.println("Actual: " + actual + "  Expected: " + expect);
		assertEquals(expect, actual);
	}
}