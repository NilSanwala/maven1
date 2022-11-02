package com.nihal.product.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.nihal.product.bo.ProductBO;
import com.nihal.product.bo.ProductBOImpl;
import com.nihal.product.dao.ProductDAO;
import com.nihal.product.dto.Product;



@WebServlet
public class CreateProdcutServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
     

	//@SuppressWarnings("unused")
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Integer id= Integer.parseInt(request.getParameter("id"));
		String name = request.getParameter("name");
		String description = request.getParameter("description");
		Integer price = Integer.parseInt(request.getParameter("price"));
		
		Product product = new Product();
		product.setId(id);
		product.setName(name);
		product.setDescription(description);
		product.setPrice(price);
		
		
		ProductBO bo = new ProductBOImpl();
		bo.create(product);
		
		PrintWriter out = response.getWriter();
		out.println("Product Created");
	}

}
