package com.myApp.aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyDemoLoggingAspect {
	@Pointcut("execution(* add*(..))")
	private void getPointCutDecl() {}
	
	//@Before("execution(public void addAccount())")
	//@Before("execution(public void updateAccount())")
	@Before("getPointCutDecl()")
	public void beforeAddAccountAdvice() {
		System.out.println("======>>  Executimg @Before Advice");
	}
}
