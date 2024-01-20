package solutions.hackerrank.prepkit1week;

import java.util.ArrayList;
import java.util.List;

/**
 * Problem:
 * https://www.hackerrank.com/challenges/one-week-preparation-kit-plus-minus/
 * 
 * Given an array of integers, calculate the ratios of its elements that are
 * positive, negative, and zero. Print the
 * decimal value of each fraction on a new line with places after the decimal.
 * 
 * Example 1:
 * Input: [1, 1, 0, -1, -1]
 * Output:
 * size: 5
 * two +ve's = 2/5 = 0.4
 * two -ve's = 2/5 = 0.4
 * one 0 = 1/5 = 0.2
 * 
 * Example 2:
 * Input: [-4, 3, -9, 0, 4, 1]
 * Output:
 * size: 6
 * two +ve's = 3/6 = 0.5
 * two -ve's = 2/6 = 0.3333
 * one 0 = 1/6 = 0.16667
 */
public class PlusMinus {
    /**
     * PSEUDO CODE video:
     * 
     * @param arr
     * @return
     */
    public List<String> solution(List<Integer> arr) {
        List<String> rtn = new ArrayList<String>();
        double pCount = 0, nCount = 0, zCount = 0;
        int n = arr.size();
        for (int num : arr) {
            if (num > 0)
                pCount++;
            else if (num == 0)
                zCount++;
            else
                nCount++;
        } // for
        rtn.add(String.format("%.6f", (pCount / n)));
        rtn.add(String.format("%.6f", (nCount / n)));
        rtn.add(String.format("%.6f", (zCount / n)));

        return rtn;
    }
}
