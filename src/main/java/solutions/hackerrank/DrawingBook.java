package solutions.hackerrank;

/**
 * Problem: https://www.hackerrank.com/challenges/drawing-book/
 * 
 */
public class DrawingBook {
    public int solution(int numOfPagesInBook, int pageNumToTurn) {
        int fromStart = pageNumToTurn/2;
        int fromEnd = (numOfPagesInBook/2) - fromStart;

        return Math.min(fromStart, fromEnd);
    }
}
