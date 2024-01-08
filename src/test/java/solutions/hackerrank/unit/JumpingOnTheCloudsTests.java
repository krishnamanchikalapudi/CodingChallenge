package solutions.hackerrank.unit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

import solutions.hackerrank.JumpingOnTheClouds;

/**
 * 
 */
class JumpingOnTheCloudsTests {
	private final JumpingOnTheClouds tests = new JumpingOnTheClouds();

	@Test
	void test1() {
		int expect = 4;
		int actual = tests.solution(Arrays.asList(0, 0, 1, 0, 0, 1, 0));
		System.out.println("Actual: " + actual + "  Expected: " + expect);
		assertEquals(expect, actual);
	}

	@Test
	void test2() {
		int expect = 3;
		int actual = tests.solution(Arrays.asList(0, 0, 0, 0, 1, 0));
		System.out.println("Actual: " + actual + "  Expected: " + expect);
		assertEquals(expect, actual);
	}

	@Test
	void test3() {
		int expect = 3;
		int actual = tests.solution(Arrays.asList(0, 0, 0, 1, 0, 0));
		System.out.println("Actual: " + actual + "  Expected: " + expect);
		assertEquals(expect, actual);
	}

}
