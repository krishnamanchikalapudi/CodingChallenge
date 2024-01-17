package solutions.leetcode.interview.top150q;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
/**
 * Problem: https://leetcode.com/problems/remove-duplicates-from-sorted-array/
 * 
 * Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once. The relative order of the elements should be kept the same. Then return the number of unique elements in nums.
 * 
 * Consider the number of unique elements of nums to be k, to get accepted, you need to do the following things:
 * 1. Change the array nums such that the first k elements of nums contain the unique elements in the order they were present in nums initially. The remaining elements of nums are not important as well as the size of nums.
 * 2. Return k.
 * 
 * Example 1:
 * Input: nums = [1,1,2]
 * Output: 2, nums = [1,2,_]
 * Explanation: Your function should return k = 2, with the first two elements of nums being 1 and 2 respectively. It does not matter what you leave beyond the returned k (hence they are underscores).
 * 
 * Example 2:
 * Input: nums = [0,0,1,1,1,2,2,3,3,4]
 * Output: 5, nums = [0,1,2,3,4,_,_,_,_,_]
 * Explanation: Your function should return k = 5, with the first five elements of nums being 0, 1, 2, 3, and 4 respectively. It does not matter what you leave beyond the returned k (hence they are underscores).
 */
public class RemoveDuplicatesFromSortedArray {
    /**
     * PSEUDO CODE video: 
     * 
     * @param nums
     * @return
     */
    public int solution (int[] nums) {
       int k=1;
       Arrays.sort(nums);
        for (int i=1; i<nums.length; i++) {
            if (nums[i] != nums[i-1]) {
                nums[k++] = nums[i];
            } // if
        } // for
        return k;
    }
    public int solution1 (int[] nums) {
        Map<Integer, Integer> count = new HashMap();
        for (int i=0; i<nums.length; i++) {
            count.put(nums[i], count.getOrDefault(nums[i], 0)+1);
        } // for
        return count.size();
    }
}
