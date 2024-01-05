package solutions;

/**
 * Problem: Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the
 * elements of nums except nums[i].
 * The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
 * You must write an algorithm that runs in O(n) time and without using the division operation.
 * 
 * Example 1:
 * Input: nums = [1,2,3,4]
 * Output: [24,12,8,6]
 * 
 * Example 2:
 * Input: nums = [-1,1,0,-3,3]
 * Output: [0,0,9,0,0]
 * 
 * reference: https://leetcode.com/explore/interview/card/top-interview-questions-hard/116/array-and-strings/827/
 */
public class ProductOfArrayExceptSelf {

	/**
	 * PSEUDOCODE:
	 * 1. Initialize an array 'result' of the same size as the input 'nums'.
	 * 2. Create a variable 'left' and set it to 1.
	 * 3. Iterate through the 'nums' array from left to right:
	 * 3.1. Store the current 'left' value in 'result[i]'.
	 * 3.2. Update 'left' by multiplying it with 'nums[i]'.
	 * 4. Create a variable 'right' and set it to 1.
	 * 5. Iterate through the 'nums' array from right to left:
	 * 5.1. Multiply 'result[i]' by the current 'right' value.
	 * 5.2. Update 'right' by multiplying it with 'nums[i]'.
	 * 6. Return the 'result' array.
	 * 
	 * @param int[] nums
	 * @return int[]
	 */
	public int[] solution(int[] nums) {
		int n = nums.length;
		int[] result = new int[n];

		// Calculate left numbers
		int left = 1;
		for (int i = 0; i < n; i++) {
			result[i] = left;
			left *= nums[i];
		} // for

		// Calculate right numbers and multiply with left numbers
		int right = 1;
		for (int i = n - 1; i >= 0; i--) {
			result[i] *= right;
			right *= nums[i];
		} // for
		return result;
	}

}
