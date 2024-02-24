package userlogin;

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
 * Servlet implementation class user_Login
 */
@WebServlet("/user_Login")
public class user_Login extends HttpServlet {
	Connection con;
	String n,n1;
	ResultSet i;
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public user_Login() {
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
		doGet(request, response);
		PrintWriter p =response.getWriter();
		n=request.getParameter("UserLogin");
		n1=request.getParameter("UserPassLog");
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/findcarwashing","root","Nitin@123321@@");
			PreparedStatement ps=con.prepareStatement("Select * from usersignup where  Email=? and Password=?");
			ps.setString(1, n);
			ps.setString(2, n1);
			 i=ps.executeQuery();
			 if(i.next())
			 {
				 response.sendRedirect("userblock.jsp");
			 }
			 else 
			 {
				 response.sendRedirect("Sign_In_Fail1.jsp");
			 }
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		p.println(con);
	}

}
