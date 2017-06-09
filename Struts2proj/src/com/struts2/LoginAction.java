package com.struts2;
import java.sql.*;
public class LoginAction {
	private String Username;
	private String Password;
	public String getUsername() {
		return Username;
	}
	public void setUsername(String username) {
		Username = username;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	
	
public String execute() throws Exception
{
	Connection con = Database.getConnection();
	PreparedStatement st= con.prepareStatement("select * from user where username='"+Username+"' and Password='"+Password+"' ");
	ResultSet rs = st.executeQuery();
	if(rs.next())
	{
		return "success";
	}
		else 
			return "failure";
	}
}
		


