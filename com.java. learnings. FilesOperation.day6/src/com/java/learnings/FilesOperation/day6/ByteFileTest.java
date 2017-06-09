package com.java.learnings.FilesOperation.day6;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteFileTest {

	public static void main(String[] args) throws IOException {
//		FileInputStream obj = new FileInputStream("c:\\jfile\\hello.txt");
//		FileOutputStream obj1 = new FileOutputStream("c:\\jfile\\out.txt");
//		int c;
//		while((c = obj.read()) != -1)
//			obj1.write(c);
//			
//        System.out.println("The current file was Loaded");
	FileInputStream in = new FileInputStream("c:\\jfile\\hello.txt");
	FileOutputStream out = new FileOutputStream("c:\\jfile\\out.txt");
	 int c;
	while((c= in.read()) != -1)
out.write(c);
	 
	}

}
