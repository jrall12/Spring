package com.five9group.example;

import org.springframework.context.support.FileSystemXmlApplicationContext;

public class TestingHelloWorld {

	public static void main(String args[]){
		FileSystemXmlApplicationContext  context = new FileSystemXmlApplicationContext("bean.xml");
		HelloWorld helloWorld = (HelloWorld) context.getBean("helloWorld");
     	helloWorld.sayHello();
     	context.close();
     	
     	
     	FileSystemXmlApplicationContext  context2 = new FileSystemXmlApplicationContext("bean2.xml");
		HelloWorld helloWorld2 = (HelloWorld) context2.getBean("helloWorld");
     	helloWorld2.sayHello();
     	context2.close();
     	
	}
}
