package solutions.leetcode.unit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import solutions.leetcode.WidestVerticalAreaBetweenTwoPoints;

class WidestVerticalAreaBetweenTwoPointsTests {
	private final WidestVerticalAreaBetweenTwoPoints tests = new WidestVerticalAreaBetweenTwoPoints();

	@Test
	void test1() {
		int[][] points = new int[][] { { 8, 7 }, { 9, 9 }, { 7, 4 }, { 9, 7 } };
		assertEquals(1, tests.solution(points));
	}

	@Test
	void test2() {
		int[][] points = new int[][] { { 3, 1 }, { 9, 0 }, { 1, 0 }, { 1, 4 }, { 5, 3 }, { 8, 8 } };
		assertEquals(3, tests.solution(points));
	}

}
