package com.myApp.aop.dao;

import org.springframework.stereotype.Component;

@Component
public class MemberShipDao {

	public void addSal() {
		System.out.println(getClass() + " : Doing my DB Work");
	}
}
