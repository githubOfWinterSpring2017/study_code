package com.itheima.request;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FengjieServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String ref = request.getHeader("Referer");
		if(ref == null || "".equals(ref) || !ref.startsWith("http://localhost"))
		{
			response.sendRedirect("http://localhost/Day04/news.html");
			return;
		}
		response.setContentType("text/html;charset=utf-8");
		response.setCharacterEncoding("utf-8");
		response.getWriter().write("凤姐的回忆录。。。。。在黑马的日子。。。。。收获了很多。。。。");		
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
