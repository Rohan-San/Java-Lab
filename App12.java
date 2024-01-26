// index.html
<html>
<head> <title> SESSION LOGIN </title> </head>
<body>
	<center>
	<form action="http://localhost:8080/Proj3/Ses1.jsp" method="get">
		Enter Name: <input type="text" name="uname"> <br>
		<input type="submit" value="LOGIN" name="register">
	</form>
	</center>
</body>
</html>

// Ses1.jsp
<%@page language="java" import="java.util.*" errorPage=""%>
<form method="get" action="http://localhost:8080/Proj3/Ses2.jsp">
<% Date d=new Date(); %>
<p align="right"> 
  Time; <%=d.getTime()%>
</p>
<%
String un=request.getParameter("uname"); 
session.setAttribute("user",un);
session.setAttribute("time",d.getTime());
%>
Hello <%=un%>
<br><br>
<input type="submit" value="logout">
</form>

// Ses2.jsp
<%@page language="java" import="java.util.*" errorPage=""%>
<%
Date d2 = new Date();
String un = (String)session.getAttribute("user");
Long t1 = (Long)session.getAttribute("time");
Long t2 = d2.getTime();
%>
Thank you <%=un%>
<br><br>
Session duration: <%=(t2-t1)/(60*60)%> seconds
<% session.invalidate();%>
