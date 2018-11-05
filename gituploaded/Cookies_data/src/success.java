import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class success extends HttpServlet
{

	public void doGet(HttpServletRequest request,HttpServletResponse response)
	throws ServletException,IOException
	{
		
	
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		Cookie[] ck=request.getCookies();
		
		out.println("welccome ::"+ck[0].getValue());
	}

}
