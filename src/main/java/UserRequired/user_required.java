package UserRequired;

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

import usercenterkey.user_centerkey;


/**
 * Servlet implementation class user_required
 */
@WebServlet("/user_required")
public class user_required extends HttpServlet {
	Connection cd;
	int i;
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public user_required() {
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
		//user_centerkey obj=new user_centerkey();
		String s,s1,s2,s3,s4;
		PrintWriter outt=response.getWriter();
		s=request.getParameter("Uname");
		s1=request.getParameter("Umb");
		s2=request.getParameter("Uitem");
		s3=request.getParameter("centke");
		s4=request.getParameter("custkey");
		outt.print(s);
		outt.print(s1);
		outt.print(s2);
		try 
		{
		Class.forName("com.mysql.jdbc.Driver");
		cd=DriverManager.getConnection("jdbc:mysql://localhost:3306/findcarwashing","root","Nitin@123321@@");
	    PreparedStatement cp=cd.prepareStatement("Insert into customerrequired values(?,?,?,?,?)");
	     cp.setString(1,s);
	     cp.setString(2,s1);
		 cp.setString(3,s2);
		 cp.setString(4,s3);
		 cp.setString(5,s4);
		 i=cp.executeUpdate();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		if(i==1)
		{
			response.sendRedirect("user_centerkey");
		}
		else 
		{
			response.sendRedirect("centerlogin.jsp");
		}
		outt.print(cd);
	}

}
