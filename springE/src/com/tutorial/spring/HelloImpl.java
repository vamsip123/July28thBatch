package com.tutorial.spring;

public class HelloImpl implements HelloInterface {
	private String msg;

	public HelloImpl() {
		System.out.println("Constructor executed");
	}

	public void setMessage(String s) {
		msg = s;
		System.out.println("setter executed");
	}

	public String wish(String uname) {
		return msg + " " + uname + " Have a great day";
	}
}