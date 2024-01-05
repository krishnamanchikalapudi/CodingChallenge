/**
 * 
 */
package solutions.hackerrank.interview;

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

	/*
	 * Complete the 'sockMerchant' function below.
	 *
	 * The function is expected to return an INTEGER.
	 * The function accepts following parameters:
	 * 1. INTEGER n
	 * 2. INTEGER_ARRAY ar
	 */

	public int solution(List<Integer> colors) {
		// Write your code here
		int pairs = 0;
		// count the occuraces
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
