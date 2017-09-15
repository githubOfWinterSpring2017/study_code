<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<base href="<%=basePath%>">

		<title>My JSP 'BookList.jsp' starting page</title>

		<meta http-equiv="pragma" content="no-cache">
		<meta http-equiv="cache-control" content="no-cache">
		<meta http-equiv="expires" content="0">
		<%@ page import="com.cqut.edn.cookies.Book"%>
		<%@ page import="java.util.Map"%>
		<%@ page import="com.cqut.edn.cookies.BookList"%>

	</head>

	<body>
		<%
			response.setContentType("text/html;charset=UTF-8");

			BookList bookList = BookList.getInstance();
			Map<String, Book> bookMaps = bookList.getBooks();
			Book book = null;
			
			for (String dd : bookMaps.keySet()) {
				book = bookMaps.get(dd);
				
		%><!-- 使用尖括号加上%可以将指定的文本输入到.html文件中，然后将这个HTML文件传送到浏览器中，浏览器解析这个HTML文件并展示出来，于是就形成了这个过程 -->
		<a  href="servlet/ServletBookDetail?id=<%=dd %>" > <%=book.getName() %>
		</a>
		</br>
		<%
			}
		%>



	</body>
</html>
