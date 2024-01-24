package solutions.leetcode.interview.top75q;

/**
 * Problem:
 * https://leetcode.com/problems/merge-strings-alternately/?envType=study-plan-v2&envId=leetcode-75
 * 
 * You are given two strings word1 and word2. Merge the strings by adding
 * letters in alternating order, starting with word1. If a string is longer than
 * the other, append the additional letters onto the end of the merged string.
 * Return the merged string.
 * 
 * Example 1:
 * Input: word1 = "abc", word2 = "pqr"
 * Output: "apbqcr"
 * 
 * Example 2:
 * Input: word1 = "ab", word2 = "pqrs"
 * Output: "apbqrs"
 * 
 * Example 3:
 * Input: word1 = "abcd", word2 = "pq"
 * Output: "apbqcd"
 */
public class MergeAlternately {
    /**
     * PSEUDO CODE video:
     * 
     * @param word1
     * @param word2
     * @return
     */
    public String solution(String word1, String word2) {
        int m = word1.length(), n = word2.length();
        StringBuilder result = new StringBuilder();
        int i = 0, j = 0;

        while (i < m || j < n) {
            if (i < m) {
                result.append(word1.charAt(i++));
            } // if
            if (j < n) {
                result.append(word2.charAt(j++));
            } // if
        } // while
        return result.toString();
    }
}
