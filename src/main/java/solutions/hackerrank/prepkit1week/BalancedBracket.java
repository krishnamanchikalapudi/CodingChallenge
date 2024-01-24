package solutions.hackerrank.prepkit1week;

import java.util.Stack;

/**
 * Problem:
 * https://www.hackerrank.com/challenges/one-week-preparation-kit-balanced-brackets/
 * 
 * A bracket is considered to be any one of the following characters: (, ), {,
 * }, [, or ].
 * 
 * Two brackets are considered to be a matched pair if the an opening bracket
 * (i.e., (, [, or {) occurs to the left of a closing bracket (i.e., ), ], or })
 * of the exact same type. There are three types of matched pairs of brackets:
 * [], {}, and ().
 * A matching pair of brackets is not balanced if the set of brackets it
 * encloses are not matched. For example, {[(])} is not balanced because the
 * contents in between { and } are not balanced. The pair of square brackets
 * encloses a single, unbalanced opening bracket, (, and the pair of parentheses
 * encloses a single, unbalanced closing square bracket, ].
 * 
 * By this logic, we say a sequence of brackets is balanced if the following
 * conditions are met:
 * 1. It contains no unmatched brackets.
 * 2. The subset of brackets enclosed within the confines of a matched pair of
 * brackets is also a matched pair of brackets.
 * 
 * Given strings of brackets, determine whether each sequence of brackets is
 * balanced. If a string is balanced, return YES. Otherwise, return NO.
 * Function Description
 * Complete the function isBalanced in the editor below.
 * isBalanced has the following parameter(s):
 * string s: a string of brackets
 * Returns
 * string: either YES or NO
 */
public class BalancedBracket {
    public String solution(String s) {
        Stack<Character> stack = new Stack<>();

        for (char bracket : s.toCharArray()) {
            if (bracket == '(' || bracket == '[' || bracket == '{') {
                stack.push(bracket);
            } else {
                if (stack.isEmpty()) {
                    return "NO";
                } // if

                char top = stack.pop();
                if ((bracket == ')' && top != '(') || (bracket == ']' && top != '[')
                        || (bracket == '}' && top != '{')) {
                    return "NO";
                } // if
            } // if
        } // for
        return stack.isEmpty() ? "YES" : "NO";
    }
}
