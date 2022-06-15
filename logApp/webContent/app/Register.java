package app;

import java.io.IOException;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import logApp.dao.RegisterDao;


public class Register extends HttpServlet {
	
	public void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException {
		String uname=request.getParameter("uname");
		String pass=request.getParameter("pass");
		
		RegisterDao rd=new RegisterDao();
		String result=rd.insert(uname, pass);
		response.getWriter().print(result);
	}

}
