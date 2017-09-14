package com.example.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.example.model.BeerExpert;

import sun.print.resources.serviceui;

public class BeerSelect extends HttpServlet {

	private String s = "sss";

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// resp.setCharacterEncoding("utf-8");
		// resp.setContentType("text/html");
		// PrintWriter out = resp.getWriter();
		// out.println("Beer Selection Advice<br>");
		String c = req.getParameter("color");
		BeerExpert beerExpert = new BeerExpert();
		List<String> list = beerExpert.getBrands(c);
		// out.println("<br>Got beer color " + c + "Õı¥Û≈Ù<br>");
		// for (String string : list) {
		// out.print(string+"<br>");
		// }

		req.setAttribute("styles", list);
		RequestDispatcher requestDispatcher = req
				.getRequestDispatcher("result.jsp");
		requestDispatcher.forward(req, resp);
	}

}
