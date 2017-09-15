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
 * 实现文件下载
 * @author Administrator
 *
 */
public class DownServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//解决中文文件名下载的问题：
		//请求头和相应头只能是英文，不能出现中文在请求头和相应头中,如果在相应头中出现了中文的话，没法传送中文到服务器端，此时的美女.jpg就变成了.jpg
		//为了解决这个问题，需要使用URL编码方式将ascii中没有的字符使用ascii中已有的字符表示
		//，由于在浏览器中对于相应头的解码是使用utf-8的方式，因此在这里使用utf-8的方式。
		response.setHeader("Content-Disposition", "attachment;filename="+URLEncoder.encode("美女.jgp","utf-8"));		
		InputStream in = new FileInputStream(this.getServletContext().getRealPath("1.png"));
		OutputStream out = response.getOutputStream();
		byte[] bytes = new byte[1024];
		int i=0;
		while((i=in.read(bytes)) != -1){
			out.write(bytes, 0, i);
		}
		in.close();
		//response中得到的流不需要自己手动的关闭
	}
	
	public static void main(String[] args) throws UnsupportedEncodingException {
		//在Java中支持URL编码和解码，一下的例子是首先讲一个中文字符串使用URL进行编码，然后使用URL解码将这个数据重新解码成中文
		String str = "中国";
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
