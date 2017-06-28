package com.cts.platform.SpringSample;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
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
	
	@AfterReturning("args(..)")
	public void returnLogger(){
		System.out.println();
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
