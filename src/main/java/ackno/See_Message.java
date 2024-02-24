package ackno;

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
 * Servlet implementation class See_Message
 */
@WebServlet("/See_Message")
public class See_Message extends HttpServlet {
	String s;
	Connection Cn;
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public See_Message() {
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
		s=request.getParameter("cust_key");
		PrintWriter outt=response.getWriter();
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			Cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/findcarwashing","root","Nitin@123321@@");
			PreparedStatement Ps=Cn.prepareStatement("Select * from ackno where UserKey=?");
			Ps.setString(1,s);
		   outt.print("<html>");
		   outt.print("<head>");
		   outt.print("<title>");
		   outt.print("See Messages");
		   outt.print("</title>");
		   
		   outt.print("<style type=\"text/css\">\r\n"
			   		+ "    \r\n"
			   		+ ".glow-on-hover1 {\r\n"
			   		+ "    width: 220px;\r\n"
			   		+ "    height: 50px;\r\n"
			   		+ "    border: none;\r\n"
			   		+ "    font-size: 1em;\r\n"
                   + "    font-weight: bold;\r\n"
			   		+ "    outline: none;\r\n"
			   		+ "    color: #fff;\r\n"
			   		+ "    background: #000000;\r\n"
			   		+ "    cursor: pointer;\r\n"
			   		+ "    position: relative;\r\n"
			   		+ "    z-index: 0;\r\n"
			   		+ "    border-radius: 10px;\r\n"
			   		+ "    margin-left: 650px;\r\n"
			   		+ "    margin-top: 5px;\r\n"
			   		+ "}\r\n"
			   		+ "\r\n"
			   		
			   		+ ".glow-on-hover1:hover {\r\n"
			   		+ "    background: #FF0000;\r\n"
			   		+ "}\r\n"
			   		+ "</style>");
		   
		   outt.print("</head>");
		   outt.print("</body>");
			outt.print("<table width=75% border=1 align=center> ");
            outt.print("<caption><h1><u>Message By Center</u></h1></caption>"); 
	   ResultSet i=Ps.executeQuery();
	   java.sql.ResultSetMetaData rsmd=i.getMetaData();//for column count
	    int totalColumn=rsmd.getColumnCount();//counting a column
	    outt.print("<tr bgcolor=yellow>");
	    for(int j=1;j<=totalColumn;j++)
	    {
	    	outt.print("<th>"+rsmd.getColumnName(j)+"</th>");
	    }
	    while(i.next())
	    {
	    	outt.print("<tr bgcolor=#DAECEA ><td>"+i.getString(1)+"</td>  <td>"+i.getString(2)+"</td></tr>");
	    }
	    outt.print("</table>");
	    
	    outt.print("<form action=\"Delete_Mesage\" method=\"post\">");
	    outt.print("<input type=\"text\" required placeholder=\"Enter Your_Key\"name=\"Mes\" style=\"height:40px;font-size:14pt; width:220px; border-radius:5px; margin-left: 650px; margin-top: 40px\"></input>");
	    outt.print("<br>");
	    outt.print("<input class=\"glow-on-hover1\" value=\"Delete Customer !\"type=\"submit\"></button>");
	    outt.print("</form>");
	    
	    outt.print("</body>");
	    outt.print("</html>");
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		//outt.print(Cn);
	}

}
