package solutions.hackerrank.prepkit1week;

import java.util.List;

/**
 * Problem: https://www.hackerrank.com/challenges/one-week-preparation-kit-new-year-chaos/
 * 
 * t is New Year's Day and people are in line for the Wonderland rollercoaster ride. Each person wears a sticker indicating their initial position in the queue from 1 to n. Any person can bribe the person directly in front of them to swap positions, but they still wear their original sticker. One person can bribe at most two others.
 * Determine the minimum number of bribes that took place to get to a given queue order. Print the number of bribes, or, if anyone has bribed more than two people, print 'Too chaotic'.
 * 
 * Example:
 * q=[1,2,3,5,4,6,7,8]
 * If person 5 bribes person 4, the queue will look like this: 1,2,3,5,4,6,7,8. Only 1 bribe is required. Print 1.
 * q=[4,1,2,3]
 * Person 4 had to bribe 3 people to get to the current position. Print 'Too chaotic'.
 */
public class MinimumBribes {
    /**
     * PSEUDO CODE video:
     * 
     * @param q
     * @return
     */
     public String solution(List<Integer> q) {
        String str = "Too chaotic";
        int bribes = 0;
		for (int i = q.size() - 1; i >= 0; i--) {
			if (q.get(i) - (i + 1) > 2) {
				return str;
			} // if
			for (int j = Math.max(0, q.get(i) - 2); j < i; j++) {
				if (q.get(j) > q.get(i))
					bribes++;
			} // for: j
		} // for: i
        str = (""+ bribes);
        return str;
     }
}
