package com.myApp.aop.dao;

import org.springframework.stereotype.Component;

@Component
public class AccountDao {

	public void addAccount(String name) {
		System.out.println(getClass() + " : Doing my DB Work");
	}
	
	public String findAccount(String name) {
		try {
			int i = 0/0;
			System.out.println(getClass() + " : Doing my DB Work");
			
		}catch (Exception e) {
			throw(e);
		}
		return "10000";
	}
}
