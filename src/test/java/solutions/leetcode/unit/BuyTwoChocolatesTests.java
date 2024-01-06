package solutions.leetcode.unit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import solutions.leetcode.BuyTwoChocolates;

class BuyTwoChocolatesTests {

	private final BuyTwoChocolates buyTwoChocolates = new BuyTwoChocolates();

	@Test
	void test1() {
		int[] prices = new int[] { 1, 2, 2 };
		int money = 3;

		assertEquals(0, buyTwoChocolates.solution(prices, money));

	}

	@Test
	void test2() {
		int[] prices = new int[] { 3, 2, 3 };
		int money = 3;

		assertEquals(3, buyTwoChocolates.solution(prices, money));

	}

}
