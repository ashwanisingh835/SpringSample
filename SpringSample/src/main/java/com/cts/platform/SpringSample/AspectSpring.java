package com.cts.platform.SpringSample;

import java.io.IOException;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;


@Aspect
public class AspectSpring {

	@Before("allDisplay() &&  withinCut()")
	public void LoggingAdvice(JoinPoint jp){
		System.out.println("Before the method : " +jp.getClass());
		Student s=(Student)jp.getTarget();
		System.out.println(s.getName());
	}
	
	@Before("argMethod()")
	public void LoggingAdviceToll(JoinPoint jp){
		System.out.println("Before the method for args : " +jp.getClass());
		
	}
	
	@After("args(name)")
	public void LoggingAdviceTollStringCheck(String name){
		System.out.println("Before the method for args for name: " +name);
		
	}
	
	@AfterReturning(pointcut="args(..)",returning="returnString")
	public void returnLogger(String returnString){
		System.out.println("After returning data"+returnString);
	}
	
	@AfterThrowing(pointcut="args(..)",throwing="e")
	public void exceptionThrow(IOException e){
		System.out.println("exception occured"+ e);
		
	}
	
	@Around("allGetters()")
	public void aroundMsg(ProceedingJoinPoint pjp){
		System.out.println("before call");
		try {
			pjp.proceed();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("after call");
	}
	
	@Pointcut("execution(* get*(..))")
	public void allGetters(){
		
	}
	
	@Pointcut("execution(* display*(..))")
	public void allDisplay(){
		
	}
	
	@Pointcut("within(com.cts.platform.SpringSample..*)")
	public void withinCut(){
		
	}
	
	@Pointcut("args(..)")
	public void argMethod(){
		
	}
}
