package com.jp.listeners.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;




@WebServlet("/beginSession")
public class BeginSession extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		
		/*getSession() : If session exists, bring the reference of session.
		 * Otherwise create a new session.
		 * getSession(false):If session exists, bring the reference of the session. 
		 * Otherwise return null. It cannot create a new session.
		 * 
		 */
		RequestDispatcher dispatch = request.getRequestDispatcher("/WEB-INF/jsps/MyJSP.jsp");
		dispatch.forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
