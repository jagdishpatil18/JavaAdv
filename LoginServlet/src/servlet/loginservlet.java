package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class loginservlet extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
     
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		PrintWriter printWriter=response.getWriter();
//		printWriter.println("<h1>"+message+"</h1>");
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		PrintWriter printWriter=response.getWriter();
//		printWriter.println("<h1>"+message+"</h1>");
		printWriter.println("Hello");
		
		String emailid=request.getParameter("email");
		String passwd=request.getParameter("password");
		printWriter.write(emailid+"   "+passwd);
		
//		ServletConfig config=getServletConfig();
//		String driver=config.getInitParameter("driver");
//		printWriter.println(driver);
	
	
	}
    public void destroy()
    {
    	
    }
}
