package solutions.leetcode;

import java.util.Arrays;
import java.util.PriorityQueue;

/**
 * Problem: Given an integer array nums and an integer k, return the kth largest element in the array. Can you
 * solve it without sorting?
 * 
 * Note that it is the kth largest element in the sorted order, not the kth distinct element.
 * 
 * Example 1:
 * Input: nums = [3,2,1,5,6,4], k = 2
 * Output: 5
 * 
 * Example 2:
 * Input: nums = [3,2,3,1,2,4,5,5,6], k = 4
 * Output: 4
 * 
 * reference: https://leetcode.com/problems/kth-largest-element-in-an-array/
 */

public class KLargestElement {
	/**
	 * PSEUDOCODE:
	 * 1. Sort the 'nums' array in ascending order
	 * 2. Return the element at the index 'nums.length - k' as the kth largest element in the sorted array.
	 * 
	 * @param int[] nums
	 * @param int   k
	 * @return int
	 */
	public int solution(int[] nums, int k) {
		Arrays.sort(nums);
		return nums[nums.length - k];
	}

	/**
	 * PSEUDOCODE:
	 * 1. Initialize a PriorityQueue (min heap).
	 * 2. Iterate through the elements of the input array.
	 * 3. Add each element to the min heap.
	 * 4. If the size of the heap exceeds 'k', remove the smallest element from the heap.
	 * 5. Return the top element from the heap, which represents the kth largest element in the array.
	 * 
	 * @param int[] nums
	 * @param int   k
	 * @return int
	 */
	public int solutionWithNoSort(int[] nums, int k) {
		PriorityQueue<Integer> minHeap = new PriorityQueue<>();
		for (int num : nums) {
			minHeap.offer(num);
			if (minHeap.size() > k) {
				minHeap.poll();
			} // if
		} // for

		return minHeap.peek();
	}
}
