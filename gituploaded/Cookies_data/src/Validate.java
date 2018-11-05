import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Validate extends HttpServlet
{

	public void doPost(HttpServletRequest request,HttpServletResponse response)
	throws ServletException,IOException
	{
		
		
		String name=request.getParameter("name");
		
		String pwd=request.getParameter("pwd");
		
		if(pwd.equals("apple"))
		{


			
			Cookie ck=new Cookie("username",name);
			
			
			response.addCookie(ck);
			
			response.sendRedirect("success");
			
		}}}
