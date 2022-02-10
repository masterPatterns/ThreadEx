package com.learn.threadex.common;

public class CommonUtil {
	// 당일 날짜를 리턴
	public static String getDateString(String format) 
	{
		//getDateString("yyyy-MM-dd HH:mm:ss");    // 2010-09-17 20:16:27
        java.text.SimpleDateFormat formatter = new java.text.SimpleDateFormat(format, java.util.Locale.KOREA);
        return formatter.format(new java.util.Date());
	}
	
	public static String getDateString(java.util.Date d, String format) 
	{
        java.text.SimpleDateFormat formatter = new java.text.SimpleDateFormat(format, java.util.Locale.KOREA);
        return formatter.format(d);
	}
	
	// 파일명의 확장자를 축출한다.
	public static String getFileExtension(String fileName) 
	{
		String extension = null;
		try 
		{
			extension = fileName.substring(fileName.lastIndexOf('.') + 1, fileName.length()).toLowerCase();
		} catch (Exception e) {
			extension = "";
		}

		return extension;
	}
}
