<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>result jsp</h1>
	<%
		List<String> list = (List) request.getAttribute("styles");
		Iterator iterator = list.iterator();
		while (iterator.hasNext()) {
			out.print("<br>" + iterator.next());
		}
	%>
</body>
</html>