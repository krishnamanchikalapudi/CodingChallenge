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
 * 
 * Example 3:
 * Input: nums=[1,2], k=3
 * output: [2,1]
 *Explanation:
 * rotate 1 steps to the right: [2,1]
 * rotate 2 steps to the right: [1,2]
 * rotate 3 steps to the right: [2,1]
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
        int k = (d % n);

        // Reverse the entire array
        for (int i=0; i< n/2; i++) {
            int temp = nums[i];
            nums[i] = nums[n-i-1];
            nums[n-i-1] = temp;
        } // for: i

        // Reverse the 1st portion 'k' elements
        for (int j=0; j<k/2; j++) {
            int temp = nums[j];
            nums[j] = nums[k-j-1];
            nums[k-j-1] = temp;
        } // for: j

        // Reverse the remaining portion 'n-k' elements
        for (int p=k; p< (n+k)/2; p++) {
            int temp = nums[p];
            nums[p] = nums[n-p+k-1];
            nums[n-p+k-1] = temp;
        } // for: p
        
        return nums;
    }
}
