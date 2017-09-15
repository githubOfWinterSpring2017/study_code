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
 * ����Cookieʵ����ʾ������ϴη��ʵ�ʱ��
 */
public class ServletCookie extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//��ȡ�����������������Cookies���������cookies������˵�����������ϴη��ʹ�����վ������Cookies��Ϣ�����û����˵����������
		//�ǵ�һ�η��ʱ���վ����Ҫ��¼����û��������Ϣ�����浽�������Cookies������
		Cookie[] cookies = request.getCookies();
		if(null != cookies){
			for(Cookie cookie:cookies){
				String name = cookie.getName();
				String value = cookie.getValue();
				
				System.out.println(URLDecoder.decode(name,"utf-8"));
				
				if("�ϴη��ʵ�ʱ��".equals(URLDecoder.decode(name,"utf-8"))){
					response.setContentType("text/html;charset=UTF-8");
					response.getWriter().write("�ϴη��ʵ�ʱ����:"+value);
					return;
				}				
			}
		}
		Cookie cookie = new Cookie(URLEncoder.encode("�ϴη��ʵ�ʱ��","utf-8"),new Date().toLocaleString());
		//cookie.setMaxAge(3600*60*24);
		
		response.addCookie(cookie);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
