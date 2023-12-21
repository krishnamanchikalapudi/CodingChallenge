package solutions;

import java.util.Arrays;

/**
 * Problem: Given n points on a 2D plane where points[i] = [xi, yi], Return the widest vertical area between two points
 * such that no points are inside the area. A vertical area is an area of fixed-width extending infinitely along the
 * y-axis (i.e., infinite height). The widest vertical area is the one with the maximum width.
 * 
 * Note that points on the edge of a vertical area are not considered included in the area.
 * 
 * Example 1:
 * Input: points = [[8,7],[9,9],[7,4],[9,7]]
 * Output: 1
 * Explanation: Both the red and the blue area are optimal.
 * 
 * Example 2:
 * Input: points = [[3,1],[9,0],[1,0],[1,4],[5,3],[8,8]]
 * Output: 3
 * 
 * reference: https://leetcode.com/problems/widest-vertical-area-between-two-points-containing-no-points/
 */
public class WidestVerticalAreaBetweenTwoPoints {
	/**
	 * PSEUDOCODE:
	 * 1. Sort the given points based on their x-coordinates.
	 * 2. Find the maximum width between two consecutive x-coordinates in the sorted points.
	 * 3. Return the maximum width as the result.
	 * 
	 * @param int[][] points
	 * @return int
	 */
	public int solution(int[][] points) {
		Arrays.sort(points, (a, b) -> a[0] - b[0]);
		int maxWidth = 0;

		for (int i = 1; i < points.length; i++) {
			maxWidth = Math.max(maxWidth, points[i][0] - points[i - 1][0]);
		} // for

		return maxWidth;
	}
}
