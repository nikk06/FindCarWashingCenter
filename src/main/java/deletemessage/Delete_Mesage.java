package deletemessage;

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

import org.apache.catalina.connector.Response;

/**
 * Servlet implementation class Delete_Mesage
 */
@WebServlet("/Delete_Mesage")
public class Delete_Mesage extends HttpServlet {
	String s;
	Connection ccn;
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Delete_Mesage() {
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
		s=request.getParameter("Mes");
		PrintWriter outt=response.getWriter();
		outt.print(s);
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			ccn=DriverManager.getConnection("jdbc:mysql://localhost:3306/findcarwashing","root","Nitin@123321@@");
			PreparedStatement SP =ccn.prepareStatement("delete from  ackno where UserKey=?");
			SP.setString(1,s);
			int i=SP.executeUpdate();
			if(i>0)
			{
				response.sendRedirect("Delete_Mesage");
			     outt.print("message delete succefuly");
			}
			else 
			{
				response.sendRedirect("ackno.jsp");
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
