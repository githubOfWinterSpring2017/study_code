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
		response.getWriter().write("��ϲע��ɹ�������֮��ص���ҳ...");		
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
		//֪ͨ���������ʱʹ�õ����
		response.setContentType("text/html;charset=utf-8");
		//���÷������������ʱʹ�õ����
		response.setCharacterEncoding("utf-8");
		//���������3��֮���Զ�ˢ�µ�index.jspҳ��
		response.setHeader("Refresh", "3,url=/Day04/index.jsp");
		*/
		
		
		
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
