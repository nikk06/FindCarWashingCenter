package registershop;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@MultipartConfig
@WebServlet("/register_shop")
public class register_shop extends HttpServlet {
	String n1,n2,n3,n4,n5,n6,n7,n8,n9;
	int  i;
	Connection con;
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public register_shop() {
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
		PrintWriter p=response.getWriter();
		n1=request.getParameter("Cent_Name");
		n2=request.getParameter("centown_Name");
		n3=request.getParameter("cent_State");
		n4=request.getParameter("cent_City");
		n5=request.getParameter("cent_Pincode");
		n6=request.getParameter("cent_Type");
		n7=request.getParameter("cent_Pn");
		n8=request.getParameter("cent_Key");
		n9=request.getParameter("cent_Img");
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/findcarwashing","root","Nitin@123321@@");
			PreparedStatement s=con.prepareStatement("Insert into centerdata values(?,?,?,?,?,?,?,?,?)");
			s.setString(1,n1);
			s.setString(2, n2);
			s.setString(3, n3);
			s.setString(4, n4);
			s.setString(5, n5);
			s.setString(6, n6);
			s.setString(7, n7);
			s.setString(8, n8);
			s.setString(9, n9);
		    i=s.executeUpdate();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		if(i==1)
		{
			response.sendRedirect("RegisterSuccess.jsp");
		}
		else 
		{
			response.sendRedirect("NotRegister.jsp");
		}
	}
}
