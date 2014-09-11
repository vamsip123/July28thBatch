package com.h2kinfosys.tutorial.corejava.io;

import java.io.File;
import java.io.IOException;

public class FileOperation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			boolean newFile = false;
			File file = new File("H2kInfosys.txt");
			
			File dir = new File("H2kInfosysDir");
			
			System.out.println(dir.isDirectory());
			
			dir.mkdir();
			
			System.out.println(file.exists()); // look for a real file
			newFile = file.createNewFile(); // maybe create a file!
			System.out.println(newFile); // already there?
			System.out.println(file.exists()); // look again
			System.out.println(file.getAbsolutePath());
			
			} catch(IOException e) { 
				e.printStackTrace();
			}
	}
}