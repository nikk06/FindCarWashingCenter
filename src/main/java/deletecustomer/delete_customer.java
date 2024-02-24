package deletecustomer;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class delete_customer
 */
@WebServlet("/delete_customer")
public class delete_customer extends HttpServlet {
	String s;
	Connection ccn;
    ResultSet RS;
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public delete_customer() {
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
		// TODO Auto-generated method stub
		//doGet(request, response);
		PrintWriter p=response.getWriter();
		s=request.getParameter("Del");
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			ccn=DriverManager.getConnection("jdbc:mysql://localhost:3306/findcarwashing","root","Nitin@123321@@");
			PreparedStatement SP =ccn.prepareStatement("delete from customerrequired where CustomerKey=?");
			SP.setString(1,s);
			int i=SP.executeUpdate();
			if(i>0)
			{
				response.sendRedirect("requests_user");
			}
			else 
			{
				response.sendRedirect("centerservices.jsp");
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		p.print("hello form delete");
	}

}
