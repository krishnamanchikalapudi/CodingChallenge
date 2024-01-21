package solutions.hackerrank.prepkit1week;

import java.util.Comparator;
import java.util.List;

/**
 **
 * Problem: https://www.hackerrank.com/challenges/one-week-preparation-kit-mini-max-sum/
 * 
 * Given five positive integers, find the minimum and maximum values that can be calculated by summing exactly four of
 * the five integers. Then print the respective minimum and maximum values as a single line of two space-separated long
 * integers.
 * 
 * Example 1:
 * Input: [1, 3, 5, 7, 9]
 * Output:
 * Minimum sum: 1 + 3 + 5 + 9 = 16
 * Maximum sum: 3 + 5 + 7 + 9 = 24
 * 
 * Example 2:
 * Input: [1, 2, 3, 4, 5]
 * Output:
 * Minimum sum: 1 + 2 + 3 + 4 = 10
 * Maximum sum: 2 + 3 + 4 + 5 = 14
 */
public class MiniMaxSum {
	/**
	 * PSEUDO CODE video:
	 * 
	 * @param arr
	 * @return
	 */
	public long[] solution(List<Integer> arr) {
		long minSum = 0, maxSum = 0;
		int n = arr.size();
		arr.sort(Comparator.naturalOrder());
		
		for (int i = 0; i < (n - 1); i++) {
			minSum += arr.get(i);
			maxSum += arr.get(n - 1 - i);
		} // for

		return new long[] { (long) minSum, (long) maxSum };
	}
}
