package com.itheima;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletConfigDemo extends HttpServlet {

	
	@SuppressWarnings(value="all")
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		ServletConfig con = getServletConfig();
		//1、获取Servlet在配置文件中的名称。
//		String name = con.getServletName();
//		System.out.println(name);
//
//		Enumeration enums = con.getInitParameterNames();
//		while(enums.hasMoreElements())
//		{
//			String name1 = (String)enums.nextElement();
//			String value = con.getInitParameter(name1);
//			System.out.println(name1+":"+value);
//		} 
		//获取ServletContext对象
		ServletContext context = this.getServletContext();
		
		String name = (String) context.getAttribute("name");
		
		System.out.println(name);
		
		
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
