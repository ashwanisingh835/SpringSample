package com.cts.platform.SpringSample;

import java.io.IOException;

public class Student {
	private String name;
	private Address address;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void displayInfo() throws IOException {
		System.out.println("Hello: " + name + address.getCity());
		throw new IOException();
	}

	public Student(Address add) {
		this.address = add;
	}
}
