package zensar;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("testing");
	String user =	request.getParameter("uname");
	String password =	request.getParameter("password");
	if(user.equals("zensar")&& password.equals("zensar")){
	response.getWriter().print("<h2>Authentication sussess<h2>");
	}else {
		response.getWriter().print("<h2>Authentication failed<h2>");
	}
	}

}
