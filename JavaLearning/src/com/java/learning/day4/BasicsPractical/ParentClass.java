package com.java.learning.day4.BasicsPractical;

public class ParentClass {
	private String FatherName= "BGR";
	private int NumberOfChilds= 2;
	private int DateOfBirth= 19892012; 
	public String getFatherName() {
		return FatherName;
	}
	public void setFatherName(String fatherName) {
		FatherName = fatherName;
	}
	public int getNumberOfChilds() {
		return NumberOfChilds;
	}
	public void setNumberOfChilds(int numberOfChilds) {
		NumberOfChilds = numberOfChilds;
	}
	public int getDateOfBirth() {
		return DateOfBirth;
	}
	public void setDateOfBirth(int dateOfBirth) {
		DateOfBirth = dateOfBirth;
	}
	
}
