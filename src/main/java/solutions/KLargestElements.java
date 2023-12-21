package solutions;

import java.util.Arrays;

/**
 * Problem: Given an array Arr of N positive integers and an integer K, find K largest elements from the array. The
 * output elements should be printed in decreasing order.
 * 
 * Example 1:
 * Input: K = 2, Arr[] = {12, 5, 787, 1, 23}
 * Output: 787 23
 * Explanation: 1st largest element in the array is 787 and second largest is 23.
 * 
 * Example 2:
 * Input: K = 3, Arr[] = {1, 23, 12, 9, 30, 2, 50}
 * Output: 50 30 23
 * Explanation: 3 Largest element in the array are 50, 30 and 23.
 * 
 * reference:
 * https://practice.geeksforgeeks.org/problems/k-largest-elements4206/1?
 */
public class KLargestElements {
	/**
	 * PSEUDOCODE:
	 * 1. Sorting the input array 'arr' in ascending order.
	 * 2. Create a new array 'rtn' of size 'k' to store the K largest elements.
	 * 3. Use a loop to iterate 'k' times, starting from 0: Assign the 'i'th largest element from the sorted 'arr' array
	 * to the 'i'th position in 'rtn'.
	 * 4. Return the 'rtn' array containing the K largest elements in descending order.
	 * 
	 * @param int[] nums
	 * @param int   k is largest
	 * @return int[]
	 */
	public int[] solution(int[] arr, int k) {
		Arrays.sort(arr);
		int[] rtn = new int[k];
		for (int i = 0; i < k; i++) {
			rtn[i] = arr[arr.length - 1 - i];
		} // for
		return rtn;
	}

}
