package solutions.leetcode.interview.top75q;

import java.util.Arrays;

/**
 * Problem:
 * https://leetcode.com/problems/product-of-array-except-self/description/?envType=study-plan-v2&envId=leetcode-75
 * 
 * Given an integer array nums, return an array answer such that answer[i] is
 * equal to the product of all the elements of nums except nums[i].
 * 
 * The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
 * 
 * You must write an algorithm that runs in O(n) time and without using the division operation.
 * 
 * Example 1: 
 * Input: nums = [1,2,3,4]
 * Output: [24,12,8,6]
 * 
 * Example 2:
 * Input: nums = [-1,1,0,-3,3]
 * Output: [0,0,9,0,0]
 */
public class ProductExceptSelf {
    /**
     * PSEUDO CODE video:
     * 
     * @param nums
     * @return
     */
    public int[] solution(int[] nums) {
        System.out.println("nums: " + Arrays.toString(nums));
        int n = nums.length;
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            int k = 1;
            for (int j = 0; j < n; j++) {
                if (i != j) {
                    k *= nums[j];
                } // if
            } // for
            result[i] = k;
        } // for

        System.out.println("result: " + Arrays.toString(result));
        return result;
    }
    public int[] solution1(int[] nums) {
        System.out.println("nums: " + Arrays.toString(nums));

        int n = nums.length;
        int[] result = new int[n];
        // Calculate left numbers
        int left = 1;
        for (int i = 0; i < n; i++) {
            result[i] = left;
            left *= nums[i];
            System.out.println(i + " left: " + left + " ; result[i]: " + result[i]);
        } // for

        // Calculate right numbers and multiply with left numbers
        int right = 1;
        for (int i = n - 1; i >= 0; i--) {
            result[i] *= right;
            right *= nums[i];
            System.out.println(i + " right: " + right + " ; result[i]: " + result[i]);
        } // for

        System.out.println("result: " + Arrays.toString(result));
        return result;
    }
}
