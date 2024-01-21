package solutions.hackerrank.prepkit1week;

import java.util.HashMap;
import java.util.Map;

/**
 * Problem: https://www.hackerrank.com/challenges/one-week-preparation-kit-caesar-cipher-1/
 * 
 * Julius Caesar protected his confidential information by encrypting it using a cipher. Caesar's cipher shifts each letter by a number of letters. If the shift takes you past the end of the alphabet, just rotate back to the front of the alphabet. In the case of a rotation by 3, w, x, y and z would map to z, a, b and c.
 * 
 * Original alphabet:      abcdefghijklmnopqrstuvwxyz
 * Alphabet rotated +3:    defghijklmnopqrstuvwxyzabc
 * 
 * Example
 * Input: s = There's-a-starman-waiting-in-the-sky; k=3
 * Output: Wkhuh'v-d-vwdupdq-zdlwlqj-lq-wkh-vnb
 * 
 * The alphabet is rotated by , matching the mapping above. The encrypted string is .
 * Note: The cipher only encrypts letters; symbols, such as -, remain unencrypted.
 * 
 * Example 2:
 * Input: s= middle-Outz; k=2
 * Output: okffng-Qwvb
 * Explanation:
 * Original alphabet:   abcdefghijklmnopqrstuvwxyz
 * Alphabet rotated +2: cdefghijklmnopqrstuvwxyzab
 * 
 */
public class CaesarCipher {
    public String solution(String s, int k) {
        StringBuffer cipher = new StringBuffer();
        String alphabets = "abcdefghijklmnopqrstuvwxyz";
        System.out.println("alphabets: "+ alphabets);
        if (k>= alphabets.length())
            k = (k % alphabets.length());

        String rotatedAlphabets = alphabets.substring(k) + alphabets.substring(0, k); 
        System.out.println("Rotated Chars: "+ rotatedAlphabets);
        Map<Character, Character> map = new HashMap<>();
        char[] chars = alphabets.toCharArray();
        char[] rotatedChars = rotatedAlphabets.toCharArray();
        for (int i=0; i<chars.length; i++) {
            char c = chars[i], rc=rotatedChars[i];
            map.put(c, rc);
            map.put(Character.toUpperCase(c), Character.toUpperCase(rc)); 
        } // for: c

        char[] sChars = s.toCharArray();
        for(char sc: sChars) {
            if (map.containsKey(sc)) {
                cipher.append( map.get(sc) );
            } else {
                cipher.append(sc);
            }
        } // for: sc

        return cipher.toString();
    }
}
