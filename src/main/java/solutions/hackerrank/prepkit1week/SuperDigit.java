package solutions.hackerrank.prepkit1week;

/**
 * Problem:
 * https://www.hackerrank.com/challenges/one-week-preparation-kit-recursive-digit-sum/
 * 
 * We define super digit of an integer x using the following rules:
 * Given an integer, we need to find the super digit of the integer.
 * - If has only 1 digit, then its super digit is x.
 * - Otherwise, the super digit of x is equal to the super digit of the sum of
 * the digits of x.
 * 
 * For example, the super digit of will be calculated as:
 * super_digit(9875) 9+8+7+5 = 29
 * super_digit(29) 2 + 9 = 11
 * super_digit(11) 1 + 1 = 2
 * super_digit(2) = 2
 * 
 * Example
 * The number p is created by concatenating the string n k times so the initial
 * p=9875987598759875.
 * superDigit(p) = superDigit(9875987598759875) =
 * 9+8+7+5+9+8+7+5+9+8+7+5+9+8+7+5 = 116
 * superDigit(p) = superDigit(116) = 1+1+6 = 8
 * superDigit(p) = superDigit(8)
 * 
 * All of the digits of p sum to 116. The digits of 116 sum to 8. 8 is only one
 * digit, so it is the super digit.
 */
public class SuperDigit {
    /**
     * PSEUDO CODE video:
     * 
     * @param n
     * @param k
     * @return
     */
    public int solution(String n, int k) {
        // Calculate the super digit of the initial string
        long sDigit = 0;
        for (char c: n.toCharArray()) {
            sDigit +=  Integer.parseInt(""+c);
        } // for: c

        // Multiply the super digit by k
        sDigit *= k;
        // Calculate the super digit of the multiplied result recursively
        return digitSum(sDigit);
    }
    private int digitSum(long num) {
        // If num has only one digit, return that digit
        if (num < 10) {
            return (int) num;
        } // if
        // Otherwise, calculate the super digit of the sum of its digits
        long sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        } // while

        // Recursively call calculateSuperDigit on the sum
        return digitSum(sum);
    }
}
