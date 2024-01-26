package solutions.leetcode.interview.top75q;

/**
 * Problem:
 * https://leetcode.com/problems/increasing-triplet-subsequence/?envType=study-plan-v2&envId=leetcode-75
 * 
 * Given an integer array nums, return true if there exists a triple of indices
 * (i, j, k) such that i < j < k and nums[i] < nums[j] < nums[k]. If no such
 * indices exists, return false.
 * 
 * Example 1:
 * Input: nums = [1,2,3,4,5]
 * Output: true
 * Explanation: Any triplet where i < j < k is valid.
 * 
 * Example 2:
 * Input: nums = [5,4,3,2,1]
 * Output: false
 * Explanation: No triplet exists.
 * 
 * Example 3:
 * Input: nums = [2,1,5,0,4,6]
 * Output: true
 * Explanation: The triplet (3, 4, 5) is valid because nums[3] == 0 < nums[4] ==
 * 4 < nums[5] == 6.
 * 
 */
public class IncreasingTriplet {
    /**
     * PSEUDO CODE video:
     * 
     * @param nums
     * @return
     */

    public boolean solution(int[] nums) {
        int max1 = Integer.MAX_VALUE;
        int max2 = Integer.MAX_VALUE;
        for (int n : nums) {
            if (n <= max1)
                max1 = n;
            else if (n <= max2)
                max2 = n;
            else
                return true;
        }
        return false;
     }
    public boolean solution1(int[] nums) {
        boolean result = false;
        if (nums != null && nums.length > 3) {
            for (int p = 0; p < nums.length - 2; p++) {
                int i = nums[p];
                int j = nums[p + 1];
                int k = nums[p + 2];
                if (i < j && j < k) {
                    System.out.println(p + "; I: " + i + " J: " + j + " K: " + k);
                    result = true;
                } // if
            } // for
        }
        return result;
    }
}