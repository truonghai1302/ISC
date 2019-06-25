package coreservlets;
import java.io.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/show-params")
public class ShowParams extends HttpServlet {
	@Override
	  public void doGet(HttpServletRequest request,
	                    HttpServletResponse response)
	      throws ServletException, IOException {
	    response.setContentType("text/html");
	    PrintWriter out = response.getWriter();
	    String title = "Reading two Request Parameters";
	    String result = checkLogin(request);
	    String docType =
	      "<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.0 " +
	      "Transitional//EN\">\n";
	    out.println(docType +
	                "<HTML>\n" +
	                "<HEAD><TITLE>" + title + "</TITLE></HEAD>\n" +
	                "<BODY BGCOLOR=\"#E9FAFF\">\n" +
	                "<H1 ALIGN=\"CENTER\">" + title + "</H1>\n" +
	                "<UL>\n" +
	                "<LI><B>Email</B>: "
	                + request.getParameter("email") + "\n" +
	                "<LI><B>Password</B>: "
	                + request.getParameter("pass") + "\n" +
	                "</UL>\n" +
	                "<H1 ALIGN=\"CENTER\">" + 	result	+ "</H1>"+
	                "</BODY></HTML>");
	  }
	
	public String checkLogin(HttpServletRequest request) {
		String result = "Login fail !!!!! Email or Password incorrect. please check again.";
		if((request.getParameter("email").toLowerCase().equals("admin@gmail.com") && 
				request.getParameter("pass").toLowerCase().equals("admin")) || 
				(request.getParameter("email").toLowerCase().equals("hai@gmail.com") && 
						request.getParameter("pass").toLowerCase().equals("hai"))) {
			result = "Login successful.";
		}
		return result;
	}
	
}
