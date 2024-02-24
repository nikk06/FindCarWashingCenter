package forgotpassword;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class passforgot
 */
@WebServlet("/passforgot")
public class passforgot extends HttpServlet 
{
	Connection con;
	String n,n1;
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public passforgot() {
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
		PrintWriter pp =response.getWriter();
		n=request.getParameter("fgtpass");
		n1=request.getParameter("fgtemail");
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/findcarwashing","root","Nitin@123321@@");
			 String query = "UPDATE centersignup SET Password=? WHERE Email=?;";
			 PreparedStatement p=con.prepareStatement(query);
			 p.setString(1,n);
			 p.setString(2,n1);
			 int rows=p.executeUpdate();
			 if(rows>0)
			 {
                      response.sendRedirect("updtsucces.jsp");
			 }
			 else 
			 {
				 response.sendRedirect("notupdt.jsp");
			 }
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}