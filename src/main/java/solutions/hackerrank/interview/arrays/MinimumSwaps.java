package solutions.hackerrank.interview.arrays;

/**
 * 
 * Problem: https://www.hackerrank.com/challenges/minimum-swaps-2/
 * 
 * You are given an unordered array consisting of consecutive integers [1, 2, 3, ..., n] without any duplicates. You are
 * allowed to swap any two elements. Find the minimum number of swaps required to sort the array in ascending order.
 * 
 * Example
 * input arr = [7,1,3,2,4,5,6]
 * 
 * Perform the following steps:
 * i ----- arr ----------- swap (indices)
 * 0 [7, 1, 3, 2, 4, 5, 6] swap (0,3)
 * 1 [2, 1, 3, 7, 4, 5, 6] swap (0,1)
 * 2 [1, 2, 3, 7, 4, 5, 6] swap (3,4)
 * 3 [1, 2, 3, 4, 7, 5, 6] swap (4,5)
 * 4 [1, 2, 3, 4, 5, 7, 6] swap (5,6)
 * 5 [1, 2, 3, 4, 5, 6, 7]
 * 
 * It took 5 swaps to sort the array.
 * 
 * Example 1:
 * * Input = [4, 3, 1, 2]
 * * Output: 3
 * * Explanation:
 * * After swapping (0,2) we get [1, 3, 4, 2]
 * * After swapping (1,2) we get [1, 4, 3, 2]
 * * After swapping (1,3) we get [1, 2, 3, 4]
 * So, we need a minimum of 3 swaps to sort the array in ascending order.
 *
 * Example 2:
 * * Input = [2, 3, 4, 1, 5]
 * * Output: 3
 * * Explanation:
 * * After swapping (2, 3) we get [2, 3, 1, 4, 5]
 * * After swapping (0,1) we get [3, 2, 1 4, 5]
 * * After swapping (0,2) we get [1, 2, 3, 4, 5]
 * So, we need a minimum of 3 swaps to sort the array in ascending order.
 */
public class MinimumSwaps {
	/**
	 * PSEUDO CODE video:
	 * 
	 * @param arr
	 * @return
	 */
	public int solution(int[] arr) {
		int minSwaps = 0;
		for (int i = 0; i < arr.length; i++) {
			while (arr[i] != (i + 1)) {
				int temp = arr[i];
				arr[i] = arr[temp - 1];
				arr[temp - 1] = temp;
				minSwaps++;
			} // while
		} // for: i
		return minSwaps;
	}
}
