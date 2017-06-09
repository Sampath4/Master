package com.struts2;
import java.sql.*;
public class Database {
 static Connection con;
 public static Connection getConnection() throws Exception 
 {
	 Class.forName("com.mysql.jdbc.Driver");
	 con=DriverManager.getConnection("jdbc:mysql://localhost:3306/apple","root", "RAJsam49");
	 return con;
 
 }
}
