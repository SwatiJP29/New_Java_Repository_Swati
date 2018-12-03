package com.jp.hr.servlets;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.jp.hr.entities.Employee;
import com.jp.hr.entities.Product;
import com.jp.hr.exceptions.HrException;
import com.jp.hr.services.ServiceEmployee;
import com.jp.hr.services.ServiceEmployeeImpl;
import com.jp.hr.services.ServiceProduct;
import com.jp.hr.services.ServiceProductImpl;


/* Front Controller : A JEE design pattern
 * Command pattern (GoF Pattern)
 * 
 * 
 */


@WebServlet("*.do") //A generic url.
public class FrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ServiceEmployee services;
	
	private ServiceProduct pservices;
	
	
	@Override
	public void init() throws ServletException {
		try {
			services = new ServiceEmployeeImpl();
		} catch (HrException e) {
			throw new ServletException("Init mthod failed. ",e);
		}
		pservices = new ServiceProductImpl();
	}


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String command = (getCommand(request.getRequestURI()));
		RequestDispatcher dispatch = null;
		String jspName = null;
		String prefix = "/WEB-INF/jsps/";
		String postfix = ".jsp";
		System.out.println(command);
		try {
			switch(command){
				case "*":
				case "home": {
					jspName="Home";
					break;
				}
				
				case "login": {
					jspName="Login";
					break;
				}
				
				case "authenticate":{
					String userName = request.getParameter("username");
					String password = request.getParameter("password");
					
					if (userName.equals("a")&&password.equals("a")){
						String userFullName = "Swati Deshpande";
						HttpSession session = request.getSession();
						session.setAttribute("userFullName", userFullName);
						jspName="MainMenu";
					}else{
						String msg = "Wrong credentials. Please enter again";
						request.setAttribute("message", msg);
						jspName="Login";
					}
					break;
				}
				
				case "logout": {
					HttpSession session = request.getSession();
					request.setAttribute("userFullName", session.getAttribute("userFullName"));
					session.invalidate();
					jspName="ThanksPage";
					break;
				}
				
				case "mainMenu":{
					jspName="MainMenu";
					break;
				}
				case "empList":{
					ArrayList<Employee> empList = services.getEmpList();
					System.out.println(empList);
					request.setAttribute("empList", empList);
					jspName = "EmpList";
					break;
				}
				case "empDetails":{
					String idStr = request.getParameter("id"); //empDetails.do?id=x
					int empID = Integer.parseInt(idStr);
					Employee emp = services.getEmpDetails(empID);
					request.setAttribute("empDetails", emp);
					jspName = "EmpDetails";
					break;
				}
				case "newJoining":{
					jspName = "NewJoining";
					break;
				}
				case "submitJoining":{
					String empIDStr = request.getParameter("empId");
					String firstName = request.getParameter("firstName");
					String lastName = request.getParameter("lastName");
					int empID = Integer.parseInt(empIDStr);
					Employee emp = new Employee(empID, firstName, lastName);
					boolean isSuccessful = services.joinNewEmployee(emp);
					String msg = isSuccessful?"Employee Inserted" : "Insertion of Record failed";
					request.setAttribute("message", msg);
					
					jspName= "NewJoining";
					break;
				}
				
				case "productList":{
					ArrayList<Product> productList = pservices.getProductList();
					System.out.println(productList);
					request.setAttribute("productList", productList);
					jspName = "ProductList";
					break;
				}
				case "productDetails":{
					String idStr = request.getParameter("id"); //empDetails.do?id=x
					int productId = Integer.parseInt(idStr);
					Product product = pservices.getProductDetails(productId);
					request.setAttribute("productDetails", product);
					jspName = "ProductDetails";
					break;
				}
				case "newProduct":{
					jspName = "NewProduct";
					break;
				}
				case "submitProduct":{
					String productIDStr = request.getParameter("productId");
					String productCategory = request.getParameter("productCategory");
					String productName = request.getParameter("productName");
					String productPriceStr = request.getParameter("productPrice");
					int productId = Integer.parseInt(productIDStr);
					float productPrice = Float.parseFloat(productPriceStr);
					
					Product product = new Product(productId,productCategory, productName, productPrice);
					
					boolean isSuccessful = pservices.addNewProduct(product);
					String msg = isSuccessful?"Product is added successfully to the cart" : "Something went wrong. Please add the product again";
					request.setAttribute("message", msg);
					
					jspName= "NewProduct";
					break;
				}
				case "updateProductDetails":{
					String idStr = request.getParameter("id"); 
					
					int productId = Integer.parseInt(idStr);
					System.out.println(productId);
					Product product = pservices.getProductDetails(productId);
					request.setAttribute("product", product);
					jspName = "UpdateProduct";
					break;
				}
				case "updateProduct":{
					String productIDStr = request.getParameter("productId");
					String productCategory = request.getParameter("productCategory");
					String productName = request.getParameter("productName");
					String productPriceStr = request.getParameter("productPrice");
					int productId = Integer.parseInt(productIDStr);
					float productPrice = Float.parseFloat(productPriceStr);
					
					Product product = new Product(productId,productCategory, productName, productPrice);
					
					boolean isSuccessful = pservices.updateProduct(product);
					String msg = isSuccessful?"Product is updated successfully to the cart" : "Something went wrong. Please update the product again";
					request.setAttribute("message", msg);
					request.setAttribute("productDetails", product);
					
					jspName= "ProductDetails";
					break;
				}
				case "deleteProduct":{
					String idStr = request.getParameter("id"); 
					int productId = Integer.parseInt(idStr);
					System.out.println(productId);
					boolean isSuccessful = pservices.deleteProduct(productId);
					
					Product product = pservices.getProductDetails(productId);
					String msg = isSuccessful?"Product is deleted successfully to the cart" : "Something went wrong. Please delete the product again";
					ArrayList<Product> productList = pservices.getProductList();
					//System.out.println(productList);
					request.setAttribute("productList", productList);
					jspName = "ProductList";
					break;
				}
				
			}
		} catch (HrException e) {
			/*request.setAttribute("msg", e.getMessage());
			jspName = "Errors";*/
			throw new ServletException(e.getMessage());
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
			return "home";
		}else{
		return uri.substring(leftPosi+1, rtPosi);
		}
	}

}
