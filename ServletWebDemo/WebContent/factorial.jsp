<%!
int fact(int n) 
{
		int f = 1;
		for (int i = n; i > n; i--)
			f = f * i;
		return f;
	}
%>
<%
	int n = Integer.parseInt(request.getParameter("num"));
%>
Factorial: <%= fact(n) %>
