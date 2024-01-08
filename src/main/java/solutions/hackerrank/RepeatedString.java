package solutions.hackerrank;

/**
 * Problem: https://www.hackerrank.com/challenges/repeated-string/
 * 
 * There is a string s, of lowercase English letters that is repeated infinitely many times. Given an integer n, find
 * and print the number of letter a's in the first n letters of the infinite string.
 * 
 * Example 1
 * Input:
 * s = aba
 * n = 10
 * Output: 7
 * Explanation: The first n=10 letters of the infinite string are abaabaabaa. Because there are 7 a's, we return .
 * 
 * Example 2
 * Input:
 * s = abcac
 * n = 10
 * Output: 4
 * Explanation: The first n=10 letters of the infinite string are abcacabcac. Because there are 4 a's we return
 * 
 * Example 3
 * Input:
 * s = a
 * n = 10
 * Output: 10
 */
public class RepeatedString {
	/**
	 * PSEUDO CODE video:
	 * 
	 * @param s
	 * @param n
	 * @return
	 */
	public long solution(String s, long n) {
		long aCount = 0;
		int sLen = s.length();
		long repeatS = n / sLen;
		int appendChars = (int) (n - (sLen * repeatS));
		for (int i = 0; i < sLen; i++) {
			if (s.charAt(i) == 'a')
				aCount++;
		} // for

		long totalAcount = (repeatS * aCount);

		String remainingChars = s.substring(0, appendChars);
		for (int i = 0; i < remainingChars.length(); i++) {
			if (s.charAt(i) == 'a')
				totalAcount++;
		} // for
		return totalAcount;
	}

	public long solutionWithOutOfMemoryErrorOnTest5(String s, long n) {
		int sLen = s.length();
		long repeatS = n / sLen;
		int appendChars = (int) (n - (sLen * repeatS));

		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < repeatS; i++) {
			sb.append(s);
		} // for
		sb.append(s.substring(0, appendChars));

		char[] sChars = sb.toString().toCharArray();
		int aLen = 0;
		for (char sChar : sChars) {
			if ('a' == sChar)
				aLen++;
		} // for

		return aLen;
	}
}
