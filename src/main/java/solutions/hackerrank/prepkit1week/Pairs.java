package solutions.hackerrank.prepkit1week;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Given an array of integers and a target value, determine the number of pairs of array elements that have a difference equal to the target value
 * 
 * Example:
 * k=1, arr=[1,2,3,4]
 * There are three values that differ by k=1: 2-1= 1, 3-2= 1, 4-3 = 1. Return 3
 * 
 * Example 2:
 * k=2, arr=[1,5,3,4,2] 
 * There are 3 values that differ by k=2: 3-1=2, 4-2=2, 5-3=2. Return 3 
 */
public class Pairs {
    /**
     * 
     * @param k
     * @param arr
     * @return
     */
    public int solution(int k, List<Integer> arr) {
        int count=0;
        arr.sort(Comparator.naturalOrder());
        Set<Integer> set = new HashSet<>();
        for(int i=0; i<arr.size(); i++) {
            set.add(arr.get(i));
            if(set.contains(arr.get(i)-k)) {
                count++;
            } // if
        } // for
        return count;
    }
    public int solution1(int k, List<Integer> arr) {
        System.out.println("k="+k +"\n"+ Arrays.toString(arr.toArray()));
        arr.sort(Comparator.naturalOrder());
        int count=0;
        for (int num:arr) {
            int idx = Arrays.binarySearch(arr.toArray(), num-k);
            if (idx>=0) {
                count++;
            }
        }// for
        return count;
    }
}
