package com.itheima;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Demo01Servlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//1��ʹ���ֽ����������
		//����Http����Ӧͷ��Content-Type����֪ͨ������ʹ��utf-8������
		/*response.setHeader("Content-Type", "text/html;charset=utf-8");		
		//�����ֽڷ�ʽ������ݣ��������õı���Ϊutf-8
		response.getOutputStream().write("�����й���".getBytes("utf-8"));		
		*/
		//2��ʹ���ַ����������
		//ָ�����������������²�ѯ�����
		//response.setCharacterEncoding("utf-8");		
		//response.setHeader("Content-Type", "text/html;charset=utf-8");//����ʹ��response.setContentType("text/html;charset=utf-8");�����������������
		//��Ϊ�������ĵײ�ʹ���������䣬����Ϊ���ô������ͨ���׶���һ�㻹������ϵ�һ����룬ʹ�õĸ�ʽ���£�
		
		response.setContentType("text/html;charset=utf-8");
		response.setCharacterEncoding("utf-8");
		response.getWriter().write("�����й���");
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
 
		doGet(request, response);
	}

}
