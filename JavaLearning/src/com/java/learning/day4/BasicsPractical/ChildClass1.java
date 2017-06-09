package com.java.learning.day4.BasicsPractical;

public class ChildClass1 extends ParentClass {
	String ChildNmae= "RAJIREDDY";
	String ChildName1= "SAMPATHREDDY";
	public static void main(String args[]) {
		ChildClass1 ChildObject = new ChildClass1();
		System.out.println("Print the values of ParentName : " + ChildObject.getFatherName());
		System.out.println("print the value of DateOfBirth: " + ChildObject.getDateOfBirth());
		System.out.println("the value of the NumberOfChilds are :" + ChildObject.getNumberOfChilds());
	
		System.out.println("the value of the NumberOfChilds are :" + ChildObject.ChildName1);}
	
}
