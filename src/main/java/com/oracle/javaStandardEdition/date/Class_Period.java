package com.oracle.javaStandardEdition.date;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

/**
 * 
 * @type: 类
 * @author: wenbo
 * @date: 2017年2月22日下午4:20:46
 * @description: 计算两个时间点相差时间
 */
public class Class_Period {

	public static void main(String[] args) {
		LocalDate localDate = LocalDate.now();
		LocalDate dateOfBirth = LocalDate.of(1989, Month.FEBRUARY, 18);
		Period period = Period.between(dateOfBirth, localDate);
		System.out.println("距离出生多少年：" + period.getYears() +
							"\n距离出生多少月：" + period.getMonths() +
							"\n距离出生多少天：" + period.getDays());
	}

}
