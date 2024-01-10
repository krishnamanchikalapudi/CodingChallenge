package solutions.hackerrank.interview.arrays;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * Problem: https://www.hackerrank.com/challenges/ctci-array-left-rotation/
 * 
 * A left rotation operation on an array shifts each of the array's elements unit to the left. For example, if 2 left
 * rotations are performed on array [1, 2,3, 4, 5], then the array would become [3, 4, 5, 1, 2].
 * Note that the lowest index item moves to the highest index in a rotation. This is called a circular array.
 * 
 * Given an array a of n integers and a number, d, perform d left rotations on the array. Return the updated array to be
 * printed as a single line of space-separated integers.
 * 
 * Example 1:
 * Input: 4
 * Output: 5 1 2 3 4
 * Explanation: 4 left rotations the array undergoes the sequence:
 * [1 2 3 4 5] --> [2 3 4 5 1] --> [3 4 5 1 2] --> [4 5 1 2 3] --> [5 1 2 3 4 ]
 */
public class LeftRotation {
	/**
	 * PSEUDO CODE video:
	 * 
	 * @param noOfRotation
	 * @param array
	 * @return
	 */
	public List<Integer> solution(int noOfRotation, List<Integer> array) {
		int n = array.size();
		List<Integer> rotatedArray = new ArrayList<>(n);
		for (int i = 0; i < n; i++) {
			int newI = (i + noOfRotation) % n;
			rotatedArray.add(array.get(newI));
		} // for
		return rotatedArray;
	}
}
