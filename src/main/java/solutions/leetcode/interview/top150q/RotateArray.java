package solutions.leetcode.interview.top150q;
/**
 * Problem: https://leetcode.com/problems/rotate-array/
 * 
 * Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.
 * 
 * Example 1:
 * Input: nums = [1,2,3,4,5,6,7], k = 3
 * Output: [5,6,7,1,2,3,4]
 * Explanation:
 * rotate 1 steps to the right: [7,1,2,3,4,5,6]
 * rotate 2 steps to the right: [6,7,1,2,3,4,5]
 * rotate 3 steps to the right: [5,6,7,1,2,3,4]
 * 
 * Example 2:
 * Input: nums = [-1,-100,3,99], k = 2
 * Output: [3,99,-1,-100]
 * Explanation: 
 * rotate 1 steps to the right: [99,-1,-100,3]
 * rotate 2 steps to the right: [3,99,-1,-100]
 */
public class RotateArray {
    /**
     * PSEUDO CODE video:
     * @param nums
     * @param k
     * @return
     */
    public int[] solution(int[] nums, int d) {
        int n=nums.length;
        for (int i = n; i > d; i--) {
            int j, temp = nums[0];
            for (j = 0; j < n - 1; j++) { 
                nums[j] = nums[j + 1];
            } // for: j
            nums[j] = temp;
        } // for: i
        return nums;
    }
}
