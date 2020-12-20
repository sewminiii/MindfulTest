package mindfulProject.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import mindfulProject.dao.EventDao;
import mindfulProject.dao.LoginDao;
import mindfulProject.model.Events;

/**
 * Servlet implementation class loginServlet
 */
@WebServlet("/login")
public class loginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private LoginDao loginDao = new LoginDao();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public loginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String email = request.getParameter("email");
		String pwd = request.getParameter("password");
		
		try {
	
			if(loginDao.check(email, pwd)) {
				HttpSession session = request.getSession();
				session.setAttribute("email",email);
				
				//EventDao dao = new EventDao();
		         
		        try {
		          
		            RequestDispatcher requestDispatcher = request.getRequestDispatcher("events.jsp");
		            requestDispatcher.forward(request, response);   
		        }catch(Exception e) {
					e.printStackTrace();
				}
		      
				
			}else {
				String msg = "Invalid email or password";
				request.setAttribute("msg", msg);
				response.sendRedirect("login.jsp");
			}
		
	
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
