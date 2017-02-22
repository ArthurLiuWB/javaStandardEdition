package com.oracle.javaStandardEdition.date;

import java.time.LocalDate;
import java.time.MonthDay;

/**
 * 
 * @type: 类
 * @author: wenbo
 * @date: 2017年2月22日下午3:08:11
 * @description: 比如说每月的帐单日，结婚纪念日，每月还款日或者是每年交保险费的日子。
 *               如果你在一家电商公司工作的话，那么肯定会有这么一个模块，会去给用户
 *               发送生日祝福并且在每一个重要的假日给他们捎去问候，比如说圣诞节，感
 *               恩节，在印度则可能是万灯节（Deepawali）。如何在Java中判断是否是
 *               某个节日或者重复事件？使用MonthDay类。这个类由月日组合，不包含年
 *               信息，也就是说你可以用它来代表每年重复出现的一些日子。
 */
public class Class_MonthDay {
	public static void main(String[] args) {
		LocalDate dateOfBirth = LocalDate.of(1989, 02, 18);
		MonthDay birthDay = MonthDay.of(dateOfBirth.getMonthValue(), dateOfBirth.getDayOfMonth());
		MonthDay currentMonthDay = MonthDay.from(LocalDate.now());
		if (birthDay.equals(currentMonthDay)) {
			System.out.println("生日快乐！");
		} else {
			System.out.println("今天不是生日！");
		}
	}
}
