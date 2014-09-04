package com.h2kinfosys.tutorial.corejava.exception;

public class ImportantCalcException extends Exception {
	String value;
	public ImportantCalcException( String value) {
		this.value = value;
	}
	@Override
	public String toString() {
		return "Please Add a number instead of String " + value;
	}
}
