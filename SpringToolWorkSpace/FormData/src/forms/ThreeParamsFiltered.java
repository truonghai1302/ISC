package forms;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;
import coreservlets.*;

@WebServlet("/three-params-filtered")
public class ThreeParamsFiltered extends HttpServlet {
  @Override
  public void doGet(HttpServletRequest request,
                    HttpServletResponse response)
      throws ServletException, IOException {
    response.setContentType("text/html");
    PrintWriter out = response.getWriter();
    String title = "Reading Three Request Parameters";
    String docType =
      "<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.0 " +
      "Transitional//EN\">\n";
    out.println
      (docType +
       "<HTML>\n" +
       "<HEAD><TITLE>" + title + "</TITLE></HEAD>\n" +
       "<BODY BGCOLOR=\"#FDF5E6\">\n" +
       "<H1 ALIGN=\"CENTER\">" + title + "</H1>\n" +
       "<UL>\n" +
       "  <LI><B>param1</B>: "
       + ServletUtilities.filter(request.getParameter("param1")) + "\n" +
       "  <LI><B>param2</B>: "
       + ServletUtilities.filter(request.getParameter("param2")) + "\n" +
       "  <LI><B>param3</B>: "
       + ServletUtilities.filter(request.getParameter("param3")) + "\n" +
       "</UL>\n" +
       "</BODY></HTML>");
  }
}
