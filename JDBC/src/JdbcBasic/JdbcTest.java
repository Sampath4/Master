package JdbcBasic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import com.mysql.jdbc.ResultSet;

public class JdbcTest {

	public static void main(String[] args) {
//		try{
//		 Class.forName("com.mysql.jdbc.Driver");
//	 Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/JDBC", "root", "RAJsam49");
//	 Statement st = con.createStatement();
//	 st.execute ( "create table Demo1(User_Name varchar(10), City varchar(10), Number integer(5))");
//	 st.executeUpdate("insert Demo1 values ('SAM', 'CHICAGO', 10 )");
//	 
//		 System.out.println("Sucess");
//		
//		
//		 }
//		 catch(Exception e ){
//		System.out.println(e);
//		 }
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/JDBC", "root", "RAJsam49");
			Statement st = con.createStatement();
//			st.execute("create table Family(User_Name varchar(10), Head varchar(10), List integer(10))");
			st.executeUpdate("insert Family values('BARAJI', 'GNREDDY', 4)");
			ResultSet rs = (ResultSet) st.executeQuery("select * from Family");
			while(rs.next()){
				System.out.println(rs.getString("User_Name")+" "+ rs.getString("Head")+" "+ rs.getInt("List"));
			}
			System.out.println("Sucess");
			st.close();
			con.close();
		}
		catch(Exception e){
		System.out.println(e);
		}
		}
		

	}

  
