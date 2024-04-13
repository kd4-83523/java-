package com.sunbeam;


public class Student {
	private int roll;
	String name;
	String city;
	Double marks;

public Student()
{
	
}
public Student(int roll, String name, String city, Double marks) {
	super();
	this.roll = roll;
	this.name = name;
	this.city = city;
	this.marks = marks;
}
public int getRoll() {
	return roll;
}
public void setRoll(int roll) {
	this.roll = roll;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public Double getMarks() {
	return marks;
}
public void setMarks(Double marks) {
	this.marks = marks;
}
@Override
public String toString() {
	return "Student [roll=" + roll + ", name=" + name + ", city=" + city + ", marks=" + marks + "]";
}


}


