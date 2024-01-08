package solutions.hackerrank;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Problem: https://www.hackerrank.com/challenges/birthday-cake-candles/
 * 
 * You are in charge of the cake for a child's birthday. You have decided the cake will have one candle for each year of
 * their total age. They will only be able to blow out the tallest of the candles. Count how many candles are tallest.
 * 
 * Example 1:
 * Input: [4, 4, 1, 3]
 * Output: 2
 * 
 * Example 2:
 * Input: [3, 2, 1, 3]
 * Output: 2
 */
public class BirthdayCakeCandles {
	/**
	 * PSEUDO CODE video:
	 * 
	 * @param candles
	 * @return
	 */
	public int solution(List<Integer> candles) {
		Map<Integer, Integer> heightMap = new HashMap();
		for (Integer candle : candles) {
			heightMap.put(candle, heightMap.getOrDefault(candle, 0) + 1);
		} // for
		Integer[] mapKeys = heightMap.keySet().toArray(new Integer[heightMap.size()]);
		Arrays.sort(mapKeys);
		Integer heightKey = mapKeys[mapKeys.length - 1];

		return heightMap.get(heightKey);
	}
}
