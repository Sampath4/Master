package com.javalearning.day1.java;

import java.util.Scanner;

public class Testing {

	public static void main(String[] args) {
		
//		int rollno;
//		String college;
//		Testing manual = new Testing (System.in);
		
	Scanner scan = new Scanner(System.in);
	System.out.println("please enter the value");
	String User_Input_string = scan.nextLine();
	System.out.println("the entered value was");
	System.out.print(User_Input_string);

	}

}
