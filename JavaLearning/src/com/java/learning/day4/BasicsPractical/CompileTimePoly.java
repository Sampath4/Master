package com.java.learning.day4.BasicsPractical;

public class CompileTimePoly {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		CompileTimePoly Object = new CompileTimePoly();
//		int results = Object.addNumbers(45, 10);
//		System.out.println("Int Results are :"+ results);
//		float Floatresults = Object.addNumbers(8, 6);
//		System.out.println("Float results are:"+ Floatresults);
//		double Doubleresults= Object.addNumbers(1.5, 6.0);
//		System.out.println("Double reesults are: "+ Doubleresults);
//		 
//	}
//
//	public int addNumbers(int a, int b) {
//		return a + b;
//	}
//
//	public float addNumbers(float a, float b) {
//		return a + b;

//	}

//	public double addNumbers(double a, double b) {

//		return a + b;
//
//	}
//
//}
		CompileTimePoly Check = new CompileTimePoly();
		int integerResults = Check.addNumbers(10, 5);
		System.out.println("The value of the Integer is:" + integerResults);
	float  FloatResults = Check.addNumbers(10, 12);
	System.out.println("The value of the Float is: " + FloatResults);
	double doubleResults = Check.addNumbers(10.5, 12.5);
	System.out.println("The valus of the Double is : " + doubleResults);
	}
	
		
		
public int addNumbers(int a, int b)
{
	return a+b;
}
public float addnumbers(float a, float b){
	return a+b;
}
public double addNumbers(double a, double b)
{
	return a+b;
}



}

