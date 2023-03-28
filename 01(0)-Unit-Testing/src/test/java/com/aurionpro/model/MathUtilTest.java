package com.aurionpro.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MathUtilTest {
	MathUtil obj = new MathUtil();

	@Test
	void testAddition() {

		// assertEquals(40, obj.addition(10, 20));
		assertTrue(obj.addition(10, 20) == 30);

	}

	@Test
	void testDivision() {
		assertEquals(2, obj.division(4, 2));
	}

	@Test
	void testDivision_ArithmeticException() {
		assertThrows(ArithmeticException.class, () -> obj.division(4, 0));

	}

	@Test
	void testSortArray() {
		int[] arr = { 7, 9, 1, 5, 3, 10, 2 };
		int[] expected = { 1, 2, 3, 5, 7, 9, 10 };
		assertArrayEquals(expected, obj.sortArray(arr));
	}

}
