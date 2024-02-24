package Userpackage;

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
 * Servlet implementation class center_signup
 */
@WebServlet("/center_signup")
public class user_signup extends HttpServlet {
	String n,n1,n2,n3;
	Connection con;
	int i;
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public user_signup() {
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
		n=request.getParameter("UserName");
		n1=request.getParameter("UserMno");
		n2=request.getParameter("UserEmail");
		n3=request.getParameter("UserPassword");
		p.println(n+"\n"+n1+"\n"+n2+"\n"+n3);
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/findcarwashing","root","Nitin@123321@@");
			PreparedStatement ps=con.prepareStatement("Insert into usersignup values(?,?,?,?)");
			ps.setString(1, n);
			ps.setString(2, n1);
			ps.setString(3, n2);
			ps.setString(4, n3);
			i=ps.executeUpdate();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		if(i==1)
		{
			response.sendRedirect("index.jsp");
		}
		else 
		{
			response.sendRedirect("Sign_In_Fail.jsp");
		}
	}

}
