package com.cts.platform.SpringSample;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.EnableAspectJAutoProxy;


@Aspect
@EnableAspectJAutoProxy
public class AspectSpring {

	@Before("execution(public void displayInfo())")
	public void LoggingAdvice(){
		System.out.println("Before the method");
	}
}
