package sendacno;

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
 * Servlet implementation class Send_Acknowledgement
 */
@WebServlet("/Send_Acknowledgement")
public class Send_Acknowledgement extends HttpServlet {
	Connection ccn;
	int i;
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Send_Acknowledgement() {
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
		String s="We well accept your requirement,if you want to talk with us ,just call us aur message us(from Center)";
		String s1=request.getParameter("SendAk");
		//p.print("hello from acnnoo");
		//p.print(s1);
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			ccn=DriverManager.getConnection("jdbc:mysql://localhost:3306/findcarwashing","root","Nitin@123321@@");
			PreparedStatement PS=ccn.prepareStatement("Insert into ackno values(?,?)");
			PS.setString(1,s1);
			PS.setString(2,s);
		     i=PS.executeUpdate();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		if(i==1)
		{
			response.sendRedirect("requests_user");
		}
		else 
		{
			response.sendRedirect("centerservices.jsp");
		}
		p.print(ccn);
	}

}
