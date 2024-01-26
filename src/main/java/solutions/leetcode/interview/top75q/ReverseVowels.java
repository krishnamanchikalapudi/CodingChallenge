package solutions.leetcode.interview.top75q;

import java.util.Arrays;
import java.util.List;

/**
 * Problem:
 * https://leetcode.com/problems/reverse-vowels-of-a-string/?envType=study-plan-v2&envId=leetcode-75
 * 
 * Given a string s, reverse only all the vowels in the string and return it.
 * 
 * The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both lower
 * and upper cases, more than once.
 * 
 * Example 1:
 * Input: s = "hello"
 * Output: "holle"

 * Example 2: 
 * Input: s = "leetcode"
 * Output: "leotcede"
 */
public class ReverseVowels {
    public String solution(String s) {
        List<Character> vowelsDict = Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U');

        char[] sChars = s.toCharArray();
        // collect vowels from S
        String sVowels = "";
        for (char c : sChars) {
            if (vowelsDict.contains(c)) {
                sVowels += c;
            } // if
        } // for
        System.out.println("Vowels in input " + s + " String: " + sVowels);

        // replace the vowels in reverse order
        int j = sVowels.length();
        for (int i = 0; i < sChars.length; i++) {
            char c = sChars[i];
            if (vowelsDict.contains(c)) {
                char vChar = sVowels.charAt(--j);
                sChars[i] = vChar;
                System.out.println("vChar: " + vChar + " ; sChars[i]: " + sChars[i]);
            } // if
        } // for
        
        return String.valueOf(sChars);
    }
}
