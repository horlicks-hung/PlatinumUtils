package com.platinum.utils.test;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.platinum.utils.NumberUtils;

public class TestNumberUtils {

	@Test
	public void testRound_1() {
		double result = NumberUtils.round(100.123, 2);
		double expected = 100.12;
		assertTrue(result == expected);
	}

	@Test
	public void testRound_2() {
		double result = NumberUtils.round(100.125, 2);
		double expected = 100.13;
		assertTrue(result == expected);
	}

}
