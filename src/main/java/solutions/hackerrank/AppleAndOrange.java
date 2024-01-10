package solutions.hackerrank;

import java.util.Arrays;
import java.util.List;

/**
 * 
 * Problem: https://www.hackerrank.com/challenges/apple-and-orange/
 * 
 * Sam's house has an apple tree and an orange tree that yield an abundance of fruit. Using the information given below,
 * determine the number of apples and oranges that land on Sam's house.
 * 
 * In the diagram below:
 *
 * -----T(apple)------a-------=================--------T(Orange)----
 ** a------------> <---------------> b
 ** d s t
 * 1. The red '=' region denotes the house, where s is the start point, and t is the endpoint. The apple tree is to the
 * left of the house, and the orange tree is to its right.
 * 2. Assume the trees are located on a single point, where the apple tree is at point a, and the orange tree is at
 * point b.
 * 3. When a fruit falls from its tree, it lands d units of distance from its tree of origin along the x-axis. *A
 * negative value of d means the fruit fell d units to the tree's left, and a positive value of d means it falls d units
 * to the tree's right. *
 *
 * Given the value of d for m apples and n oranges, determine how many apples and oranges will fall on Sam's house
 * (i.e., in the inclusive range [s,t])?
 * For example,
 ** Sam's house is between s=7 and t=10. The apple tree is located at a=4 and the orange at b=12.
 ** There are m=3 apples and n=3 oranges.
 ** Apples are thrown apples=[2,3,-4] units distance from a, and oranges=[3,-2,-4] units distance.
 ** Adding each apple distance to the position of the tree, they land at [4+2. 4+3. 4+-4] = [6,70].
 ** Oranges land at [12+3, 12+-2, 12+-4]=[15.10,8].
 ** One apple and two oranges land in the inclusive range 7 -10 so we print 1, 2.
 *
 * Example 1:
 * Input: s=7, t=11, a=5, b=15, m=3, n=2, apples=[-2 2 1], oranges=[5, -6]
 * Output: [1, 1]
 * Explanation:
 * The first apple falls at position 5-2=3.
 * The second apple falls at position 5+2=7.
 * The third apple falls at position 5+1=6.
 * The first orange falls at position 15+5=20.
 * The second orange falls at position 15-6=9.
 * Only one fruit (the second apple) falls within the region between 7 & 11, so we print as our first line of output.
 * Only the second orange falls within the region between 7 & 11, so we print as our second line of output.
 */
public class AppleAndOrange {
	/**
	 * PSEUDO CODE video:
	 * 
	 * @param s,      Sam's house in the inclusive range [s, t]
	 * @param t,      Sam's house in the inclusive range [s, t]
	 * @param a       is apple tree
	 * @param b       is orange tree
	 * @param apples
	 * @param oranges
	 */
	public List<Integer> solution(int s, int t, int a, int b, List<Integer> apples, List<Integer> oranges) {
		int inclusiveA = 0, inclusiveO = 0;
		int m = apples.size(), n = oranges.size();
		System.out.println("M: " + m + "\t N: " + n);
		for (int i = 0; i < m; i++) {
			Integer appleLandsFromTree = (apples.get(i) + a);
			if (appleLandsFromTree >= s && appleLandsFromTree <= t)
				inclusiveA++;
		} // for: Apples

		for (int i = 0; i < n; i++) {
			Integer orangeLandsFromTree = (oranges.get(i) + b);
			if (orangeLandsFromTree >= s && orangeLandsFromTree <= t)
				inclusiveO++;
		} // for: Oranges

		System.out.println("IA: " + inclusiveA + "\t IO: " + inclusiveO);
		return Arrays.asList(inclusiveA, inclusiveO);
	}
}
