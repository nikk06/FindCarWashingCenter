package centerservies;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class center_services
 */
@WebServlet("/center_services")
public class center_services extends HttpServlet {
	String n,n1,n2,n3,n4;
	Connection co;
	int i;
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public center_services() {
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
		n=request.getParameter("cenAd");
		n1=request.getParameter("cenNm");
		n2=request.getParameter("censerv");
		n3=request.getParameter("cenpri");
		n4=request.getParameter("cenky");
		PrintWriter p=response.getWriter();
		p.println(n);
		p.println(n1);
		p.println(n2);
		p.println(n3);
		p.print(n4);
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			co=DriverManager.getConnection("jdbc:mysql://localhost:3306/findcarwashing","root","Nitin@123321@@");
			PreparedStatement ssp=co.prepareStatement("Insert into centerrdata values(?,?,?,?,?)");
			ssp.setString(1, n);
			ssp.setString(2, n1);
			ssp.setString(3, n2);
			ssp.setString(4, n3);
			ssp.setString(5, n4);
			 i=ssp.executeUpdate();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		if(i==1)
		{
			response.sendRedirect("service_added.jsp");
		}
		else 
		{
			response.sendRedirect("Sign_In_Fail.jsp");
		}
		
	}

}
