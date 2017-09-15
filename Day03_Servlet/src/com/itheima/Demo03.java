package com.itheima;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Demo03 extends HttpServlet {

	/**
	 * ServletContextµÄÑÝÊ¾
	 */
	@SuppressWarnings(value="all")
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		ServletContext context = this.getServletContext();
		Enumeration enums = context.getInitParameterNames();
		while(enums.hasMoreElements()){
			String name = (String) enums.nextElement();
			String value = context.getInitParameter(name);
			System.out.println(name+":"+value);
		}
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
