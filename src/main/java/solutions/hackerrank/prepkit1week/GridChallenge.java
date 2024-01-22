package solutions.hackerrank.prepkit1week;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Problem:
 * https://www.hackerrank.com/challenges/one-week-preparation-kit-grid-challenge/
 * 
 * Given a square grid of characters in the range ascii[a-z], rearrange elements
 * of each row alphabetically, ascending. Determine if the columns are also in
 * ascending alphabetical order, top to bottom. Return YES if they are or NO if
 * they are not.
 * 
 * Example:
 * grid = ['abc', 'ade', 'efg']
 * The grid is illustrated below.
 * a b c
 * a d e
 * e f g
 * The rows are already in alphabetical order. The columns a a e, b d f and c e
 * g are also in alphabetical order, so the answer would be YES. Only elements
 * within the same row can be rearranged. They cannot be moved to a different
 * row.
 * 
 * Example 2:
 * grid = ['ebacd', 'fghij', 'olmkn', 'trpqs', 'xywuv']
 * output: YES
 * Explanation
 * The x grid in the test case can be reordered to
 * a b c d e
 * f g h i j
 * k l m n o
 * p q r s t
 * u v w x y
 */
public class GridChallenge {

    public String solution(List<String> grid) {
        List<String[]> tempGrid = new ArrayList<>();
        for (String row : grid) {
            String[] sRow = row.split("");
            Arrays.sort(sRow);
            tempGrid.add(sRow);
        } // for: row

        for (int i = 0; i < tempGrid.size() - 1; i++) {
            for (int j = 0; j < tempGrid.get(0).length; j++) {
                if (tempGrid.get(i)[j].charAt(0) > tempGrid.get(i + 1)[j].charAt(0)) {
                    return "NO";
                } // if
            } // for: j
        } // for i

        return "YES";
    }
}
