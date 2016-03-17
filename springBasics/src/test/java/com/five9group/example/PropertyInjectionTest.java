package com.five9group.example;

import org.springframework.context.support.FileSystemXmlApplicationContext;

public class PropertyInjectionTest {

	public static void main(String args[]){
		
		FileSystemXmlApplicationContext  context = new FileSystemXmlApplicationContext("bean.xml");
		PropertyInjection propertyInjection = (PropertyInjection) context.getBean("propertyInjection");
		propertyInjection.printName();
		context.close();
	}
}
