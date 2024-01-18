package solutions.leetcode.interview.top150q;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class MajorityElement {
    /**
     * PSEUDO CODE video:
     * @param nums
     * @return
     */
    public int solution(int[] nums) {
        int k=0;
        Map<Integer, Integer> numMap = new HashMap();
        for (int i=0; i<nums.length; i++) {
            numMap.put(nums[i], numMap.getOrDefault(nums[i], 0)+1);
        } // for

        int k_val=0;
        Iterator<Entry<Integer, Integer>> iter = numMap.entrySet().iterator();
        while (iter.hasNext()){
            Map.Entry<Integer, Integer> iMap = iter.next();
            int ceil = (int) Math.ceil( (iMap.getValue() * 2)/  nums.length);
            if (ceil > k_val) {
                k = iMap.getKey();
                k_val = ceil;
            } // if
        } // while

        return k;
    }
}
