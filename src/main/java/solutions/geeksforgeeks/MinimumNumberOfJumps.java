package solutions.geeksforgeeks;

/**
 * Problem: Given an array of N integers arr[] where each element represents the maximum length of the jump that can be
 * made forward from that element. This means if arr[i] = x, then we can jump any distance y such that y ≤ x. Find the
 * minimum number of jumps to reach the end of the array (starting from the first element). If an element is 0, then you
 * cannot move through that element.
 * 
 * Note: Return -1 if you can't reach the end of the array.
 * 
 * Example 1:
 * Input: N = 11 arr[] = {1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9}
 * Output: 3
 * Explanation: First jump from 1st element to 2nd element with value 3. Now, from here we jump to 5th element with
 * value 9, and from here we will jump to the last.
 * 
 * Example 2:
 * Input: N = 6 arr = {1, 4, 3, 2, 6, 7}
 * Output: 2
 * Explanation: First we jump from the 1st to 2nd element and then jump to the last element.
 * 
 * reference: https://practice.geeksforgeeks.org/problems/minimum-number-of-jumps-1587115620/1
 */
public class MinimumNumberOfJumps {
	/**
	 * PSEUDOCODE:
	 * 1. Initialize variables: jumps to count the number of jumps, farthest to keep track of the farthest index that
	 * can be reached, and currentEnd to mark the last index that can be reached in the current set of jumps.
	 * 2. Iterate through the array:
	 * 2.1. Update farthest to the maximum reachable index considering the current element's value and its index.
	 * 2.2. If the current index equals currentEnd: increment jumps to indicate a jump, update currentEnd with the new
	 * farthest, and if the currentEnd reaches the last index or beyond, exit the loop.
	 * Return the number of jumps if the end is reachable; otherwise, return -1.
	 * 
	 * @param int[] arr
	 * @return int
	 */
	public int solution(int arr[]) {
		int n = arr.length;
		int jumps = 0;
		int farthest = 0;
		int currentEnd = 0;

		for (int i = 0; i < n - 1; i++) {
			farthest = Math.max(farthest, i + arr[i]);

			if (i == currentEnd) {
				jumps++;
				currentEnd = farthest;

				if (currentEnd >= n - 1) {
					break;
				} // if
			} // if
		} // for

		return currentEnd >= n - 1 ? jumps : -1;
	}
}