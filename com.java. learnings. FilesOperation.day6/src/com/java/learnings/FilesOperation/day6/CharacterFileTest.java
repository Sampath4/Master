package com.java.learnings.FilesOperation.day6;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;

public class CharacterFileTest {

	public static void main(String[] args) throws Exception {
		FileReader Fr = new FileReader("c:\\jfile\\out.txt");
		FileWriter Fw= new FileWriter("c:\\jfile\\output2.txt");
		int c;
		while ((c= Fr.read())!=-1)
		Fw.write(c);
			
	}

}
