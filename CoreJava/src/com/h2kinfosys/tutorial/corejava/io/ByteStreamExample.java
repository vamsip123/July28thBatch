package com.h2kinfosys.tutorial.corejava.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Java byte streams are used to perform input and output of 8-bit bytes. Though
 * there are many classes related to byte streams but the most frequently used
 * classes are , FileInputStream and FileOutputStream. Following is an example
 * which makes use of these two classes to copy an input file into an output
 * file:
 * 
 * @author Jayram
 *
 */
public class ByteStreamExample {

	public static void main(String args[]) throws Exception {

		FileInputStream in = null;
		FileOutputStream out = null;

		try {
			File inputFile = new File(
					"C:/Users/Jayram/git/July28thBatch/CoreJava/src/com/h2kinfosys/tutorial/corejava/io/Person.java");
			
			in = new FileInputStream(inputFile);
			
			out = new FileOutputStream(
					"C:/Users/Jayram/git/July28thBatch/CoreJava/src/com/h2kinfosys/tutorial/corejava/io/Person.txt");

			int c;
			while ((c = in.read()) != -1) {
				out.write(c);
			}
			// do some logic here..and it breaks...
			
			System.out.println("Written Successfully!!!");
		} finally {
			if (in != null) {
				in.close();
			}
			if (out != null) {
				out.close();
			}
		}
	}

}
