package com.cqut.edn.cookies;

import java.io.IOException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/*
 * 利用Cookie实现显示浏览器上次访问的时间
 */
public class ServletCookie extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//获取到从浏览器传过来的Cookies对象，如果有cookies对象，则说明这个浏览器上次访问过本网站并留有Cookies信息，如果没有则说明这个浏览器
		//是第一次访问本网站，需要记录这个用户浏览的信息并保存到浏览器的Cookies对象中
		Cookie[] cookies = request.getCookies();
		if(null != cookies){
			for(Cookie cookie:cookies){
				String name = cookie.getName();
				String value = cookie.getValue();
				
				System.out.println(URLDecoder.decode(name,"utf-8"));
				
				if("上次访问的时间".equals(URLDecoder.decode(name,"utf-8"))){
					response.setContentType("text/html;charset=UTF-8");
					response.getWriter().write("上次访问的时间是:"+value);
					return;
				}				
			}
		}
		Cookie cookie = new Cookie(URLEncoder.encode("上次访问的时间","utf-8"),new Date().toLocaleString());
		//cookie.setMaxAge(3600*60*24);
		
		response.addCookie(cookie);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
