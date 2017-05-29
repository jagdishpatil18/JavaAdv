package com.bridgelab.loginjsp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/Prelogin")
public class Prelogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		response.setContentType("text/html");
		PrintWriter printWriter=response.getWriter();
//		response.getWriter().append("Served at: ").append(request.getContextPath());
	    request.getRequestDispatcher("Newlogin.jsp").forward(request, response);
//		response.sendRedirect("Login.jsp");
	}

	

}
