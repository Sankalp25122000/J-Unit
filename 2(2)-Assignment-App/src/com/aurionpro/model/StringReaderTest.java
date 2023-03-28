package com.aurionpro.model;

import java.io.StringReader;

public class StringReaderTest {

	public static void main(String[] args) {
		String data = "Hello Guys!!";
		char[] array = new char[10];
		try {
			StringReader input = new StringReader(data);
			input.skip(2);
			input.read(array);
			
			System.out.println("Data read from the string:");
			System.out.println(array);

			input.close();
		} catch (Exception e) {
			e.getStackTrace();
		}
	}

}
