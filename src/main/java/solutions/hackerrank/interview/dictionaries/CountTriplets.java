package solutions.hackerrank.interview.dictionaries;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Problem: https://www.hackerrank.com/challenges/count-triplets-1/
 * 
 * You are given an array and you need to find number of tripets of indices (i, j, k) such that the elements at those indices are in geometric progression for a given common ratio r and i<j<k.
 * 
 * Example:
 * arr: [1,4,15,64], r=4
 * There are [1,4,16] and [4,16,64] at indices (0,1,2) and (1,2,3). Return 2.
 * 
 * Example 1:
 * Input: arr= [1,2,2,4], r=2
 * Output: 2
 * Explanation: There are 2 triplets in satisfying our criteria, whose indices are (0,1,3) = [1, 2,4] and (0,2,3)=[1,2,4]
 * 
 * Example 2:
 * Input: arr=[1, 3, 9, 9, 27, 81], r=3
 * Output: 6
 * Explanation: (0,1,2)=[1, 3, 9], (0,1,3)=[1,3,9], (1,2,4)=[2,9,27], (1,3,4)=[2,9,27], (2,4,5)=[9,27,81], (3,4,5)=[9,27,81]
 * 
 * Example 3:
 * Input: arr=[1, 5, 5, 25, 125], r=5
 * Output: 4
 * Explanation: (0,1,3)=[1,5,25], (0,2,3)=[1,5,25], (1,3,4)=[5,25,125], (2,3,4)=[5,25,125]
 */
public class CountTriplets {
    /**
     * PSEUDO CODE video:
     * 
     * @param arr
     * @param r
     * @return
     */
    public long solution(List<Long> arr, long r) {
        long count=0;
        Map<Long, Long> countMap = new HashMap<>();
        Map<Long, Long> potentialMap = new HashMap<>();
        for (long num: arr) {
            if (countMap.containsKey(num)) {
                count += countMap.get(num);
            } // if
            if (potentialMap.containsKey(num)) {
                countMap.put(num*r, countMap.getOrDefault(num*r, 0L)+potentialMap.get(num));
            } // if
            potentialMap.put(num*r, potentialMap.getOrDefault(num * r, 0L) + 1);
        } // for

        return count;
    }
    public long solution1(List<Long> arr, long r) {
        int n = arr.size();
        long count=0;
        for (int i=0; i<n; i++) {
            for (int j=0; j<i; j++) {
                if (arr.get(j) == arr.get(i)/r) {
                    for (int k= i+1; k<n; k++) {
                        if (arr.get(k)/r == arr.get(i)){
                            count++;
                        } // if
                    } // for: k
                } // if
            } // for: j
        } // for: i

        return count;
    }
}
