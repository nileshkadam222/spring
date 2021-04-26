package com.myApp.aop.aspects;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MinMaxSum {

	public static void main(String[] args) {
		String s = "07:05:45PM";
		SimpleDateFormat dateformat = new SimpleDateFormat("hh:mm:ssa");
		SimpleDateFormat outDateFormat = new SimpleDateFormat("HH:mm:ss");
		try {
			Date date = dateformat.parse(s);
			System.out.println(outDateFormat.format(date));
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}

}
