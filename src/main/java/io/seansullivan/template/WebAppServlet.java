package io.seansullivan.template;


import com.google.appengine.api.users.UserService;
import com.google.appengine.api.users.UserServiceFactory;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.log4j.Logger;


/**
 * Servlet for web appliction.
 *
 * @author Sean Sullivan (sean@seansullivan.io)
 */
@SuppressWarnings("serial")
public class WebAppServlet extends HttpServlet {

  public static final Logger log = Logger.getLogger(WebAppServlet.class);

  @Override
  public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {

    UserService userService = UserServiceFactory.getUserService();
    String userEmail = userService.getCurrentUser().getEmail();

    PrintWriter out = resp.getWriter();
    out.println("<html>");
    out.println("<body>");
    out.println("<h1>Web Application</h1>");
    out.println("<hr/><p/>");
    
    out.println("</body>");
    out.println("</html>");
  }

}

