package solutions.hackerrank.prepkit1week.unit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import solutions.hackerrank.prepkit1week.TowerBreakers;

public class TowerBreakersTests {
    private final TowerBreakers tests = new TowerBreakers();

    @Test
    void test1() {
        int actual = tests.solution(2, 2);
        int expect = 2;
        System.out.println("Actual: "+ actual +" ; Expect: "+ expect);
        assertEquals(expect, actual);
    }

    @Test
    void test2() {
        int actual = tests.solution(1, 4);
        int expect = 1;
        System.out.println("Actual: "+ actual +" ; Expect: "+ expect);
        assertEquals(expect, actual);
    }
    @Test
    void test3() {
        int actual = tests.solution(1, 7);
        int expect = 1;
        System.out.println("Actual: "+ actual +" ; Expect: "+ expect);
        assertEquals(expect, actual);
    }
    @Test
    void test4() {
        int actual = tests.solution(3, 7);
        int expect = 1;
        System.out.println("Actual: "+ actual +" ; Expect: "+ expect);
        assertEquals(expect, actual);
    }
    @Test
    void test5() {
        int actual = tests.solution(877571, 322624);
        int expect = 1;
        System.out.println("Actual: "+ actual +" ; Expect: "+ expect);
        assertEquals(expect, actual);
    }
    @Test
    void test6() {
        int actual = tests.solution(702643, 709071);
        int expect = 1;
        System.out.println("Actual: "+ actual +" ; Expect: "+ expect);
        assertEquals(expect, actual);
    }
    @Test
    void test7() {
        int actual = tests.solution(89206, 886817);
        int expect = 2;
        System.out.println("Actual: "+ actual +" ; Expect: "+ expect);
        assertEquals(expect, actual);
    }
}
