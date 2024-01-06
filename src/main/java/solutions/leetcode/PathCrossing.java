/**
 * 
 */
package solutions.leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * Problem: Given a string path, where path[i] = 'N', 'S', 'E' or 'W', each representing moving one unit north, south,
 * east, or west, respectively. You start at the origin (0, 0) on a 2D plane and walk on the path specified by path.
 * 
 * Return true if the path crosses itself at any point, that is, if at any time you are on a location you have
 * previously visited. Return false otherwise.
 *
 * Example 1:
 * Input: path = "NES"
 * Output: false
 * Explanation: Notice that the path doesn't cross any point more than once.
 * 
 * Example 2:
 * Input: path = "NESWW"
 * Output: true
 * Explanation: Notice that the path visits the origin twice.
 * 
 * reference: https://leetcode.com/problems/path-crossing/?
 */
public class PathCrossing {
	/**
	 * PSEUDOCODE:
	 * 1. Initialize variables: x and y to track the current position, and a set to store visited coordinates.
	 * 2. Add the starting point (0, 0) to the set of visited coordinates.
	 * 3. For each direction in the path:
	 * 3.1. Move the position according to the direction (North, South, East, or West).
	 * 3.2. Update the current coordinates as a string in the format "x,y".
	 * 3.3. If the current coordinates are already in the set of visited coordinates, return true as the path crosses
	 * itself.
	 * 3.4. Otherwise, add the current coordinates to the set of visited coordinates.
	 * 4. If the path doesn't cross itself, return false.
	 * 
	 * @param path
	 * @return
	 */
	public boolean solution(String path) {
		int x = 0, y = 0;
		Set<String> visited = new HashSet<>();
		visited.add("0,0");

		for (char direction : path.toCharArray()) {
			if (direction == 'N')
				y++;
			else if (direction == 'S')
				y--;
			else if (direction == 'E')
				x++;
			else if (direction == 'W')
				x--;

			String current = x + "," + y;

			if (visited.contains(current)) {
				return true;
			}
			visited.add(current);
		}
		return false;
	}
}
