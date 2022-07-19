package com.utils;

public class MathUtil {
	public static String getTwoDecimal(double num) {
		return new java.text.DecimalFormat("#0.00").format(num);
	}
}
