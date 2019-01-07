package servlet;

import java.io.IOException;
import java.net.URL;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import action.CheckUser;
import bean.UserBean;

//@WebServlet(urlPatterns = {"/Servlet1"})
public class Servlet1 extends HttpServlet
{
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{

		doPost(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		int userId = -1;
		String passWord = "";
		UserBean user = null;

		userId = Integer.parseInt(request.getParameter("userId"));
		passWord = request.getParameter("passWord");

		CheckUser checkuser = new CheckUser(userId, passWord);

		URL url = new URL(request.getHeader("Referer"));
		user = checkuser.getUser();

		if (url.getPath().equals("/index.jsp") && checkuser.isFlag())
		{
			HttpSession session = request.getSession();
			session.setAttribute("lastpage", url);
			session.setAttribute("user", user);
			response.sendRedirect("mainpage.jsp");
		}

	}

}
