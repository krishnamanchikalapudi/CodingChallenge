package solutions.hackerrank.interview.arrays;

import java.util.List;

/**
 * 
 * Problem: https://www.hackerrank.com/challenges/crush/
 * 
 * Starting with a 1-indexed array of zeros and a list of operations, for each operation add a value to each the array
 * element between two given indices, inclusive. Once all operations have been performed, return the maximum value in
 * the array.
 * 
 * Example
 * n=10
 * queries = [[1,5,3],[4,8,7],[6,9,1]]
 * 
 * Queries are interpreted as follows:
 * a b k
 * 1 5 3
 * 4 8 7
 * 6 9 1
 * 
 * Add the values of k between the indices a and b inclusive:
 * index-> 1 2 3 4 5 6 7 8 9 10
 * ------ [0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
 * ------ [3, 3, 3, 3, 3, 0, 0, 0, 0, 0]
 * ------ [3, 3, 3, 10, 10,7, 7, 7, 0, 0]
 * ------ [3, 3, 3, 10, 10,8, 8, 8, 1, 0]
 * The largest value is 10 after all operations are performed.
 * 
 * Example 1:
 * Input: n=5, queries=[[1,2,100], [2,5,100],[3,4,100]]
 * Output: 200
 * Explanation:
 * * After the first update the list is 100 100 0 0 0.
 * * After the second update list is 100 200 100 100 100.
 * * After the third update list is 100 200 200 200 100.
 * The maximum value is 200.
 */
public class ArrayManipulation {
	/**
	 * PSEUDO CODE video:
	 * 
	 * @param n
	 * @param queries
	 * @return
	 */
	public long solution(int n, List<List<Integer>> queries) {
		long[] arr = new long[n + 1];

		for (List<Integer> query : queries) {
			int a = query.get(0);
			int b = query.get(1);
			int k = query.get(2);

			arr[a - 1] += k;
			arr[b] -= k;
		} // for: queries

		long max = 0;
		long current = 0;

		for (long value : arr) {
			current += value;
			max = Math.max(max, current);
		} // for: arr

		return max;
	}
}
