package solutions.hackerrank.interview.arrays;

import java.util.List;

/**
 * Problem: https://www.hackerrank.com/challenges/2d-array/
 * 
 * Given a 6x6 2D Array, arr:
 * 1 1 1 0 0 0
 * 0 1 0 0 0 0
 * 1 1 1 0 0 0
 * 0 0 0 0 0 0
 * 0 0 0 0 0 0
 * 0 0 0 0 0 0
 * An hourglass in is a subset of values with indices falling in this pattern in 's graphical representation:
 * 
 * a b c
 * - d -
 * e f g
 * There are hourglasses in . An hourglass sum is the sum of an hourglass' values. Calculate the hourglass sum for every
 * hourglass in , then print the maximum hourglass sum. The array will always be .
 * 
 * Example 1:
 * Input:
 * 1 1 1 0 0 0
 * 0 1 0 0 0 0
 * 1 1 1 0 0 0
 * 0 0 2 4 4 0
 * 0 0 0 2 0 0
 * 0 0 1 2 4 0
 * 
 * Output: 19
 * Explanation:
 * * * 1st, 2nd, 3rd Rows * * *
 * 1 1 1, 1 1 0,1 0 0, 0 0 0
 * - 1 -, - 0 -,- 0 -, - 0 -
 * 1 1 1, 1 1 0, 0 0 0, 0 0 0
 * * * * 2nd, 3rd, 4th Rows * * *
 * 0 1 0, 1 0 0, 0 0 0, 0 0 0
 * - 1 -, - 1 -, - 0 -, - 0 -
 * 0 0 2, 1 1 0, 1 0 0, 0 0 0
 * * * * 3rd, 4th, 5th Rows * * *
 * 1 1 1 0 0 0
 * 0 0 2 4 4 0
 * 0 0 0 2 0 0
 * * * * 4th, 5th, 6th Rows * * *
 * 0 0 2 4 4 0
 * 0 0 0 2 0 0
 * 0 0 1 2 4 0
 */
public class HourGlassSum {
	/**
	 * PSEUDO CODE video:
	 * 
	 * @param arr
	 * @return
	 */
	public int solution(List<List<Integer>> arr) {
		int maxSum = Integer.MIN_VALUE;
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				int sum = arr.get(i).get(j) + arr.get(i).get(j + 1) + arr.get(i).get(j + 2);
				sum += arr.get(i + 1).get(j + 1);
				sum += arr.get(i + 2).get(j) + arr.get(i + 2).get(j + 1) + arr.get(i + 2).get(j + 2);

				maxSum = Math.max(maxSum, sum);
			} // for: j
		} // for: i

		return maxSum;
	}
}
