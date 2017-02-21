package com.oracle.javaStandardEdition.date;
import java.time.LocalDate;

public class New_LocalDate {
	public static void main(String[] args) {
		//获取当前日期
		LocalDate today = LocalDate.now();
		System.out.println(today);
		//根据年月日取
		LocalDate chrismas = LocalDate.of(2017, 12, 25);
		System.out.println(chrismas);
		//根据字符串取
		LocalDate moonCakeFestival = LocalDate.parse("2017-08-15");
		System.out.println(moonCakeFestival);
	}
}
