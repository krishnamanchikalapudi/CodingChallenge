package solutions.leetcode.interview.top75q;

import java.util.Arrays;

/**
 * Problem: https://leetcode.com/problems/can-place-flowers/description/?envType=study-plan-v2&envId=leetcode-75
 * 
 * You have a long flowerbed in which some of the plots are planted, and some are not. However, flowers cannot be planted in adjacent plots.
 * 
 * Given an integer array flowerbed containing 0's and 1's, where 0 means empty and 1 means not empty, and an integer n, return true if n new flowers can be planted in the flowerbed without violating the no-adjacent-flowers rule and false otherwise.
 * 
 * Example 1:
 * Input: flowerbed = [1,0,0,0,1], n = 1
 * Output: true
 * 
 * Example 2:
 * Input: flowerbed = [1,0,0,0,1], n = 2
 * Output: false
 */
public class CanPlaceFlowers {
    /**
     * PSEUDO CODE video:
     * 
     * @param flowerbed
     * @param n
     * @return
     */
    public boolean solution(int[] flowerbed, int n) {
        boolean result = false;
        System.out.println("flowerbed: " + Arrays.toString(flowerbed) + "\nn: " + n);
        int adjacentI = 0;
        for (int i = 0; i < flowerbed.length; i++) {
            System.out.println("flowerbed[i]: " + flowerbed[i]);
            if (flowerbed[i] == 0) {
                boolean leftPlot = (i == 0 || flowerbed[i - 1] == 0);
                System.out.println("leftPlot: " + leftPlot);
                boolean rightPlot = (i == flowerbed.length-1 || flowerbed[i + 1] == 0);
                System.out.println("rightPlot: " + rightPlot);
                if (leftPlot && rightPlot && (adjacentI != adjacentI-1)) {
                    n--;
                    flowerbed[i] = 1;
                    System.out.println(" updated flowerbed: " + Arrays.toString(flowerbed));
                } // if
            } // if
        } // for
        System.out.println("n: " + n);
        if (0 >= n)
            result = true;
        return result;
    }
}
