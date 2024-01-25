package solutions.hackerrank.prepkit1week.unit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import solutions.hackerrank.prepkit1week.SimpleTextEditor;

public class SimpleTextEditorTests {
    private final SimpleTextEditor tests = new SimpleTextEditor();

    @Test
    void test1() {
        String s = "abcde";
        String[] ops = { "1 fg", "3 6", "2 5", "4", "3 7", "4", "3 4" };
        String expect = "fgd";
        String actual = tests.solution(s, ops);
        System.out.println("Actual: " + actual.toString() + " ; Expect: " + expect.toString());
        assertEquals(expect, actual);
    }
    @Test
    void test2() {
        String s = "";
        String[] ops = {"1 ewcgpjfh", "1 igqsbqyp", "1 qsdliigcj", "4", "3 15", "1 iilmgp", "2 8", "4", "2 18", "1 scwhors" };
        String expect = "y";
        String actual = tests.solution(s, ops);
        System.out.println("Actual: " + actual.toString() + " ; Expect: " + expect.toString());
        assertEquals(expect, actual);
    }
    @Test
    void test3() {
        String s = "";
        String[] ops = {"1 lchbfcjtfpsmjrqsdgci", "3 19", "1 cpcvixlm", "1 apdjgjydvpbpvyiy", "2 29", "4", "4", "3 9", "4", "4" };
        String expect = "cf";
        String actual = tests.solution(s, ops);
        System.out.println("Actual: " + actual.toString() + " ; Expect: " + expect.toString());
        assertEquals(expect, actual);
    }

}
