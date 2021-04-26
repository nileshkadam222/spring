package com.myApp.aop.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyDemoLoggingAspect {
	@AfterThrowing(pointcut = "execution(* com.myApp.aop.dao.AccountDao.findAccount(..))",throwing = "theException")
	public void afterThrowing(JoinPoint jp,Throwable theException) {
		System.out.println("------------->>the Exception :"+ theException.getMessage());
	}
}
