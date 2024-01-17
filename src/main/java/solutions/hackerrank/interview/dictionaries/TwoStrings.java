package solutions.hackerrank.interview.dictionaries;

import java.util.HashMap;
import java.util.Map;

/**
 * Problem: 
 * 
 * Given two strings, determine if they share a common substring. A substring may be as small as one character.
 * 
 * Example
 * s1 = and, s2 = art
 * These share the common substring .
 * s1 = be, s2 = cat
 * These do not share a substring.
 * Return either YES or NO
 * 
 * Example 1:
 * Input: s1 = hello, s2 = world
 * Output: YES
 * 
 * Example 2:
 * Input: s1 = hi, s2 = world
 * Output: NO
 * 
 */
public class TwoStrings {
    /**
     * PSEUDO CODE video:
     * 
     * @param s1
     * @param s2
     * @return
     */
    public String solution(String s1, String s2) {
        boolean found = false;
        Map<Character, Integer> s1Map = new HashMap<>();
        for (int i=0; i<s1.length(); i++) {
            char c= s1.charAt(i);
            s1Map.put(c, s1Map.getOrDefault(c, 0)+1);
        } // for: s1

        for (int j=0; j<s2.length(); j++) {
            char c = s2.charAt(j);
            if (s1Map.containsKey(c)) {
                found = true;
            }
        } // for: s2

        if (found)
            return "YES";
        else
            return "NO";
    }
}
