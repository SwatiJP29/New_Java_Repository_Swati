package com.jp.config.servlets;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/*
 * Lazy instantiation: Deferring the object creation until receipt of the first request.
 * 
 * In case of many servlets and there is no request is there for few servlets. so it will not create any object
 * 
 */

//@WebServlet("/process3")
public class Process3 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	public Process3(){
		System.out.println("Object Created");
	}
       
    
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("In Process 3");
		
		//The below code is to get context parameter 
		
		ServletContext ctx = super.getServletContext();
		System.out.println(ctx.getInitParameter("Company Name"));
		
		//The below code is to get config parameter
		
		ServletConfig cfg = super.getServletConfig();
		System.out.println(cfg.getInitParameter("PageHead"));
	}

	
	 

}
