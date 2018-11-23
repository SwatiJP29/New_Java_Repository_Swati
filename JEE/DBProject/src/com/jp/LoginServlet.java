package com.jp;



import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@SuppressWarnings("serial")
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	
	
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		
		
		User loginuser = new User(request.getParameter("username"),request.getParameter("password") );

		
		
				if (loginuser.validateUser()){
					
					
				
				response.sendRedirect("DBTablesServlet");
				
				}
				else{
					
					out.println("<h1> Invalid User </h1>");
					out.flush();
				}
			
		
		
//		response.setContentType("text/html");
//		
//		out.println("<h1> Welcome to HTTP Servlets </h1>");
//		out.println("Username is : " +name);
//		out.println("Password is : " +pwd);
//		out.flush();
//		
//		if(name.equals("Admin") && pwd.equals("Admin")){
//			out.write("<h1>Valid User</h1>");
//		}
//		else {
//			out.write("<h1>Invalid User</h1>");
//		}
//		out.flush();
	}

}
