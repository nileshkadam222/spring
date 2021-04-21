package com.myApp.aop.dao;

import org.springframework.stereotype.Component;

@Component
public class AccountDao {

	public void addAccount(String name) {
		System.out.println(getClass() + " : Doing my DB Work");
	}
}
