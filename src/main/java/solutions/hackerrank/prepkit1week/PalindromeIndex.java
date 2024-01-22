package solutions.hackerrank.prepkit1week;
/**
 * Given a string of lowercase letters in the range ascii[a-z], determin the index of a character that can be removed to make the string a palindrome. There may be more than one solution, but any will do. If the word is already a palindrome or there is no solution, return -1. Otherwise, return the index of a character to remove.
 * 
 * Example:
 * s='bcbc'
 * Either remove 'b' at index 0 or 'c' at index 3.
 * 
 * Example 1:
 * s='aaab'
 * output: 3
 * 
 * Example 2:
 * s=baa
 * output: 0
 * 
 * Example 3:
 * s=aaa
 * output: -1
 */
public class PalindromeIndex {
    /**
     * 
     * @param s
     * @return
     */
    public int solution(String s) {
        int start=0, end=s.length()-1;
        while (start < end && s.charAt(start) == s.charAt(end)){
            start++;
            end--;
        } // while
        if (start >= end)
            return -1; // already palindrome
        
        if (isPalindrome(s, start+1, end))
            return start;
        if (isPalindrome(s, start, end-1))
            return end;

        return -1;
    }
    private boolean isPalindrome(String str, int start, int end) {
        while (start < end && str.charAt(start) == str.charAt(end)) {
            start++;
            end --;
        } // while
        return (start >= end);
    }
}
