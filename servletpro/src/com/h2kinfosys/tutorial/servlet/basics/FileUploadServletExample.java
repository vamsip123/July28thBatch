package com.h2kinfosys.tutorial.servlet.basics;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collection;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

/*int 	fileSizeThreshold
The size threshold after which the file will be written to disk
java.lang.String 	location
The directory location where files will be stored
long 	maxFileSize
The maximum size allowed for uploaded files.
long 	maxRequestSize
The maximum size allowed for multipart/form-data requests
*/
@WebServlet("/FileUploadServletExample")
@MultipartConfig(location = "C:\\Users\\Jayram\\upload", fileSizeThreshold = 512 * 512, maxFileSize = 512 * 512 * 5, maxRequestSize = 512 * 512 * 5 * 5)
public class FileUploadServletExample extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		ServletContext context = getServletContext();
		RequestDispatcher rd = context
				.getRequestDispatcher("/fileUpload.html");
		rd.forward(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		Collection<Part> parts = request.getParts();

		out.write("<h2> Total parts : " + parts.size() + "</h2>");

		for (Part part : parts) {
			printPart(part, out);
			part.write("samplefile");
		}

	}

	private void printPart(Part part, PrintWriter pw) {
		StringBuffer strbuffer = new StringBuffer();
		strbuffer.append("<p>");
		strbuffer.append("File Name : " + part.getName());
		strbuffer.append("<br>");
		strbuffer.append("Content Type : " + part.getContentType());
		strbuffer.append("<br>");
		strbuffer.append("File Size : " + part.getSize());
		strbuffer.append("<br>");
		for (String header : part.getHeaderNames()) {
			strbuffer.append(header + " : " + part.getHeader(header));
			strbuffer.append("<br>");
		}
		strbuffer.append("</p>");
		pw.write(strbuffer.toString());

	}
}