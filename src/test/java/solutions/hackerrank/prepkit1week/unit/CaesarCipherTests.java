package solutions.hackerrank.prepkit1week.unit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import solutions.hackerrank.prepkit1week.CaesarCipher;

public class CaesarCipherTests {
    private final CaesarCipher tests = new CaesarCipher();
   
    @Test
    void test1() {
        String actual = tests.solution("There's-a-starman-waiting-in-the-sky", 3);
        String expect="Wkhuh'v-d-vwdupdq-zdlwlqj-lq-wkh-vnb";
        System.out.println(" Actual: "+ actual +"\n Expect: "+ expect);
        assertEquals(expect, actual);
    }
    @Test
    void test2() {
        String actual = tests.solution("middle-Outz", 2);
        String expect="okffng-Qwvb";
        System.out.println(" Actual: "+ actual +"\n Expect: "+ expect);
        assertEquals(expect, actual);
    }
    @Test
    void test3() {
        String actual = tests.solution("Always-Look-on-the-Bright-Side-of-Life", 5);
        String expect="Fqbfdx-Qttp-ts-ymj-Gwnlmy-Xnij-tk-Qnkj";
        System.out.println(" Actual: "+ actual +"\n Expect: "+ expect);
        assertEquals(expect, actual);
    }
}
