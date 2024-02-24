package centerlogin;

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
 * Servlet implementation class Center_Login
 */
@WebServlet("/Center_Login")
public class Center_Login extends HttpServlet {
	String n,n1;
	Connection con=null;
	ResultSet i;
	private static final long serialVersionUID = 1L;
       
    
    public Center_Login() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}
	
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter p=response.getWriter();
		n=request.getParameter("CenterLogin");
		n1=request.getParameter("CenterPassLog");
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/findcarwashing","root","Nitin@123321@@");
			PreparedStatement ps=con.prepareStatement("Select * from centersignup where  Email=? and Password=?");
			ps.setString(1, n);
			ps.setString(2, n1);
			 i=ps.executeQuery();
			 if(i.next())
			 {
				 response.sendRedirect("Center_Block.jsp");
			 }
			 else 
			 {
				 response.sendRedirect("Sign_In_Fail.jsp");
			 }
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
