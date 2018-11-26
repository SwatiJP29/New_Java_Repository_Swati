package com.jp;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/authenticate")
public class Authenticate extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		RequestDispatcher dispatch = null;
		//dispatch = request.getRequestDispatcher("");
		
		if(username.equals("a")&& (password.equals("b"))){
			dispatch = request.getRequestDispatcher("/WEB-INF/jsps/MainMenu.jsp");
		}else {
			String message = "Incorrect username/password. Please enter again";
			request.setAttribute("message", message);
			dispatch = request.getRequestDispatcher("/WEB-INF/jsps/Login.jsp");
		}
		dispatch.forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
