package com.utils;

import java.text.SimpleDateFormat;
import java.util.Date;


public class DateUtil {


	/**
	 * 得到现在的时间
	 */
	public static String getCurrentTime() {
		Date d = new Date();
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		return dateFormat.format(d);
	}
	
	public static String getDate(String format) {
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		return sdf.format(new Date());
	}
	/**
	 * 根据long类型返回格式化的时间
	 */
	public static String getFormatDate(long date){
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		return sdf.format(new Date(date));
	}
	
}
