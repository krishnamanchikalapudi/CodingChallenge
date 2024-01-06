/**
 * 
 */
package solutions.hackerrank;

import java.util.Arrays;
import java.util.List;

/**
 * Problem: https://www.hackerrank.com/challenges/plus-minus/
 * 
 * Given an array of integers, calculate the ratios of its elements that are positive, negative, and zero. Print the
 * decimal value of each fraction on a new line with places after the decimal.
 * 
 * Example 1:
 * Input: [1, 1, 0, -1, -1]
 * Output:
 * size: 5
 * two +ve's = 2/5 = 0.4
 * two -ve's = 2/5 = 0.4
 * one 0 = 1/5 = 0.2
 * 
 * Example 2:
 * Input: [-4, 3, -9, 0, 4, 1]
 * Output:
 * size: 6
 * two +ve's = 3/6 = 0.5
 * two -ve's = 2/6 = 0.3333
 * one 0 = 1/6 = 0.16667
 */
public class PlusMinus {
	/**
	 * PSEUDO CODE video:
	 * 
	 * @param nums
	 * @return
	 */
	public List<Double> solution(List<Integer> nums) {
		int n = nums.size();
		double postiveCount = 0, negativeCount = 0, zeroCount = 0;
		for (int num : nums) {
			if (num > 0)
				postiveCount++;
			else if (num < 0)
				negativeCount++;
			else
				zeroCount++;
		} // for

		return Arrays.asList(postiveCount / n, negativeCount / n, zeroCount / n);
	}
}
