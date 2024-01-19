package solutions.hackerrank.prepkit1week.unit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import solutions.hackerrank.prepkit1week.TimeConversion;

class TimeConversionTests {
	private final TimeConversion test = new TimeConversion();

	@Test
	void test1() {
		String input = "12:01:00PM";
		String expect = "12:01:00";
		String actual = test.solution(input);
		System.out.println("Expected: " + expect + "  Actual: " + actual);
		assertEquals(expect, actual);
	}

	@Test
	void test2() {
		String input = "12:01:00AM";
		String expect = "00:01:00";
		String actual = test.solution(input);
		System.out.println("Expected: " + expect + "  Actual: " + actual);
		assertEquals(expect, actual);
	}

	@Test
	void test3() {
		String input = "07:05:45PM";
		String expect = "19:05:45";
		String actual = test.solution(input);
		System.out.println("Expected: " + expect + "  Actual: " + actual);
		assertEquals(expect, actual);
	}
}
