package com.itheima;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RefreshServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		response.setContentType("text/html;charset=utf-8");
		response.setCharacterEncoding("utf-8");
		response.getWriter().write("恭喜注册成功，三秒之后回到主页...");		
		response.setHeader("Refresh", "3,url=/Day04/index.jsp");
	/*	
		InputStream in = new FileInputStream(this.getServletContext().getRealPath("RegisterOk.html"));
		OutputStream out = response.getOutputStream();
		byte[] bytes = new byte[1024];
		int i=0;
		while((i = in.read(bytes)) != -1){
			out.write(bytes, 0, i);
		}
		in.close();
		//通知浏览器解码时使用的码表
		response.setContentType("text/html;charset=utf-8");
		//设置服务器输出数据时使用的码表
		response.setCharacterEncoding("utf-8");
		//设置浏览器3秒之后自动刷新到index.jsp页面
		response.setHeader("Refresh", "3,url=/Day04/index.jsp");
		*/
		
		
		
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
