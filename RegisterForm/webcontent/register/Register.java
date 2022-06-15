package register;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/Register")
public class Register extends HttpServlet {
	public void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException, ServletException {
		String name=request.getParameter("uname");
		String id=request.getParameter("uid");
		String age=request.getParameter("age");
		String email=request.getParameter("mail");
		
		Member member=new Member();
		member.setUname(name);
		member.setUid(id);
		member.setAge(age);
		member.setMail(email);
		
		RegisterDao.insert(member);
		
		response.sendRedirect("register.jsp");
		
		
	}
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd=request.getRequestDispatcher("/WEB-INF/register.jsp");
		rd.forward(request, response);
	}

}
