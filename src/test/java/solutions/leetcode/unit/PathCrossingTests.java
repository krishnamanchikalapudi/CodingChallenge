package solutions.leetcode.unit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import solutions.leetcode.PathCrossing;

class PathCrossingTests {

	private final PathCrossing test = new PathCrossing();

	@Test
	void test1() {
		String path = "NES";
		assertEquals(false, test.solution(path));
	}

	@Test
	void test2() {
		String path = "NESWW";
		assertEquals(true, test.solution(path));
	}

}
