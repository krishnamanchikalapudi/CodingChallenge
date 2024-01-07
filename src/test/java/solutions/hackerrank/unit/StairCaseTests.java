/**
 * 
 */
package solutions.hackerrank.unit;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import solutions.hackerrank.StairCase;

/**
 * 
 */
class StairCaseTests {
	private final StairCase tests = new StairCase();

	@Test
	void test1() {
		System.out.println("\t *** Observe output: Right aligned");
		tests.solution(4);
		assertTrue(true);
	}

	@Test
	void test2() {
		System.out.println("\t *** Observe output:  Right aligned");
		tests.solution(6);
		assertTrue(true);
	}

	@Test
	void test3() {
		System.out.println("\t *** Observe output:  Right aligned");
		tests.solution(15);
		assertTrue(true);
	}
}
