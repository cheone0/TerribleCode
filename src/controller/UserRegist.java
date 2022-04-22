package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.UserDAO;

/**
 * Servlet implementation class UserRegist
 */
@WebServlet("/userRegForm")
public class UserRegist extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String user_id = request.getParameter("user_id");
		String user_pw = request.getParameter("user_pw");
		
		System.out.println(user_id + user_pw);
		
		UserDAO dao = new UserDAO();
		dao.userInsert(user_id, user_pw);
		
		
	}

}
