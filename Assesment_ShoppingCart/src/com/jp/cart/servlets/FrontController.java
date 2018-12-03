package com.jp.cart.servlets;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.jp.cart.entities.Cart;
import com.jp.cart.entities.Item;
import com.jp.cart.exception.CartException;
import com.jp.cart.services.ItemService;
import com.jp.cart.services.ItemServicesImpl;




@WebServlet("*.do")
public class FrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ItemService services;
	
	@Override
	public void init() throws ServletException {
		try {
			services = new ItemServicesImpl();
		} catch (CartException e) {
			throw new ServletException("Init mthod failed. ",e);
		}
	}

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String command = (getCommand(request.getRequestURI()));
		RequestDispatcher dispatch = null;
		String jspName = null;
		String prefix = "/WEB-INF/jsps/";
		String postfix = ".jsp";
		System.out.println(command);
		HttpSession session = request.getSession();
		
		try {
			switch (command){
			case "*":
			case "mainMenu":{
				jspName="MainMenu";
				break;
			}
			case "itemList":{
				ArrayList<Item> itemList = services.getItemList();
				System.out.println(itemList);
				request.setAttribute("itemList", itemList);
				jspName = "ItemList";
				break;
			}
			case "itemDetails":{
				String idStr = request.getParameter("id"); 
				int itemId = Integer.parseInt(idStr);
				Item item = services.getItemDetails(itemId);
				request.setAttribute("itemDetails", item);
				jspName = "ItemDetails";
				break;
			}
			case "addToCart":{
				String idStr = request.getParameter("id");
				int itemId = Integer.parseInt(idStr);
				ArrayList<Item> cartlist=new ArrayList<>();
				Cart items = new Cart (cartlist);
				session.setAttribute("cart", items);
				String msg = "Below Item Successfully added to the list";
				request.setAttribute("message", msg);
				jspName = "Cart";
				break;
				
			}
			
			}
		} catch (CartException e) {
			
			e.printStackTrace();
		}
		dispatch = request.getRequestDispatcher(prefix+jspName+postfix);
		dispatch.forward(request, response);
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}
	
	private String getCommand(String uri){
		int leftPosi = uri.lastIndexOf("/");
		int rtPosi = uri.lastIndexOf(".");
		if (rtPosi<leftPosi){
			return "mainMenu";
		}else{
		return uri.substring(leftPosi+1, rtPosi);
		}
	}

}
