package com.tutorial.jsp.common;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.tutorial.jsp.dao.EmployeeDetailDAO;
import com.tutorial.jsp.dao.EmployeeDetailDAOImpl;
import com.tutorial.jsp.dataobject.EmployeeDO;

/**
 * Servlet implementation class GetEmployeeDetail
 */
@WebServlet( displayName="GetEmployeeDetail" ,name="GetEmployeeDetail" , urlPatterns={"/GetEmployeeDetail"})
public class GetEmployeeDetail extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private String name;
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GetEmployeeDetail() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println(name);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String empid = (String)request.getParameter("empid");
		String flag = (String) request.getParameter("flag");
		
		List<EmployeeDO> employeeList = new ArrayList<EmployeeDO>();
		HttpSession session = request.getSession();
		
		EmployeeDetailDAO dao = new EmployeeDetailDAOImpl();
		if(empid != null && !"".equals(empid)){
//			EmployeeDO empObj = dao.getEmpDetail(empid);
//			employeeList.add(empObj);
			employeeList = dao.getEmpDetail(empid);
		}else if(flag.equals("yes")){
			employeeList = dao.getEmployees();
		}
		
		request.setAttribute("empdetail", employeeList);
		
//		session.setAttribute("empdetail", employeeList);
		
		String dispatcherURL = "";
		/*if ("employee".equals(flag))
			dispatcherURL = "/empdetail.jsp";
		else*/

			dispatcherURL = "/empdetail.jsp";
		
		RequestDispatcher rd = request.getRequestDispatcher(dispatcherURL);
		rd.forward(request,response);
		
	}
}