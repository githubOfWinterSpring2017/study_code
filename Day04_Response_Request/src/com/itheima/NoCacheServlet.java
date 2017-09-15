package com.itheima;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class NoCacheServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//控制浏览器不缓存
		response.setIntHeader("Expires", -1);
		response.setHeader("Cache-Control", "no-cache");
		response.setHeader("Pragma","no-cache");
		response.setContentType("text/html;charset=utf-8");
		response.getWriter().write("当前时间是："+new Date().toLocaleString());
		//控制浏览器缓存
		//response.setDateHeader("Expires", System.currentTimeMillis()+1000L*3600*24*30);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
