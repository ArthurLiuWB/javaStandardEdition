package com.oracle.javaStandardEdition.date;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
 * 
 * @type: 类
 * @author: wenbo
 * @date: 2017年2月22日下午3:07:23
 * @description: 主要介绍LocalDate类的常用方法
 */
public class Class_LocalDate {
	public static void main(String[] args) {

		// 获取当前日期
		LocalDate today = LocalDate.now();
		System.out.println(today);

		// 获取当前日期的 年、月、日
		int year = today.getYear();
		int month = today.getMonthValue();
		int day = today.getDayOfMonth();
		System.out.println("年：" + year + " 月：" + month + " 日：" + day);

		// 获取特定日期，例如：生日
		LocalDate moonCakeFestival = LocalDate.parse("2017-08-15");
		LocalDate dateOfBirth = LocalDate.of(1989, 02, 18);
		System.out.println("中秋节：" + moonCakeFestival + " 生日：" + dateOfBirth);

		// 比较两个日期是否相等
		LocalDate localDate1 = LocalDate.parse("2017-02-22");
		if (localDate1.equals(today)) {
			System.out.println("是今天");
		}
		
		// 获取1周后的日期， plus()方法可以用来增加日，星期，或者月，ChronoUnit则用来表示这个时间单位。
		LocalDate nextWeek = today.plus(1, ChronoUnit.WEEKS);
		LocalDate nextMonth = today.plus(30, ChronoUnit.DAYS);
		LocalDate lastYear = today.minus(1, ChronoUnit.YEARS);
		System.out.println("当前日期：" + today + "\n一个礼拜后的日期" + nextWeek + "\n一个月后的日期：" + nextMonth + "\n一年之前的日期：" + lastYear);
		
		// 比较给定日期在当天之前？之后？还是相等
		LocalDate lastDay = today.minus(1, ChronoUnit.DAYS);
		if ( lastDay.isBefore(today) ) {
			System.out.println("在今天之前！");
		} else if ( lastDay.isAfter(today)) {
			System.out.println("在今天之后！");
		} else {
			System.out.println("就是今天！");
		}
		
		// 计算是否为闰年
		if (today.isLeapYear()) {
			System.out.println("是闰年！");
		} {
			System.out.println("不是闰年！");
		}
	}
}
