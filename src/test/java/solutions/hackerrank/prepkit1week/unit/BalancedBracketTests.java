package solutions.hackerrank.prepkit1week.unit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import solutions.hackerrank.prepkit1week.BalancedBracket;

public class BalancedBracketTests {
    private final BalancedBracket tests = new BalancedBracket();

    @Test
    void test1() {
        String actual = tests.solution("{[()]}");
        String expect = "YES";
        System.out.println("Actual: "+ actual +"; Expect: "+ expect);
        assertEquals(expect, actual);
    }
    @Test
    void test2() {
        String actual = tests.solution("{[(])}");
        String expect = "NO";
        System.out.println("Actual: "+ actual +"; Expect: "+ expect);
        assertEquals(expect, actual);
    }
    @Test
    void test3() {
        String actual = tests.solution("{{[[(())]]}}");
        String expect = "YES";
        System.out.println("Actual: "+ actual +"; Expect: "+ expect);
        assertEquals(expect, actual);
    }
    @Test
    void test4() {
        String actual = tests.solution("{{([])}}");
        String expect = "YES";
        System.out.println("Actual: "+ actual +"; Expect: "+ expect);
        assertEquals(expect, actual);
    }
    @Test
    void test5() {
        String actual = tests.solution("{{)[](}}");
        String expect = "NO";
        System.out.println("Actual: "+ actual +"; Expect: "+ expect);
        assertEquals(expect, actual);
    }

    @Test
    void test6() {
        String actual = tests.solution("{(([])[])[]]}");
        String expect = "NO";
        System.out.println("Actual: "+ actual +"; Expect: "+ expect);
        assertEquals(expect, actual);
    }

    @Test
    void test7() {
        String actual = tests.solution("{(([])[])[]}[]");
        String expect = "YES";
        System.out.println("Actual: "+ actual +"; Expect: "+ expect);
        assertEquals(expect, actual);
    }
}
