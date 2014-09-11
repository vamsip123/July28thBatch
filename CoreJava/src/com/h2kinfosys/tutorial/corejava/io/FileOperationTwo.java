package com.h2kinfosys.tutorial.corejava.io;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileOperationTwo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		char[] in = new char[50]; // to store input
		int size = 0;
		FileWriter fw = null;
		FileReader fr = null;
		try {
			File file = new File("C:/Users\\Jayram\\Desktop\\json\\FileWrite2.txt");
//			file.createNewFile();
			
			fw = new FileWriter(file); // create an actual file
			// & a FileWriter obj
			fw.write("Good Morning\nfolks\n"); // write characters to
			// the file
			fw.flush(); // flush before closing
//			fw.close(); // close file when done
			
			fr = new FileReader(file); // create a FileReader
			// object
			size = fr.read(in); // read the whole file!
			System.out.println(size + " "); // how many bytes read
			for(char c : in) // print the array
				System.out.print(c);
			
//			fr.close(); // again, always close
		} catch(IOException e) { 
			e.printStackTrace();
		}finally{
			if(fw != null){
				try{
					fw.close();
				}catch(Exception exp){}
			}
			if(fr != null) {
				try{
					fr.close();
				}catch(Exception exp){}
			}
		}
	}
}