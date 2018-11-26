package com.jp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Process1
 */
@WebServlet("/process1")
public class Process1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
// The response if altered by this serlet does not reach to next in chain because Ther forward dispathching wipes off the old response      
//In the forward chain, the last entity to generate full and final response.	
	
	//The request if altered, is sent to the next in chain as altered.
	
	//Query string : User entries passed through address bar when method type is GET seperated by ? from URI, seperated by & from another field
	
	//User entries passed through seperate connection when method type is POST
	
	//Form Data: User entries passed through seperate connection when method type is POST
	
	// Form data is not exposed in address bar.
	
	//Always send sensitive data/data of large size as Form Data.
	
	//Prefer GET if data is small in size and not sensitive.
	
	//REquest.getParameter() : Brings every data in String form. One method to bring Query string or form data
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String param1 = request.getParameter("param1");
		//PrintWriter out = response.getWriter();
		System.out.println("In servlet process1" + param1);
		
		
		RequestDispatcher dispatch = request.getRequestDispatcher("/process2");
		dispatch.forward(request, response); // Send the control to another servlet
		System.out.println("In Servlet process1");
	}

	

}
