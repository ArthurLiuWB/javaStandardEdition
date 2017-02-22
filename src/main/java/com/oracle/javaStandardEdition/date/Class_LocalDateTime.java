package com.oracle.javaStandardEdition.date;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

/**
 * 
 * @type: 类
 * @author: wenbo
 * @date: 2017年2月22日下午3:57:54
 * @description: Java 8不仅将日期和时间进行了分离，同时还有时区。现在已经有好几组与时区
 *               相关的类了ZonId代表的是某个特定的时区，而ZonedDateTime代表的是带时区
 *               的时间.
 */
public class Class_LocalDateTime {
	public static void main(String[] args) {
		LocalDateTime localDateTime = LocalDateTime.now();
		ZonedDateTime dateTimeInNewYork = ZonedDateTime.of(localDateTime, ZoneId.of("America/New_York"));
		System.out.println("当前时区时间：" + localDateTime + " 美国时间：" + dateTimeInNewYork);
	}
}
