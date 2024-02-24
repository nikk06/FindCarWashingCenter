package usercenterkey;

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
 * Servlet implementation class user_centerkey
 */
@WebServlet("/user_centerkey")
public class user_centerkey extends HttpServlet {
	public String n;
	Connection cn;
	ResultSet rss;
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public user_centerkey() {
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
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		n=request.getParameter("centerkey");
		PrintWriter outt=response.getWriter();
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/findcarwashing","root","Nitin@123321@@");
			PreparedStatement sp=cn.prepareStatement("Select * from centerrdata where yourgeneratedkey=?");
			sp.setString(1, n);
			rss=sp.executeQuery();
			outt.print("<html>");
			outt.print("<head>");
			outt.print("<link rel=\"stylesheet\" href=\"new.css\">");
		    outt.print("<title>");
		    outt.print("Center Services");
		    outt.print("</title>");
		    outt.print("</head>");
			outt.print("<body>");
			outt.print("<br>");
			outt.print("<button class=\"\"\r\n"
					+ "    onclick=\"window.location.href = 'ackno.jsp';\" style=\"height:40px; border-radius:11px; font-size:14pt; background-color:green; color:white;\"> \r\n"
					+ "        See Messages \r\n"
					+ "</button> ");
			outt.print("<table width=75% border=1 align=center> ");
            outt.print("<caption><h1 class=col>Center Services<h1></caption>");
            rss=sp.executeQuery();
     	   java.sql.ResultSetMetaData rsmd=sp.getMetaData();
     	  int totalColumn=rsmd.getColumnCount();
     	 outt.print("<tr bgcolor=yellow>");
     	 for(int j=1;j<=totalColumn;j++)
 	    {
 	    	outt.print("<th>"+rsmd.getColumnName(j)+"</th>");
 	    }
     	 while(rss.next())
     	 {
     		outt.print("<tr bgcolor=#DAECEA ><h3><td>"+rss.getString(1)+"</td> <td>"+rss.getString(2)+"</td> <td>"+rss.getString(3)+"</td> <td>"+rss.getString(4)+"</td>  <td>"+rss.getString(5)+"</td></h3></tr>");
     	 }
     	outt.print("</table>");
     	
     	outt.print("<br>");
     	outt.print("&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;<div class=\"container\">");
     	outt.print(" &emsp;&emsp;<form action=\"user_required\" method=\"post\">");
     	outt.print("<div class=\"title\"><h1><u>Add Your Required Services</h1></u></div>");
     	outt.print("<div>");
     	outt.print("<input type=\"text\" placeholder=\"Enter Your Name\" required name=\"Uname\" style=\"height:40px;font-size:14pt; width:245px; border-radius:5px;\">");
     	outt.print("</div>");
     	outt.print("<br>");
     	outt.print("<br>");
     	outt.print(" <div class=\"input-box\">");
     	outt.print("<input type=\"number\" placeholder=\"Enter Your Mobile no\" required name=\"Umb\" class=\"width\" style=\"height:40px;font-size:14pt; width:245px ;border-radius:5px;\">");
     	outt.print("<div class=\"underline\"></div>");
     	outt.print("</div>");
     	outt.print("<br>");
     	outt.print("<br>");
   
     	outt.print(" <div class=\"input-box\">");
     	outt.print("<input type=\"text\" placeholder=\"Enter Your Required Service\" required name=\"Uitem\" style=\"height:40px;font-size:14pt; width:245px; border-radius:5px;\">");
     	outt.print("<div class=\"underline\"></div>");
     	outt.print("</div>");
     	outt.print("<br>");
     	outt.print("<br>");
     	
     	outt.print(" <div class=\"input-box\">");
     	outt.print("<input type=\"text\" placeholder=\"Enter your unique key\" required name=\"custkey\" style=\"height:40px;font-size:14pt; width:245px; border-radius:5px;\">");
     	outt.print("<div class=\"underline\"></div>");
     	outt.print("</div>");
     	outt.print("<br>");
     	outt.print("<br>");
     	outt.print(" <div class=\"input-box\">");
     	outt.print("<input type=\"text\" placeholder=\"Enter center Key\" required name=\"centke\" style=\"height:40px;font-size:14pt; width:245px; border-radius:5px;\">");
     	outt.print("<div class=\"underline\"></div>");
     	outt.print("</div>");
     	outt.print("<br>");
     	outt.print("<div class=\"input-box button\">");
     	outt.print("<input type=\"submit\" name=\"\" value=\"Add Request\" style=\"height:40px; border-radius:11px; font-size:14pt; background-color:black; color:white;\">");
     	outt.print(" </div>");
     	outt.print("</form>");
     	outt.print("</div>");
     	outt.print("</body>");
     	outt.print("</html>");
     	}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}
