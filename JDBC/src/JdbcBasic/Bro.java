package JdbcBasic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import com.mysql.jdbc.ResultSet;

public class Bro {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/JDBC", "root", "RAJsam49");
			Statement st = con.createStatement();
//			st.execute("create table Bro(Bro_Name varchar(10), Bro_Number integer(10), city varchar(10))");
            st.executeUpdate("insert Bro values('RAJU', '2179', 'USA') , ('SAM', '21790', 'USA'), ('MOM', '21797', 'USA')" );
			ResultSet rs = (ResultSet) st.executeQuery("Select * from Bro");
			while(rs.next()){
				System.out.println(rs.getString("Bro_Name")+" "+rs.getInt("Bro_Number")+""+rs.getString("city"));
			}
					System.out.println("Sucess");
					st.close();
			con.close();
		}
		catch(Exception e ){
			System.out.println(e);
			
		}
		 
		}

	}


