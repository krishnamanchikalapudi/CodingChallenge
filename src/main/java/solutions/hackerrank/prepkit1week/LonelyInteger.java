package solutions.hackerrank.prepkit1week;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/**
 * Problem: https://www.hackerrank.com/challenges/one-week-preparation-kit-lonely-integer/
 * 
 * Given an array of integers, where all elements but one occur twice, find the unique element.
 * 
 * Example
 * a = [1,2,3,4,3,2,1]
 * The unique element is 4.
 */
public class LonelyInteger {
    /**
     * PSEUDO CODE video:
     * 
     * @param a
     * @return
     */
    public int solution(List<Integer> nums) {
        int k=0;
        for (int num: nums) {
            k =  (k ^ num);  // ^ bitwise exclusive OR: https://docs.oracle.com/javase/tutorial/java/nutsandbolts/operators.html
        } // for num
        return k;
    }
    public int solution1(List<Integer> nums) {
        Map<Integer, Integer> aMap = new HashMap<>();
        for (int num: nums)
            aMap.put(num, aMap.getOrDefault(num, 0)+1);

        int k=0;
        for(Map.Entry<Integer,Integer> eSet: aMap.entrySet()) {
            int key = eSet.getKey(), val=eSet.getValue();
            if (val == 1) {
                k = key;
                break;
            } // if
        } // for
        return k;
    }
}
