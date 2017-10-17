package ch07;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")

public class Login extends HttpServlet{
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
		throws ServletException, IOException {
			LoginBean2 login = new LoginBean2();
			String address;
			login.setUserid(request.getParameter("userid"));
			login.setPasswd(request.getParameter("passwd"));
			if(!login.checkUser()){
				address = "/ch07/login_fail.jsp";
				login.setError("Invalid userid/password");
				request.setAttribute("invaliduser", login);
			} else {
				address = "/ch07/login_success.jsp";
				request.setAttribute("validuser", login);
			}
			RequestDispatcher dispatcher = request.getRequestDispatcher(address);
			dispatcher.forward(request, response);
		}	
}