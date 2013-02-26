package com.platinum.utils;

public class SmallStringUtils {
	
	public static String 半形轉全形(String string) {
		String result = null;
		if (string == null) {
			return result;
		}
		
		StringBuffer resultBuffer = new StringBuffer();
		for (int i = 0; i < string.length(); i++) {
			char c = string.charAt(i);
			if (! isDoubleByte(c)) {
				c = (char) (c + 65248);
			}
			resultBuffer.append(c);
		}
		result = resultBuffer.toString();
		return result;
	}
	
	public static boolean isDoubleByte(String string) {
		boolean result = false;
		result = string.matches("[^\\x00-\\xff]");
		return result;
	}
	
	public static boolean isDoubleByte(Character aChar) {
		boolean result = false;
		String string = String.valueOf(aChar);
		result = isDoubleByte(string);
		return result;
	}

}
