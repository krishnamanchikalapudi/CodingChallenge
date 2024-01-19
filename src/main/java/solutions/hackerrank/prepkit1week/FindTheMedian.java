package solutions.hackerrank.prepkit1week;

import java.util.Comparator;
import java.util.List;
/**
 * The median of a list of numbers is essentially its middle element after sorting. The same number of elements occur after it as before. Given a list of numbers with an odd number of elements, find the median?
 * 
 * Example 1:
 * Input: arr=[5,3,1,2,4]
 * Output: Median is 3
 * 
 * Example 2:
 * Input: arr=[0,1,2,4,6,5,3]
 * Output: Median is 3
 */
public class FindTheMedian {
    public static int solution(List<Integer> arr) {
        int k = 0;
        arr.sort(Comparator.naturalOrder());
        int n = arr.size();
        if (n % 2 == 0) 
            k = (arr.get(n / 2) + arr.get(n / 2 - 1)) / 2;
        else 
            k = arr.get(n / 2);
        
        return k;
    }
}
