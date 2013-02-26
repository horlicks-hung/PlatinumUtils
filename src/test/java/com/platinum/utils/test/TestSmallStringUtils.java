package com.platinum.utils.test;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.platinum.utils.SmallStringUtils;

public class TestSmallStringUtils {

	@Test
	public void test半形轉全形() {
		String original = "台北市abc街11號";
		String expected = "台北市ａｂｃ街１１號";
		String result = SmallStringUtils.半形轉全形(original);
		assertTrue(expected.equals(result));
	}
}
