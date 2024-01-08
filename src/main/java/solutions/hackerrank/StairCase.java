/**
 * 
 */
package solutions.hackerrank;

/**
 * Problem: https://www.hackerrank.com/challenges/staircase/
 * 
 * Staircase detail, *its base and height are both equal to . It is drawn using # symbols and spaces. The last line is
 * not preceded by any spaces. Write a program that prints a staircase of size n.
 * 
 * This is a staircase of size n: 4
 * #
 * ##
 * ###
 * ####
 */
public class StairCase {
	/**
	 * PSEUDO CODE video:
	 * 
	 * @param n
	 */
	public void solution(int n) {

		for (int i = 0; i < n; i++) {
			int spaces = 0;
			if ((n - 1) != i)
				spaces = (n - i - 1);

			if (spaces != 0)
				System.out.print(String.format("%" + spaces + "s", " "));
			for (int j = 0; j <= i; j++) {
				System.out.print("#");
			} // for: j
			System.out.println("");
		} // for: i

	}

	public void leftAlignedSolution(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("#");
			} // for: j
			System.out.println("");
		} // for: i
	}
}
