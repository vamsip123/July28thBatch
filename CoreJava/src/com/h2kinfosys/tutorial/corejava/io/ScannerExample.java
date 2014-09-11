package com.h2kinfosys.tutorial.corejava.io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class ScannerExample {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner s = null;

        try {
            s = new Scanner(new BufferedReader(new FileReader("C:/Users/Jayram/git/April-2014-Batch/CoreJava/src/com/h2kinfosys/java/io/Person.java")));
            
            while (s.hasNext()) {
                System.out.println(s.next());
            }
        } finally {
            if (s != null) {
                s.close();
            }
        }
	}
}