package com.java.learnings.FilesOperation.day6;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TryCatchExceptionExample {

	private static FileInputStream in;

	public static void main(String[] args) throws Exception {
		System.out.println("I Am Ok With This File");
		FileOutputStream out = null;
		try {
			out = new FileOutputStream("c:\\jfile\\out.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.exit(1);
		 int c;
		in = null;
		try {
			while((c= in.read()) != -1)
out.write(c);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
			System.out.println("THis Was Mondatory");
		/*in.close();
		out.close();*/
		}
		
		
	}
	

}
