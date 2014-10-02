package com.h2kinfosys.tutorial.servlet.basics;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.SingleThreadModel;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloStudentsServlet
 */
@WebServlet(value="/helloStudents" , loadOnStartup=1)
public class HelloStudentsServlet extends HttpServlet {
	
    public static int hitCount = 0 ;   
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HelloStudentsServlet() {
        super();
        System.out.println("This is a constructor ");
    }
    @Override
    public void init() throws ServletException {
    	System.out.println("This is a init method");
    }
    
    @Override
    public void init(ServletConfig config) throws ServletException {
    	// TODO Auto-generated method stub
    	super.init(config);
    }

/*	*//**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 *//*
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		hitCount++;
//		response.setContentType("application/msword");
		response.setContentType("text/html");
		String name = request.getParameter("name");
		String lastName = request.getParameter("lastName");
		PrintWriter out = response.getWriter();
		out.println("Hello Folks How are u... today" + new Date() + " My Hit Count = "+ hitCount);
		out.println("<b> Hello "+ name + " </br>"+ lastName);
		
		System.out.println("Hello Folks How are u...");
	}*/
	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    		throws ServletException, IOException {
    	response.setContentType("text/html");
    	System.out.println("In Service Method...");
//    	response.setContentType("application/msword");
		String name = request.getParameter("name");
		String lastName = request.getParameter("lastName");
		String password = request.getParameter("password");
		
		PrintWriter out = response.getWriter();
		out.println("Hello Folks How are u... today" + new Date() + " My Hit Count = "+ hitCount);
		out.println("<b> Hello "+ name + " </br>"+ lastName);
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    		throws ServletException, IOException {
    	doGet(request, response);
    }
    
    
	/*protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		hitCount++;
//		response.setContentType("application/msword");
		response.setContentType("text/html");
		String name = request.getParameter("name");
		String lastName = request.getParameter("lastName");
		PrintWriter out = response.getWriter();
		out.println("Hello Folks How are u... today" + new Date() + " My Hit Count = "+ hitCount);
		out.println("<b> Hello "+ name + " </br>"+ lastName);
		
		System.out.println("Hello Folks How are u...");
	}*/
	
	@Override
	public void destroy() {
		System.out.println("This is a destroy method");
	}
}