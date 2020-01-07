package com.dlnu.F5;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sun.xml.internal.bind.v2.runtime.Name;


@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
 

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String username = request.getParameter("username");
		System.out.println("´æÔÚsessionÖÐµÄ :"+username);
		request.getSession().setAttribute("username", username);
		
		response.sendRedirect("chat.jsp");
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
