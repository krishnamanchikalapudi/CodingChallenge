package solutions.hackerrank.interview.dictionaries.unit;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

import solutions.hackerrank.interview.dictionaries.CheckMagazine;
public class CheckMagazineTests {
    private final CheckMagazine tests = new CheckMagazine();

    @Test
	void test1() {
        List<String> magazine=Arrays.asList("give","me","one","grand","today","night");
        List<String> note = Arrays.asList("give", "one", "grand", "today");
        String actual = tests.solution(magazine, note);
        String expect="Yes";
        System.out.println("Actual: " + actual + "  Expected: " + expect);
        assertEquals(expect, actual);
    }
    @Test
	void test2() {
        List<String> magazine=Arrays.asList("two","times","three","is","not","four");
        List<String> note = Arrays.asList("two","times","two","is","four");
        String actual = tests.solution(magazine, note);
        String expect="No";
        System.out.println("Actual: " + actual + "  Expected: " + expect);
        assertEquals(expect, actual);
    }
    @Test
	void test3() {
        List<String> magazine=Arrays.asList("ive", "got", "a", "lovely", "bunch", "of", "coconuts");
        List<String> note = Arrays.asList("ive", "got", "some", "coconuts");
        String actual = tests.solution(magazine, note);
        String expect="No";
        System.out.println("Actual: " + actual + "  Expected: " + expect);
        assertEquals(expect, actual);
    }
    @Test
	void test4() {
        List<String> magazine=Arrays.asList("Solved", "Hacker", "Rank", "problem");
        List<String> note = Arrays.asList("Solved");
        String actual = tests.solution(magazine, note);
        String expect="Yes";
        System.out.println("Actual: " + actual + "  Expected: " + expect);
        assertEquals(expect, actual);
    }
}
