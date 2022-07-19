package com.utils;

import java.util.UUID;

public  class SysUtil {
	public static String getUUID() {
		return UUID.randomUUID().toString().replaceAll("\\-", "");
	}
}
