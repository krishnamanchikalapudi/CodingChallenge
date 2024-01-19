package solutions.codesignal.arcade;
/**
 * Problem: 
 * 
 * Some phone usage rate may be described as follows:
 * 1. first minute of a call costs min1 cents,
 * 2. each minute from the 2nd up to 10th (inclusive) costs min2_10 cents
 * 3. each minute after 10th costs min11 cents.
 * You have s cents on your account before the call. What is the duration of the longest call (in minutes rounded down to the nearest integer) you can have?
 * 
 * Example 1:
 * For min1 = 3, min2_10 = 1, min11 = 2, and s = 20, the output should be solution(min1, min2_10, min11, s) = 14.
 * Here's why:
 * 1. the first minute costs 3 cents, which leaves you with 20 - 3 = 17 cents;
 * 2. the total cost of minutes 2 through 10 is 1 * 9 = 9, so you can talk 9 more minutes and still have 17 - 9 = 8 cents;
 * 3. each next minute costs 2 cents, which means that you can talk 8 / 2 = 4 more minutes.
 * Thus, the longest call you can make is 1 + 9 + 4 = 14 minutes long.
 * 
 * Example 2:
 * For min1 = 2, min2_10 = 2, min11 = 1, and s = 2, the output should be solution(min1, min2_10, min11, s) = 1.
 * 
 * Example 3:
 * For min1 = 2, min2_10 = 2, min11 = 1, and s = 24, the output should be solution(min1, min2_10, min11, s) = 14.
 * 
 * Example 4: 
 * For min1 = 1, min2_10 = 2, min11 = 1, and s = 6, the output should be solution(min1, min2_10, min11, s) = 3.
 */
public class PhoneCall {
    public int solution (int min1, int min2_10, int min11, int s) {
        int longestCall = 0;
        // call: 1st min
        if (s>= min1) {
            longestCall++;
            s -= min1;
        } // if
        // call: min 2 - 10
        boolean noEnoughFunds = false;
        for (int i=2; i<=10; i++) {
            if (s >= min2_10) {
                longestCall++;
                s -= min2_10;
            } else {
                noEnoughFunds = true;
                break;
            }// if
        } // for
        // call: min 10+
        if (!noEnoughFunds) {
            while (s >= min11) {
                longestCall++;
                s -= min11;
            } // while
        } // if
        return longestCall;
    }
}
