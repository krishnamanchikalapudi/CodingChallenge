/**
 * 
 */
package solutions.hackerrank;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Problem at https://www.hackerrank.com/challenges/sock-merchant/problem
 * 
 * Example 1:
 * Input: nums = [1, 2, 1, 2, 1, 3, 2]
 * Output: 3
 * Explanation: There is one pair of color 1 and one of color 2. There are three odd socks left, one of each color. The
 * number of pairs is 2.
 * 
 * Example 2:
 * Input: nums = [10, 20, 20, 10, 10, 30, 50, 10, 20]
 * Output: 3
 * 
 * Example 3:
 * Input: nums = [10, 20, 20, 50, 30, 30, 50, 70, 10, 20, 70]
 * Output: 5
 * 
 */
public class SockMerchant {

	/**
	 * PSEUDO:
	 * 1. Set the total number of pairs to 0.
	 * 2. Create an empty map to keep track of the count of each color.
	 * 3. Go through the input color array: if the color is already in countMap, increase its count by 1.
	 * 4. Calculate pairs: Loop through the counts of each sock color in countMap. For each count:
	 * 
	 * Calculate the number of pairs for that color by dividing the count by 2 and add this to the total pairs.
	 * Return pairs: Once all counts are checked, return the total pairs.
	 * 
	 * @param colors
	 * @return
	 */

	public int solution(List<Integer> colors) {
		// Write your code here
		int pairs = 0;
		// count the occurances
		Map<Integer, Integer> colorMap = new HashMap();
		for (int color : colors) {
			colorMap.put(color, colorMap.getOrDefault(color, 0) + 1);
		} // for

		// count pairs for each color
		for (int count : colorMap.values())
			pairs += (count / 2);
		return pairs;
	}
}
