package com.myApp.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.myApp.aop.dao.AccountDao;
import com.myApp.aop.dao.MemberShipDao;

public class mainDemoApp {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext config = new AnnotationConfigApplicationContext(DemoConfig.class);
		
		AccountDao accountDao = config.getBean("accountDao",AccountDao.class);
		
		MemberShipDao memberShipDao = config.getBean("memberShipDao",MemberShipDao.class);
		
		accountDao.addAccount("Nilesh");
		
		
		
		memberShipDao.addSal();
		
		config.close();
	}

}
