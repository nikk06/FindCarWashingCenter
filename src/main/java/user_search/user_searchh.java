package user_search;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class user_searchh
 */
@WebServlet("/user_searchh")
public class user_searchh extends HttpServlet {
	Connection conn;
	String n,n1;
	String imgFile=null;
	ResultSet i;
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public user_searchh() {
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
		n=request.getParameter("userState");
		n1=request.getParameter("userCity");
		PrintWriter out=response.getWriter();
		//p.print(n+"\n"+n1);
		try 
		{
		Class.forName("com.mysql.jdbc.Driver");
		conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/findcarwashing","root","Nitin@123321@@");
		PreparedStatement s=conn.prepareStatement("Select * from centerdata where  State=? and City=?");
		s.setString(1, n);
	    s.setString(2, n1);
	    out.print("<html>");
		out.print("<head>");
		out.print("<link rel=\"stylesheet\" href=\"new.css\">");
	    out.print("<title>");
	    out.print("Customer Requirements");
	    out.print("</title>");
	    out.print("</head>");
		out.print("<body>");
        out.print("<table width=75% border=1 align=center> ");
        out.print("<caption><h1><u>Centers</u></h1></caption>");
             
             
	    i=s.executeQuery();
	   java.sql.ResultSetMetaData rsmd=i.getMetaData();//for column count
	    int totalColumn=rsmd.getColumnCount();//counting a column
	    out.print("<tr bgcolor=yellow>");
	    for(int j=1;j<=totalColumn;j++)
	    {
	    	out.print("<th>"+rsmd.getColumnName(j)+"</th>");
	    }
	    while(i.next())
	    {
	    	out.print("<tr bgcolor=#DAECEA ><td><i>"+i.getString(1)+"</i></td> <td><i>"+i.getString(2)+"</i></td> <td><i>"+i.getString(3)+"</i></td> <td><i>"+i.getString(4)+"</i></td>  <td><i>"+i.getString(5)+"</i></td> <td><i>"+i.getString(6)+"</i></td>  <td><i>"+i.getString(7)+"</i></td>  <td><i>"+i.getString(8)+"</i></td><td bgcolor=#CCE0F3><a href=user_centerkey.jsp>Click Here</a></td></tr>");
	    }
	    out.print("</table>");
	    out.print("</body>");
	    out.print("</html>");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
