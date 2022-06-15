package logApp.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class RegisterDao {
	String url="jdbc:mysql://localhost:3306/login";
	String username="root";
	String password="Pradeep@17";
	
	String q="insert into details(uname,pass) values(?,?)";
	
	public String insert(String uname,String pass) {
		String result="Data entered successfully..";
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection(url,username,password);
		PreparedStatement ps=con.prepareStatement(q);
		
		ps.setString(1, uname);
		ps.setString(2, pass);
	}catch(Exception e) {
		e.printStackTrace();
		result="Data not entered!";
	  }
	return result;
	}
}
