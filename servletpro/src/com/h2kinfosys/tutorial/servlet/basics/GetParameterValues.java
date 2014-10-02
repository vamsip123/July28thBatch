package com.h2kinfosys.tutorial.servlet.basics;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class GetParameterValues
 */
@WebServlet("/GetParameterValues")
public class GetParameterValues extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public GetParameterValues() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doPost(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {
		PrintWriter pw = res.getWriter();
		res.setContentType("text/html");

		String[] values = req.getParameterValues("habits");
		pw.println("Selected Values...");
		for (int i = 0; i < values.length; i++) {
			pw.println("<li>" + values[i] + "</li>");
		}
		pw.close();
	}

}
