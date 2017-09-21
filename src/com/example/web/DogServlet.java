package com.example.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.example.bean.Dog;

public class DogServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		Dog dog = (Dog) getServletContext().getAttribute("dog");
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		out.println("Dog : " + dog.getBreed());
	}

}
