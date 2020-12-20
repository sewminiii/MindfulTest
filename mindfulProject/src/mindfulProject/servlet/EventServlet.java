package mindfulProject.servlet;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mindfulProject.dao.EventDao;
import mindfulProject.model.Events;

/**
 * Servlet implementation class EventServlet
 */
@WebServlet("/events")
public class EventServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EventServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 int eventID = Integer.parseInt(request.getParameter("id"));
	        EventDao dao = new EventDao();
	         
	        try {
	            List<Events> event = dao.getEvents();
	             
	            request.setAttribute("event", event);
	             
	            String page = "events.jsp";
	            RequestDispatcher requestDispatcher = request.getRequestDispatcher(page);
	            requestDispatcher.forward(request, response);              
	        } catch (SQLException ex) {
	            throw new ServletException(ex);
	        } catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
	}

	
}
