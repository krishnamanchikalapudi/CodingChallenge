package solutions.hackerrank.prepkit1week;

import java.util.List;

/**
 * Problem: https://www.hackerrank.com/challenges/one-week-preparation-kit-diagonal-difference/
 * 
 * Given a square matrix, calculate the absolute difference between the sums of its diagonals.
 * 
 * Example 1:
 * 1 2 3
 * 4 5 6
 * 9 8 9
 * The left-to-right diagonal = 1 + 5 + 9 = 15. The right to left diagonal = 3 + 5 + 9 = 17. Their absolute difference
 * is 17 - 15 = 2.
 * 
 * Example 2:
 * 11 2 4
 * 4 5 6
 * 10 8 -12
 * The left-to-right diagonal = 11 + 5 -12 = 4. The right to left diagonal = 4 + 5 + 10 = 19. Their absolute difference
 * is 19 - 4 = 15.
 */
public class DiagonalDifference {
	/**
	 * PSEUDO CODE video:
	 * 
	 * @param nums
	 * @return
	 */
	public int solution(List<List<Integer>> nums) {
		int leftDiagonalSum = 0, rightDiagonalSum = 0;
		int rowsCount = nums.size();
		for (int row = 0; row < rowsCount; row++) {
			leftDiagonalSum += nums.get(row).get(row);
			rightDiagonalSum += nums.get(row).get(rowsCount - 1 - row);
		} // for: rows
		int diff = Math.abs(leftDiagonalSum - rightDiagonalSum);

		System.out.println("diff (leftDiagonalSum: " + leftDiagonalSum + ", rightDiagonalSum: " + rightDiagonalSum
				+ ") = " + diff);

		return diff;
	}
}
