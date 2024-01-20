package solutions.hackerrank.prepkit1week;

import java.util.Arrays;
import java.util.List;
/**
 * Sean invented a game involving a 2n x 2n matrix where each cell of the matrix contains an integer. He can reverse any of its rows or columns any number of times. The goal of the game is to maximize the sum of the elements in the n x n submatrix located in the upper-left quadrant of the matrix.
 * Given the initial configurations for q matrices, help sean reverse the rows and columns of each matrix in the best possible way so that the sum of the elements in the matrix's upper-left quadrant is maximal.
 * 
 * Example:
 * matrix = [[112, 42, 83, 119],[56, 125, 56, 49], [15, 78, 101, 43], [62, 98, 114, 108]]
 * output: 414.
 * Explanation:
 * 1. Start out with the following 2n x 2n matrix:
 *  112 42 83 119
 *  56 125 56 49
 *  15 78 101 43
 *  62 98 114 108
 * Perform the following operations to maximize the sum of the n x n submatrix in the upper-left quadrant.
 * 2. Reverse column 2([83, 56, 101, 114] -> [114, 101, 56, 83]), resulting in the matrix:
 *  112 42 114 119
 *  56 125 101 49
 *  15 78  56 43
 *  62 98  83 108
 * 3. Rever row 0([112, 42, 114, 119] -> [119, 114, 42, 112]), resulting in the matrix:
 *  119 114 42 112
 *  56 125 101 49
 *  15 78 56 43
 *  62 98 83 108
 * 
 * The sum of values in the nxn submatrix in the upper-left quadrant is 
 * 119 + 114 + 56 + 125 = 414.
 */
public class FlippingTheMatrix {
    /**
     * PSEUDO CODE video:
     * 
     * @param matrix
     * @return
     */
    public int solution(List<List<Integer>> matrix) {
        int sum=0;
        int maxI = matrix.size();
        int maxIpossible = maxI - 1;
        int maxJ = matrix.get(0).size();
        int maxJpossible = maxJ - 1;
        
        for (int i=0; i< maxI/2; i++) {
            for (int j=0; j<maxJ/2; j++) {
                sum += Math.max( 
                    Math.max(matrix.get(i).get(j), matrix.get(maxIpossible - i).get(j)),
                    Math.max(matrix.get(maxIpossible - i).get(maxJpossible - j), matrix.get(i).get(maxJpossible-j) )
                );
            } // for: j
        } // for: i

        return sum;
    }
}
