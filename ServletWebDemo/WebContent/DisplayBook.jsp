<jsp:useBean id="book" class="JSP.Book" scope="session"/>
Book Num : <jsp:getProperty name="book" property="bno"/><br>
Book Name : <jsp:getProperty name="book" property="bname"/><br>
Book Price : <jsp:getProperty name="book" property="price"/>