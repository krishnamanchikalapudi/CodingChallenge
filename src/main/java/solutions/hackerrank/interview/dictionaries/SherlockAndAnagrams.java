package solutions.hackerrank.interview.dictionaries;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Problem: https://www.hackerrank.com/challenges/sherlock-and-anagrams/
 * 
 * Two strings are anagrams of each other if the letters of one string can be rearranged to form the other string. Given a string, find the number of pairs of substrings of the string that are anagrams of each other
 * 
 * Example
 * s = mom
 * The list of all anagrammatic pairs is [m,m], [mo,om] at positions [[0],[2]],[[0,1],[1,2]] respectively.
 * Returns int: the number of unordered anagrammatic pairs of substrings in 
 * 
 * Example 1:
 * Input: s=abba
 * Output: 4
 * Explanation: The list of all anagrammatic pairs is [a,a],[ab,ba],[b,b] and [abb,bba] at positions [[0],[3]], [[0,1],[2,3]],[[1],[2]] and [[0,1,2],[1,2,3]]  respectively.
 * 
 * Example 2:
 * Input: s=cdcd
 * Output: 5
 */
public class SherlockAndAnagrams {
    /**
     * PSEUDO CODE video:
     * 
     * @param s
     * @return
     */
    public int solution(String s) {
        int count = 0;
        int n = s.length();
        // Create a map to store the frequency of each substring
        Map<String, Integer> freqMap = new HashMap<>();

        // Iterate over all substrings
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j <= n; j++) {
                // Get the substring and sort its characters
                String subS = s.substring(i, j);
                char[] charArray = subS.toCharArray();
                Arrays.sort(charArray);
                String sortedSubS = new String(charArray);

                // Update the frequency map
                freqMap.put(sortedSubS, freqMap.getOrDefault(sortedSubS, 0) + 1);
            } // for: j
        } // for: i

        // Count the number of anagrammatic pairs
        for (int frequency : freqMap.values()) {
            count += frequency * (frequency - 1) / 2;
        } // for: frequency

        return count;
    }
}