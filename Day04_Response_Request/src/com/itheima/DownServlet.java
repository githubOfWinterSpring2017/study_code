package com.itheima;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * ʵ���ļ�����
 * @author Administrator
 *
 */
public class DownServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//��������ļ������ص����⣺
		//����ͷ����Ӧͷֻ����Ӣ�ģ����ܳ�������������ͷ����Ӧͷ��,�������Ӧͷ�г��������ĵĻ���û���������ĵ��������ˣ���ʱ����Ů.jpg�ͱ����.jpg
		//Ϊ�˽��������⣬��Ҫʹ��URL���뷽ʽ��ascii��û�е��ַ�ʹ��ascii�����е��ַ���ʾ
		//��������������ж�����Ӧͷ�Ľ�����ʹ��utf-8�ķ�ʽ�����������ʹ��utf-8�ķ�ʽ��
		response.setHeader("Content-Disposition", "attachment;filename="+URLEncoder.encode("��Ů.jgp","utf-8"));		
		InputStream in = new FileInputStream(this.getServletContext().getRealPath("1.png"));
		OutputStream out = response.getOutputStream();
		byte[] bytes = new byte[1024];
		int i=0;
		while((i=in.read(bytes)) != -1){
			out.write(bytes, 0, i);
		}
		in.close();
		//response�еõ���������Ҫ�Լ��ֶ��Ĺر�
	}
	
	public static void main(String[] args) throws UnsupportedEncodingException {
		//��Java��֧��URL����ͽ��룬һ�µ����������Ƚ�һ�������ַ���ʹ��URL���б��룬Ȼ��ʹ��URL���뽫����������½��������
		String str = "�й�";
		String str2 = URLEncoder.encode(str, "utf-8");
		System.out.println(str2);
		String str3 = URLDecoder.decode(str2, "utf-8");
		System.out.println(str3);

	}
	
	

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
