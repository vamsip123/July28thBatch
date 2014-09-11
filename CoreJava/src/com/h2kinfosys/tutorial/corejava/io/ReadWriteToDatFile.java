package com.h2kinfosys.tutorial.corejava.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ReadWriteToDatFile {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception{
		
		
		Person per = new Person("Jayram","SOFTWARE","New York", 12345);
		
		System.out.println("Before ="+per);
		
		FileOutputStream fileOutputStream = new FileOutputStream("jayramrout.dat");
		ObjectOutputStream output = new ObjectOutputStream(fileOutputStream);

		output.writeObject(per);
		output.close();

		ObjectInputStream input = new ObjectInputStream(new FileInputStream("jayramrout.dat"));
		Object obj = input.readObject();
		per = (Person)obj;
		System.out.println("After Reading="+per);
		
		/*Person perRead = (Person)input.readObject();
		
		System.out.println(" After "+perRead.getName()+ " "+ perRead.getPlace()+" "+ perRead.getProfession()+""
				+ "  "+ perRead.getSsn());*/
		
	}
}