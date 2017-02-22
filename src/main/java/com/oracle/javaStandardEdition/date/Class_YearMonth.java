package com.oracle.javaStandardEdition.date;

import java.time.YearMonth;
/**
 * 
 * @type: 类
 * @author: wenbo
 * @date: 2017年2月22日下午4:12:55
 * @description: 这个类主要用来计算当月有几天
 */
public class Class_YearMonth {

	public static void main(String[] args) {
		YearMonth yearMonth = YearMonth.now();
		int daysOfCurrentMonth = yearMonth.lengthOfMonth();
		System.out.println("这个月有几天：" + daysOfCurrentMonth);
	}

}
