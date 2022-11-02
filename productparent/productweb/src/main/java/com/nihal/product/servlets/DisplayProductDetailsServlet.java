package com.nihal.product.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.nihal.product.bo.ProductBO;
import com.nihal.product.bo.ProductBOImpl;
import com.nihal.product.dto.Product;


public class DisplayProductDetailsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		ProductBO bo= new ProductBOImpl();
		Product product =  bo.findProduct(Integer.parseInt(request.getParameter("id")));
		
		PrintWriter out = response.getWriter();
		out.println(product);
		out.println("Product Details");
		out.println("Product ID: " + product.getId());
		out.println("Product NAME: " + product.getName());
		out.println("Product DESCRIPTION: " + product.getDescription());
		out.println("Product PRICE: " + product.getPrice());
	}

}
