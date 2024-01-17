package solutions.hackerrank.interview.dictionaries;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Problem: https://www.hackerrank.com/challenges/ctci-ransom-note/
 * 
 * Harold is a kidnapper who wrote a ransom note, but now he is worried it will be traced back to him through his handwriting. He found a magazine and wants to know if he can cut out whole words from it and use them to create an untraceable replica of his ransom note. The words in his note are case-sensitive and he must use only whole words available in the magazine. He cannot use substrings or concatenation to create the words he needs.
*
* Given the words in the magazine and the words in the ransom note, print Yes if he can replicate his ransom note exactly using whole words from the magazine; otherwise, print No.
*
* Example
* magazine = "attack at dawn"  note = "Attack at dawn"
The magazine has all the right words, but there is a case mismatch. The answer is No.
 * 
 * Example 1:
 * Input: magazine='give me one grand today night', note='give one grand today'
 * Output: Yes
 * 
 * Example 2:
 * Input:magazine='two times three is not four', note='two times two is four'
 * Output: No
 * Explanation: 'two' only occurs once in the magazine.
 * 
 * Example 3:
 * Input: magazine='ive got a lovely bunch of coconuts', note='ive got some coconuts'
 * Output: No
 * Explanation: Harold's magazine is missing the word 'some'.
 */
public class CheckMagazine {
    /**
     * PSEUDO CODE video:
     * 
     * @param magazine
     * @param note
     * @return
     */
    public String solution(List<String> magazine, List<String> note) {
        boolean found =true;
        Map<String, Integer> magWords = new HashMap<>();
        for (String mWord:magazine) {
            magWords.put(mWord, magWords.getOrDefault(mWord, 0)+1);
        } // for

        for (String nWord: note) {
            if (magWords.containsKey(nWord) && magWords.get(nWord) >=1) {
                magWords.put(nWord, magWords.get(nWord)-1);
            } else {
                found = false;
            } // if
        } // for

        if (found)
            return "Yes";
        else
            return "No";
    }
}
