package com.cqut.edn.cookies;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 这个Servlet用来显示指定书籍的详细信息
 * 
 * @author Administrator
 * 
 */

public class ServletBookDetail extends HttpServlet {

	private List<String> listLook = new ArrayList<String>();

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		BookList bookList = BookList.getInstance();
		String[] ids = request.getParameterValues("id");
		System.out.println(ids[0]);
		System.out.println(bookList.getBook("" + ids[0]).getName());
		response.setContentType("text/html;charset=utf-8");

		if (!listLook.contains(ids[0]))
			listLook.add(ids[0]);
		for (String id : listLook)
			response.getWriter().write(
					"你刚才访问了：" + bookList.getBook(id).getName()+"</br>");

	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
