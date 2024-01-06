package solutions.leetcode.unit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import solutions.leetcode.LengthOfLongestSubstring;

class LengthOfLongestSubstringTests {

	private final LengthOfLongestSubstring lengthOfLongestSubstring = new LengthOfLongestSubstring();

	@Test
	void test1() {
		assertEquals(3, lengthOfLongestSubstring.solution("abcabcbb"));
	}

	@Test
	void test2() {
		assertEquals(1, lengthOfLongestSubstring.solution("bbbbb"));
	}

	@Test
	void test3() {
		assertEquals(3, lengthOfLongestSubstring.solution("pwwkew"));
	}

}
