/**
 * 
 */
package solutions;

import java.util.HashMap;
import java.util.Map;

/**
 * Problem: Given a string s, find the length of the longest substring without
 * repeating characters.
 * 
 * Example 1:
 * Input: s = "abcabcbb"
 * Output: 3
 * Explanation: The answer is "abc", with the length of 3.
 * 
 * Example 2:
 * Input: s = "bbbbb"
 * Output: 1
 * Explanation: The answer is "b", with the length of 1.
 * 
 * Example 3:
 * Input: s = "pwwkew"
 * Output: 3
 * Explanation: The answer is "wke", with the length of 3.
 * 
 * Notice that the answer must be a substring, "pwke" is a subsequence
 * and not a substring.
 * 
 * reference:
 * https://leetcode.com/problems/longest-substring-without-repeating-characters/
 */
public class LengthOfLongestSubstring {

	/**
	 * PSEUDOCODE:
	 * 1. Initialize a map to track the last occurrence index of characters and set two pointers, 'start' and 'end',
	 * at the beginning of the string.
	 * 2. Iterate 'end' over the string: if the character exists in the map, update
	 * start' to the next index of the existing character, and update the maximum length by comparing the current length
	 * with (end - start + 1).
	 * 3. Store each character's index in the map and update 'end'.
	 * 4. Continue this process, updating 'start', 'end', and the maximum length until 'end' reaches the end of the
	 * string.
	 * 5. Return the maximum length found, representing the length of the longest substring without repeating
	 * characters.
	 */
	public int solution(String s) {
		int n = s.length();
		int longest = 0;
		Map<Character, Integer> map = new HashMap<>();

		for (int end = 0, start = 0; end < n; end++) {
			char c = s.charAt(end);
			if (map.containsKey(c)) {
				start = Math.max(map.get(c), start);
			} // if
			longest = Math.max(longest, end - start + 1);
			map.put(c, end + 1);
		} // for
		return longest;
	}

}
