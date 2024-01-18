package solutions.codesignal.prescreen.unit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import solutions.codesignal.prescreen.NewHashMap;

public class NewHashMapTests {
    private final NewHashMap tests = new NewHashMap();

    @Test
    void test1() {
        String[] queryType = new String[] { "insert", "insert", "addToValue", "addToKey", "get" };
        int[][] query = new int[][] { { 1, 2 }, { 2, 3 }, { 2 }, { 1 }, { 3 } };
        long actual = tests.solution(queryType, query);
        long expect = 5;
        System.out.println("Actual: " + actual + "  Expected: " + expect);
        assertEquals(expect, actual);
    }

    @Test
    void test2() {
        String[] queryType = new String[] { "insert",
                "addToValue",
                "get",
                "insert",
                "addToKey",
                "addToValue",
                "get" };
        int[][] query = new int[][] { { 1, 2 },
                { 2 },
                { 1 },
                { 2, 3 },
                { 1 },
                { -1 },
                { 3 } };
                long actual = tests.solution(queryType, query);
                long expect = 6;
        System.out.println("Actual: " + actual + "  Expected: " + expect);
        assertEquals(expect, actual);
    }

    @Test
    void test3() {
        String[] queryType = new String[] { "addToKey",
                "addToKey",
                "insert",
                "addToValue",
                "addToValue",
                "get",
                "addToKey",
                "insert",
                "addToKey",
                "addToValue" };
        int[][] query = new int[][] { { -3 },
                { -1 },
                { 0, -3 },
                { 3 },
                { -1 },
                { 0 },
                { -1 },
                { -4, -5 },
                { -1 },
                { -4 } };
                long actual = tests.solution(queryType, query);
                long expect = -1;
        System.out.println("Actual: " + actual + "  Expected: " + expect);
        assertEquals(expect, actual);
    }

    @Test
    void test4() {
        String[] queryType = new String[] { "insert",
                "insert",
                "addToKey",
                "addToKey",
                "addToKey",
                "insert",
                "addToValue",
                "addToKey",
                "addToKey",
                "get" };
        int[][] query = new int[][] { { -5, -2 },
                { 2, 4 },
                { -1 },
                { -3 },
                { 1 },
                { 3, -2 },
                { -4 },
                { -2 },
                { 2 },
                { -8 } };
                long actual = tests.solution(queryType, query);
                long expect = -6;
        System.out.println("Actual: " + actual + "  Expected: " + expect);
        assertEquals(expect, actual);
    }

    @Test
    void test5() {
        String[] queryType = new String[] { "insert",
                "get",
                "insert",
                "addToValue",
                "addToValue",
                "addToValue",
                "insert",
                "addToKey",
                "get",
                "insert" };
        int[][] query = new int[][] { { 2, 1 },
                { 2 },
                { 1, 3 },
                { -1 },
                { 0 },
                { 3 },
                { 4, -5 },
                { 3 },
                { 4 },
                { 1, 1 } };
                long actual = tests.solution(queryType, query);
                long expect = 6;
        System.out.println("Actual: " + actual + "  Expected: " + expect);
        assertEquals(expect, actual);
    }

    @Test
    void test6() {
        String[] queryType = new String[] { "addToValue",
                "addToValue",
                "insert",
                "get",
                "addToKey",
                "insert",
                "insert",
                "insert",
                "addToValue",
                "addToKey" };
        int[][] query = new int[][] { { -5 },
                { 3 },
                { 3, -3 },
                { 3 },
                { 0 },
                { -4, 2 },
                { 0, -3 },
                { -2, 4 },
                { 2 },
                { 2 } };
                long actual = tests.solution(queryType, query);
                long expect = -3;
        System.out.println("Actual: " + actual + "  Expected: " + expect);
        assertEquals(expect, actual);
    }

}
