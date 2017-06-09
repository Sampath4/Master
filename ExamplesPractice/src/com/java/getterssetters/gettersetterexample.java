package com.java.getterssetters;

public class gettersetterexample {
	private String fname = "SAM";
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public int getRno() {
		return rno;
	}
	public void setRno(int rno) {
		this.rno = rno;
	}
	public int getDob() {
		return dob;
	}
	public void setDob(int dob) {
		this.dob = dob;
	}
	protected int rno = 20;
	public int dob = 19940806;

}
