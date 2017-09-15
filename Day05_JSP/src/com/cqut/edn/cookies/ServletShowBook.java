package com.cqut.edn.cookies;

import java.io.IOException;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletShowBook extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		BookList bookList = BookList.getInstance();
		Map<String,Book> bookMaps = bookList.getBooks();
		request.setAttribute("bookMaps",bookMaps );
		//实现重定向
		response.sendRedirect("/Day05/BookList.jsp");
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
