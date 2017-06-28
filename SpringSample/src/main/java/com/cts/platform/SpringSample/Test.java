package com.cts.platform.SpringSample;

import java.io.IOException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) throws IOException {
		// Resource resource=new ClassPathResource("applicationContext.xml");
		// BeanFactory factory=new XmlBeanFactory(resource);
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Student student = (Student) context.getBean("studentbean");
		student.setName("helloName");
		student.getName();
		student.displayInfo();
	
	}
}