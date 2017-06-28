package com.cts.platform.SpringSample;

public class Student {  
private String name;  
private Address address;
public String getName() {  
    return name;  
}  
  
public void setName(String name) {  
    this.name = name;  
}  
  
public void displayInfo(){  
    System.out.println("Hello: "+name+address.getCity());  
}  

public Student(Address add){
	this.address=add;
}
}  
