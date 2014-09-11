package com.h2kinfosys.tutorial.corejava.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Most of the examples we've seen so far use unbuffered I/O. This means each
 * read or write request is handled directly by the underlying OS. This can make
 * a program much less efficient, since each such request often triggers disk
 * access, network activity, or some other operation that is relatively
 * expensive. 
 * 
 * To reduce this kind of overhead, the Java platform implements
 * buffered I/O streams. Buffered input streams read data from a memory area
 * known as a buffer; the native input API is called only when the buffer is
 * empty. Similarly, buffered output streams write data to a buffer, and the
 * native output API is called only when the buffer is full.
 * 
 * @author Jayram
 *
 */
public class BufferedStreamExample {

	public static void main(String[] args) throws IOException {

		BufferedReader in = null;
		BufferedWriter out = null;

		try {
			in = new BufferedReader(
					new FileReader(new File("C:/Users/Jayram/git/April-2014-Batch/CoreJava/src/com/h2kinfosys/java/io/Person.java")
							));
			
			File fi = new File("C:/Users/Jayram/git/April-2014-Batch/CoreJava/src/com/h2kinfosys/java/io/Person.java");
			
			FileReader fd = new FileReader(fi);
			in = new BufferedReader(fd);
			
//			in = new BufferedReader (new FileReader("C:/Users/Jayram/git/July28thBatch/CoreJava/src/com/h2kinfosys/tutorial/corejava/io/Person.java"));
			
			out = new BufferedWriter(
					new FileWriter(
							"C:/Users/Jayram/git/April-2014-Batch/CoreJava/src/com/h2kinfosys/java/io/PersonNew.txt"));

			int c;
			while ((c = in.read()) != -1) {
				out.write(c);
			}
			System.out.println("Written Succesfully");
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
