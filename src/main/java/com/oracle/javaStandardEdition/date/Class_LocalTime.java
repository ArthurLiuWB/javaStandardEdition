package com.oracle.javaStandardEdition.date;

import java.time.LocalTime;

public class Class_LocalTime {

	public static void main(String[] args) {
		//获取当前时间
		LocalTime currentTime = LocalTime.now();
		//获取两小时后的时间
		LocalTime newTime = currentTime.plusHours(2);
		System.out.println("当前时间为：" + currentTime + " 2小时后的时间：" + newTime);

	}

}
