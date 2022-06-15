package register;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class RegisterDao {

	public static String insert(Member member) {
		String url="jdbc:mysql://localhost:3306/company";
		String username="root";
		String password="Pradeep@17";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection(url,username,password);
			
			String q="insert into employees(uname,uid,age,mail) values(?,?,?,?)";
			
			PreparedStatement ps=con.prepareStatement(q);
			
			ps.setString(1, member.getUname());
			ps.setString(2, member.getUid());
			ps.setString(3, member.getAge());
			ps.setString(4, member.getMail());
			
			ps.executeUpdate();
		
			System.out.println("successful..");
		}catch(Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
