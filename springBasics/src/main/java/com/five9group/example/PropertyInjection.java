package com.five9group.example;

public class PropertyInjection {

	private String firstName;
	private String lastName;

	//Get and Set methods
	public final String getFirstName() {
		return this.firstName;
	}

	public final void setFirstName(final String firstName) {
		this.firstName = firstName;
	}
	
	public final String getLastName() {
		return this.lastName;
	}

	public final void setLastName(final String lastName) {
		this.lastName = lastName;
	}
	public void printName(){
		System.out.println(this.firstName + this.lastName);
	}
	
}
