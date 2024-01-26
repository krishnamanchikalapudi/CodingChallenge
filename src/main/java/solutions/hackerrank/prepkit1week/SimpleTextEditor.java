package solutions.hackerrank.prepkit1week;

import java.util.Stack;

/**
 * Problem: https://www.hackerrank.com/challenges/one-week-preparation-kit-simple-text-editor/
 * 
 * Implement a simple text editor. The editor initially contains an empty string, S. Perform Q operations of the following 4 types:
 * 1. append (W)- Append string W to the end of S.
 * 2. delete (k) - Delete the last k characters of S.
 * 3. print(k) - Print the k-th character of S.
 * 4. undo() - Undo the last (not previously undone) operation of type 1 or 2, reverting S to the state it was in prior to that operation.
 * 
 * Example
 * S='abcde'
 * ops=['1 fg', '3 6', '2 5', '4', '3 7', '4', '3 4']
 * operation
 * index   S       ops[index]  explanation
 * -----   ------  ----------  -----------
 * 0       abcde   1 fg        append fg
 * 1       abcdefg 3 6         print the 6th letter - f
 * 2       abcdefg 2 5         delete the last 5 letters
 * 3       ab      4           undo the last operation, index 2
 * 4       abcdefg 3 7         print the 7th characgter - g
 * 5       abcdefg 4           undo the last operation, index 0
 * 6       abcde   3 4         print the 4th character - d
 * 
 * The results should be printed as:
 * f
 * g
 * d
 */
public class SimpleTextEditor {
    /**
     * PSEUDO CODE video:
     * 
     * @param s
     * @param ops
     * @return
     */
    public String solution(String s, String[] ops) {
        String result="";

        Stack<String> myStack = new Stack<>();
        for (String op: ops) {
            String[] opsSplit = op.split(" ");
            System.out.println("Ops Split:: "+ ops.toString());
            int opKey = Integer.parseInt(opsSplit[0]);
            switch (opKey) {
                case 1: // Append string W to the end of S. '1 fg'
                    myStack.push(s);
                    s += opsSplit[1];
                    break;
                case 2: // Delete the last k characters of S. '2 5'
                    int dk = Integer.parseInt(opsSplit[1]);
                    myStack.push(s);
                    s = s.substring(0, s.length()-dk);
                    break;
                case 3: // Print the k-th character of S.  '3 6'
                    int pk = Integer.parseInt(opsSplit[1]);
                    char ps = s.charAt(pk-1);
                    System.out.println(ps);
                    result += (""+ps);
                    break;
                case 4: // Undo the last (not previously undone) operation of type 1 or 2. '4'
                    s= myStack.pop();
                    break;
            }
        } // for
        return result;
    }
}
