package solutions.hackerrank;

import java.util.List;

/**
 * Problem: https://www.hackerrank.com/challenges/jumping-on-the-clouds/
 * 
 * There is a new mobile game that starts with consecutively numbered clouds. Some of the clouds are thunderheads and
 * others are cumulus. The player can jump on any cumulus cloud having a number that is equal to the number of the
 * current cloud plus 1 or 2. The player must avoid the thunderheads. Determine the minimum number of jumps it will take
 * to jump from the starting postion to the last cloud. It is always possible to win the game.
 * 
 * For each game, you will get an array of clouds numbered 0 if they are safe or 1 if they must be avoided.
 * 
 * Example: c=[0,1,0,0,0,1,0]
 * Index the array from 0..6. The number on each cloud is its index in the list so the player must avoid the clouds at
 * indices 1 and 5. They could follow these two paths: 0 -> 2 -> 4 -> 6 or 0 -> 2 -> 3 -> 4 ->6 . The first path takes 3
 * jumps while the second takes 4. Return 3.
 * 
 * Example 1:
 * Input: 0,0,1,0,0,1,0
 * Output: 4
 * 
 * Example 2:
 * Input: 0, 0, 0, 0, 1, 0
 * Output: 3
 */
public class JumpingOnTheClouds {
	/**
	 * PSEUDO CODE video:
	 * 
	 * @param c
	 * @return
	 */
	public int solution(List<Integer> c) {
		int jumps = 0;
		int cloudsLen = c.size();
		int i = 0;
		while (i < cloudsLen - 1) {
			// Jump by 2 if the next two clouds are safe
			if (i + 2 < cloudsLen && c.get(i + 2) == 0)
				i += 2;
			else
				i++;

			jumps++;
		} // while
		return jumps;
	}

}
