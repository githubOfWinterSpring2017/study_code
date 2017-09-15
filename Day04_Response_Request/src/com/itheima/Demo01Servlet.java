package com.itheima;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Demo01Servlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//1、使用字节流输出数据
		//设置Http的相应头的Content-Type，来通知服务器使用utf-8来解码
		/*response.setHeader("Content-Type", "text/html;charset=utf-8");		
		//利用字节方式输出数据，并且设置的编码为utf-8
		response.getOutputStream().write("我是中国人".getBytes("utf-8"));		
		*/
		//2、使用字符流输出数据
		//指定服务器发送数据事查询的码表。
		//response.setCharacterEncoding("utf-8");		
		//response.setHeader("Content-Type", "text/html;charset=utf-8");//可以使用response.setContentType("text/html;charset=utf-8");来代替上面两句代码
		//因为这个代码的底层使用了这两句，但是为了让代码更加通俗易懂，一般还是添加上第一句代码，使用的格式如下：
		
		response.setContentType("text/html;charset=utf-8");
		response.setCharacterEncoding("utf-8");
		response.getWriter().write("我是中国人");
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
 
		doGet(request, response);
	}

}
