package logApp.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class LoginDao {
	
	String url="jdbc:mysql://localhost:3306/login";
	String username="root";
	String password="Pradeep@17";
	
	String query="select * from details where uname=? and pass=?";
	
	public boolean check(String uname,String pass) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection(url,username,password);
			
			PreparedStatement ps=con.prepareStatement(query);
			ps.setString(1, uname);
			ps.setString(2, pass);
			
			ResultSet rs=ps.executeQuery();
			
			if(rs.next()) {
				return true;
			}
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
		return false;
	}

}
