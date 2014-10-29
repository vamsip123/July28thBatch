package com.tutorial.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;


public class HiController implements Controller{
	String message;
	
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public ModelAndView handleRequest(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		return new ModelAndView("helloworld", "newMessage",message);
		///WEB-INF/views/helloworld.jsp
		///hit db.....get some info
		//WEB-INF/views/helloworld.jsp
		//helloworld is my view
		// message is double quotes is my key to the model data
		// message without double quotes is my model data
	}
	
}