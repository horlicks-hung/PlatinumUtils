package com.platinum.utils;

public class NumberUtils {
	
	public static double round(double number, int precision) {
		double power = Math.pow(10, precision);
		double tempDouble = number * power;
		Long tempRounded = Math.round(tempDouble);
		double result = tempRounded / power;
		return result;
	}
}
