 package com.java.learning.day4.BasicsPractical;

public class ChildClass2 extends ChildClass1{
 int C = 10;
	public static void main(String[] args) {
		  
//	ChildClass2 Salary = new ChildClass2();
//		ChildClass2 Child2Object = new ChildClass2();
//		System.out.println("Nmae of the Child is :"+ Child2Object.ChildNmae);
//		System.out.println("Nmae of the Child2 is :" + Child2Object.ChildName1);
//	System.out.println("Salary of the child is : " + Salary.C );
 ChildClass2 Final = new ChildClass2();
 System.out.println("Final Names are here: "+ Final.getFatherName()   +    Final.ChildName1 + Final.C);
	}

}
