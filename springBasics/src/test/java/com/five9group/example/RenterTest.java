package com.five9group.example;

import org.springframework.context.support.FileSystemXmlApplicationContext;

public class RenterTest {

	public static void main (String args[]){
		FileSystemXmlApplicationContext  context = new FileSystemXmlApplicationContext("bean.xml");
		Renter renter = (Renter)context.getBean("renter");
		renter.displayCostOfHiringCar();
		context.close();
		
		FileSystemXmlApplicationContext  context2 = new FileSystemXmlApplicationContext("bean.xml");
		Renter renter2 = (Renter)context2.getBean("renter2");
		renter2.displayCostOfHiringCar();
		context2.close();
		
	}
}
