<%
String bgcolor= request.getParameter("bgcolor");
if(bgcolor== null|| bgcolor .trim().equals(""))
	bgcolor="white";
	%>
		
	<body bgcolor=<%=bgcolor%>>
	Welcome To Your Color World <%= bgcolor%>
	</body>