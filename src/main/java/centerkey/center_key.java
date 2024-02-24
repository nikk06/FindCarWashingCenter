package centerkey;

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
 * Servlet implementation class center_key
 */
@WebServlet("/center_key")
public class center_key extends HttpServlet {
	public String n;
     Connection cc;
     ResultSet sd;
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public center_key() {
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
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		n=request.getParameter("centkey");
		PrintWriter p=response.getWriter();
		p.print(n);
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			cc=DriverManager.getConnection("jdbc:mysql://localhost:3306/findcarwashing","root","Nitin@123321@@");
			PreparedStatement sp=cc.prepareStatement("Select * from centerdata where CenterKey=?");
			sp.setString(1, n);
			sd=sp.executeQuery();
			if(sd.next())
			{
				try 
				{
					Thread.sleep(3000);
					response.sendRedirect("centerservices.jsp");
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
			}
			else 
			{
				response.sendRedirect("userblock.jsp");
			}	
			}
		catch (Exception e) {
			e.printStackTrace();
		}
		p.print(cc);
	}

}
