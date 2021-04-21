package com.myApp.aop.aspects;

import java.util.Arrays;

import org.aopalliance.intercept.Joinpoint;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyDemoLoggingAspect {
	@Pointcut("execution(* add*(..))")
	private void getPointCutDecl() {}
	
	//@Before("execution(public void addAccount())")
	//@Before("execution(public void updateAccount())")
	@Before("getPointCutDecl()")
	public void beforeAddAccountAdvice(JoinPoint theJoinPoint) {
		MethodSignature sig = (MethodSignature) theJoinPoint.getSignature();
		Object[] args = theJoinPoint.getArgs();
		System.out.println("============================================================= ");
		System.out.println("======>>  Executimg @Before Advice");
		Arrays.stream(args).forEach(System.out::println);
		System.out.println("======>> "+sig);
		System.out.println("============================================================= ");
		System.out.println();
		System.out.println();
		System.out.println();
		
		theJoinPoint.get
		
	}
}
