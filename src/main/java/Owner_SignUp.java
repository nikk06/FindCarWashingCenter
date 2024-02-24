

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

@WebServlet("/Owner_SignUp")
public class Owner_SignUp extends HttpServlet {
	String n,n1,n2,n3,n4;
	int i;
	Connection con;
	private static final long serialVersionUID = 1L;
    public Owner_SignUp() {
        super();
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		n=request.getParameter("OwnerName");
		n1=request.getParameter("OwnerMno");
		n2=request.getParameter("OwnerAddress");
		n3=request.getParameter("OwnerEmail");
		n4=request.getParameter("Password");
		PrintWriter p=response.getWriter();
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/findcarwashing","root","Nitin@123321@@");
			PreparedStatement ps=con.prepareStatement("Insert into centersignup values(?,?,?,?,?)");
			ps.setString(1, n);
			ps.setString(2, n2);
			ps.setString(3, n3);
			ps.setString(4, n1);
			ps.setString(5, n4);
			i=ps.executeUpdate();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		if(i==1)
		{
			response.sendRedirect("signupsucess.jsp");
		}
		else 
		{
			response.sendRedirect("signupfailed.jsp");
		}
	}

}
