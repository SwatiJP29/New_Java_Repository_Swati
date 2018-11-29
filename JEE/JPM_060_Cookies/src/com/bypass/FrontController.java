package com.bypass;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;




@WebServlet("*.do")
public class FrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String page = request.getParameter("pg");
		RequestDispatcher dispatch = null;
		switch(page){
			case "Welcome":{
				Cookie[] cookies = request.getCookies();
				dispatch = request.getRequestDispatcher("/WEB-INF/jsps/Welcome.jsp");
				for(Cookie cookie : cookies){
					System.out.println(cookie.getName());
					if (cookie.getName().equals("bypasspage")){
						dispatch = request.getRequestDispatcher("/WEB-INF/jsps/MainMenu.jsp");
						break;
					}
				}
				
				dispatch.forward(request, response);
				break;
			}
			case "Menu":{
				
				String isBoxChecked = request.getParameter("ToBypass");
				//System.out.println(isBoxChecked);
				if (isBoxChecked!=null){
					Cookie c = new Cookie("bypasspage", "adssf");
					c.setMaxAge(60*60*48);
					response.addCookie(c);
					System.out.println("added cookie");
				}
				dispatch = request.getRequestDispatcher("/WEB-INF/jsps/MainMenu.jsp");
				dispatch.forward(request, response);
			}
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
