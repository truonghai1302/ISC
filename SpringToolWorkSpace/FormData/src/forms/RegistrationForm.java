package forms;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;

@WebServlet("/registration-form")
public class RegistrationForm extends HttpServlet {
  @Override
  public void doGet(HttpServletRequest request,
                    HttpServletResponse response)
      throws ServletException, IOException {
    String firstName = replaceNull(request.getParameter("firstName"));
    String firstNamePrompt =
      prompt(request.getParameter("firstName"),
             "First Name:",
             "You must enter a First Name:");
    String lastName = replaceNull(request.getParameter("lastName"));
    String lastNamePrompt =
      prompt(request.getParameter("lastName"),
             "Last Name:",
             "You must enter a Last Name:");
    String emailAddress = replaceNull(request.getParameter("emailAddress"));
    String emailAddressPrompt =
      prompt(request.getParameter("emailAddress"),
             "Email Address:",
             "You must enter an Email Address:");
    response.setContentType("text/html");
    PrintWriter out = response.getWriter();
    String title = "Registration Form";
    String docType =
      "<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.0 " +
      "Transitional//EN\">\n";
    out.println
      (docType +
       "<HTML>\n" +
       "<HEAD><TITLE>" + title + "</TITLE></HEAD>\n" +
       "<BODY BGCOLOR=\"#FDF5E6\">\n" +
       "<H1 ALIGN=\"CENTER\">" + title + "</H1>\n" +
       "<FORM ACTION=\"registration-results\">\n" +
       firstNamePrompt +
       " <INPUT TYPE=\"TEXT\" NAME=\"firstName\" VALUE=\"" + firstName +
       "\"><BR>\n" +
       lastNamePrompt +
       " <INPUT TYPE=\"TEXT\" NAME=\"lastName\" VALUE=\"" + lastName +
       "\"><BR>\n" +
       emailAddressPrompt +
       " <INPUT TYPE=\"TEXT\" NAME=\"emailAddress\" VALUE=\"" + emailAddress +
       "\"><BR>\n" +
       "<CENTER><INPUT TYPE=\"SUBMIT\" VALUE=\"Register\">" +
       "</CENTER>\n</FORM>\n" +
       "</BODY></HTML>");
  }

  /** If parameter is null (i.e., this is original form, not redisplayed
      form) or is present (i.e., supplied by user the last time), give
      normal prompt. If parameter is empty, give prompt about missing value.
  */

  private String prompt(String param, String regularMessage,
                        String warningMessage) {
    if ((param != null) && param.trim().equals("")) {
      return("<B><FONT COLOR=RED>" + warningMessage + "</FONT></B>");
    } else {
      return(regularMessage);
    }
  }

  /** Replace null with empty String. Return anything else unchanged. */

  private String replaceNull(String val) {
    if(val == null) {
      return("");
    } else {
      return(val);
    }
  }
}
