package com.h2kinfosys.tutorial.corejava.io;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Java Byte streams are used to perform input and output of 8-bit bytes, 
 * where as Java Character streams are used to perform input and output for 16-bit unicode.
 * 
 * @author Jayram
 *
 */
public class CharaterStreamExample {

	 public static void main(String args[]) throws IOException
	   {
		 FileReader in = null;
	      FileWriter out = null;

	      try {
	    	  in = new FileReader("C:/Users/Jayram/git/July28thBatch/CoreJava/src/com/h2kinfosys/tutorial/corejava/io/Person.java");
	    	  out = new FileWriter("C:/Users/Jayram/git/July28thBatch/CoreJava/src/com/h2kinfosys/tutorial/corejava/io/Person.txt");
	         
	         int c;
	         while ((c = in.read()) != -1) {
	            out.write(c);
	         }
	         System.out.println("Written Succesfully");
	      }finally {
	         if (in != null) {
	            in.close();
	         }
	         if (out != null) {
	            out.close();
	         }
	      }
	   }

}
