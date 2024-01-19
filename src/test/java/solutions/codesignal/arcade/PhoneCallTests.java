package solutions.codesignal.arcade;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class PhoneCallTests {
    private final PhoneCall tests = new PhoneCall();

    @Test
    void test1(){
        int actual = tests.solution(3,1,2,20);
        int expect = 14;
        System.out.println("Actual: " + actual + "; Expect: "+ expect);
        assertEquals(expect, actual);
    }
    @Test
    void test2(){
        int actual = tests.solution(2,2,1,2);
        int expect = 1;
        System.out.println("Actual: " + actual + "; Expect: "+ expect);
        assertEquals(expect, actual);
    }
    @Test
    void test3(){
        int actual = tests.solution(10,1,2,22);
        int expect = 11;
        System.out.println("Actual: " + actual + "; Expect: "+ expect);
        assertEquals(expect, actual);
    }
    @Test
    void test4(){
        int actual = tests.solution(1,2,1,6);
        int expect = 3;
        System.out.println("Actual: " + actual + "; Expect: "+ expect);
        assertEquals(expect, actual);
    }
}
