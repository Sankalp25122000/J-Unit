package com.aurionpro.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StringUtilTest {
	StringUtil su = new StringUtil();
	 @Test
	void test_AreFirstTwoAndLastTwoSame() {
		System.out.println(su.areFirstAndLastTwoCharactersTheSame("ASDAS"));
		assertEquals("true", su.areFirstAndLastTwoCharactersTheSame("ASDAS"));
		
		
	}

	@Test
	void test_truncateAInFirst2Position() {
		System.out.println(su.truncateAInFirst2Position("AASD"));
		assertEquals("SD", su.truncateAInFirst2Position("AASD"));
	}

}
