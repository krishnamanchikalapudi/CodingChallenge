package solutions.hackerrank.interview.arrays;

import java.util.List;

/**
 * 
 * Problem: https://www.hackerrank.com/challenges/new-year-chaos
 * 
 * It is New Year's Day and people are in line for the Wonderland rollercoaster ride. Each person wears a sticker
 * indicating their initial position in the queue from 1 to n. Any person can bribe the person directly in front of them
 * to swap positions, but they still wear their original sticker. One person can bribe at most two others.
 * 
 * Determine the minimum number of bribes that took place to get to a given queue order. Print the number of bribes, or,
 * if anyone has bribed more than two people, print Too chaotic.
 * 
 * Example:
 * q= [1, 2, 3, 5, 4, 6, 7, 8]
 * if person 4 bribes person 4, the queue will look like this: 1,2,3,5,4,6,7,8. Only 1 bribe is required. Print 1.
 * q=[4,1,2,3]
 * Person 4 had to bribe 3 people to get to the current position. Print 'Too chaotic'.
 * 
 * Example 1:
 * STDIN Function
 * ----- --------
 * 2 t = 2
 * 5 n = 5
 * 2 1 5 3 4 q = [2, 1, 5, 3, 4]
 * 5 n = 5
 * 2 5 1 3 4 q = [2, 5, 1, 3, 4]
 * Output:
 * 3
 * Too chaotic
 */
public class NewYearChaos {
	/**
	 * PSEUDO CODE video:
	 * 
	 * @param q
	 */
	public String solution(List<Integer> q) {
		int bribes = 0;
		for (int i = q.size() - 1; i >= 0; i--) {
			if (q.get(i) - (i + 1) > 2) {
				return ("Too chaotic");
			} // if
			for (int j = Math.max(0, q.get(i) - 2); j < i; j++) {
				if (q.get(j) > q.get(i))
					bribes++;
			} // for: j
		} // for: i
		return (""+bribes);
	}
}
