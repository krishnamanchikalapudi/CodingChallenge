package solutions.hackerrank.interview.dictionaries;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
 * Problem: https://www.hackerrank.com/challenges/frequency-queries/
 * 
 * You are given  queries. Each query is of the form two integers described below:
 * - 1 x: Insert x in your data structure.
 * - 2 y: Delete one occurence of y from your data structure, if present.
 * - 3 z : Check if any integer is present whose frequency is exactly z. If yes, print 1 else 0.
 * The queries are given in the form of a 2-D array queries of size q where queries[i][0] contains the operation, and queries[i][1] contains the data element.
 * 
 * Example 1: 
 * queries= [(1,1), (2,2), (3,2), (1,1), (1,1), (2,1), (3,2)]
 * The results of each operation are:
 * Operation -------------- Array ----- Output
 * (1,1)=(insert, 1) ------ [1]
 * (2,2)=(delete, 1) ------ [1]
 * (3,2)=(get, 2)  ------    --------- 0
 * (1,1)=(insert, 1) ------ [1,1]
 * (1,1)=(insert, 1) ------ [1,1,1]
 * (2,1)=(delete, 1) ------ [1,1]
 * (3,2)=(get, 2)  ------     --------- 1
 * Return an arra with the output: [0,1]
 * 
 * Example 2: 
 * queries= [(1,5), (1,6),(3,2),(1,10),(1,10),(1,6),(2,5), (3,2)]
 * Output: [0,1]
 * 
 * Example 3:
 * queries= [(3,4), (2,1003), (1,16), (3,1)]
 * output:  [0,1]
 * 
 * Example 4:
 * queries= [(1,3), (2,3), (3,2), (1,4), (1,5), (1,5), (1,4), (3,2), (2,4), (3,2)]
 * output:  [0,1,1]
 */
public class FrequencyQuery {
    /**
     * PSEUDO CODE video:
     * 
     * @param queries
     * @return
     */
    public List<Integer> solution(List<List<Integer>> queries) {
        List<Integer> result = new ArrayList<>();
        Map<Integer, Integer> dataMap = new HashMap<>();
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        for (List<Integer> query : queries) {
            int operation = query.get(0);
            int element = query.get(1);

            switch (operation) {
                case 1:
                    int currentFrequency = dataMap.getOrDefault(element, 0);
                    dataMap.put(element, currentFrequency + 1);

                    frequencyMap.put(currentFrequency, frequencyMap.getOrDefault(currentFrequency, 0) - 1);
                    frequencyMap.put(currentFrequency + 1, frequencyMap.getOrDefault(currentFrequency + 1, 0) + 1);
                    break;

                case 2:
                    int currentFreq = dataMap.getOrDefault(element, 0);
                    if (currentFreq > 0) {
                        dataMap.put(element, currentFreq - 1);

                        frequencyMap.put(currentFreq, frequencyMap.getOrDefault(currentFreq, 0) - 1);
                        frequencyMap.put(currentFreq - 1, frequencyMap.getOrDefault(currentFreq - 1, 0) + 1);
                    }
                    break;

                case 3:
                    if (frequencyMap.containsKey(element) && frequencyMap.get(element) > 0) {
                        result.add(1);
                    } else {
                        result.add(0);
                    }
                    break;
            }
        }

        return result;
    }
    public List<Integer> solution1(List<List<Integer>> queries) {
        List<Integer> result = new ArrayList<>();
        Map<Integer, Integer> dataMap = new HashMap<>();
        Map<Integer, Integer> freqMap = new HashMap<>();

        for (int i=0; i<queries.size(); i++) {
            int operation = queries.get(i).get(0);
            int data = queries.get(i).get(1);
            switch (operation) {
                case 1: // insert
                    dataMap.put(data, dataMap.getOrDefault(data, 0)+1);
                    break;
                case 2: // delete
                    if (dataMap.getOrDefault(data, 0) >0)
                        dataMap.put(data, dataMap.getOrDefault(data, 0)-1);
                    break;
                case 3: // get
                    if (dataMap.containsKey(data))
                        result.add(1);
                    else
                        result.add(0);
                    break;
            }

        } // for: i

        return result;
    }
}
