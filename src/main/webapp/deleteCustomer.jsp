<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.sql.*"%>
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta charset="ISO-8859-1">
<meta name="viewport"
	content="width=device-width, initial-scale=1, maximum-scale=1" />
<meta name="description" content="" />
<meta name="author" content="" />
<title>Delete Customer</title>
<link href="assets/css/bootstrap.css" rel="stylesheet" />
<!-- FONT AWESOME STYLE  -->
<link href="assets/css/font-awesome.css" rel="stylesheet" />
<!-- DATATABLE STYLE  -->
<link href="assets/js/dataTables/dataTables.bootstrap.css"
	rel="stylesheet" />
<!-- CUSTOM STYLE  -->
<link href="assets/css/style.css" rel="stylesheet" />
<!-- GOOGLE FONT -->
<link href='http://fonts.googleapis.com/css?family=Open+Sans'
	rel='stylesheet' type='text/css' />
	<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
</head>
<body>

	<div class="content-wrapper">
		<div class="container">
			<div class="row pad-botm">
				<div class="col-md-12">
					<h4 class="header-line">Manage Users</h4>
				</div>
			</div>
			<div class="row">
				<div class="col-md-12">
					<%
						String userInformation = (String) session.getAttribute("success");
					if (userInformation != null) {
						session.removeAttribute("success");
					%>
					<div class="alert alert-success" id="success">User info
						update succesfully.</div>
					<%
						}
					%>
					<%
						String deleteUser = (String) session.getAttribute("delete");
					if (deleteUser != null) {
						session.removeAttribute("delete");
					%>
					<div class="alert alert-success" id="success">User deleted
						succesfully.</div>
					<%
						}
					%>
					<!-- Advanced Tables -->
					<div class="panel panel-default">
						<div class="panel-heading">Manage Users</div>
						<div class="panel-body">
							<div class="table-responsive">
								<table class="table table-striped table-bordered table-hover"
									id="dataTables-example">
									<thead>
										<tr>
											<th>Customer Name</th>
											<th>Customer Mno</th>
											<th>Required Item</th>
											<th>Center Key</th>
											<th>Action</th>
										</tr>
									</thead>
									<tbody>
										<%
											try {
											//ResultSet resultset = DatabaseConnection.getResultFromSqlQuery("select * from client_details");
											Class.forName("com.mysql.jdbc.Driver");
			                               Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/findcarwashing","root","Nitin@123321@@");
			                               PreparedStatement sp=cn.prepareStatement("Select * from customerrequired");
			                               ResultSet resultset=sp.executeQuery();
											while (resultset.next()) {
										%>
										<tr class="odd gradeX">
											<td><%=resultset.getString(1)%></td>
											<td><%=resultset.getString(2)%></td>
											<td><%=resultset.getString(3)%></td>
											<td><%=resultset.getString(4)%></td>
											<td class="center">
											 <a href="deleteCustomer.jsp?del=<%=resultset.getString(1)%>"
													onclick="return confirm('Are you sure you want to delete?');"" >
														<button class="btn btn-danger">
															<i class="fa fa-pencil"></i> Delete
														</button></td>
										</tr>
										<%
											}
										} catch (Exception e) {
											e.printStackTrace();
										}
										%>
									</tbody>
								</table>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	<!-- JAVASCRIPT FILES PLACED AT THE BOTTOM TO REDUCE THE LOADING TIME  -->
	<!-- CORE JQUERY  -->
	<script src="assets/js/jquery-1.10.2.js"></script>
	<!-- BOOTSTRAP SCRIPTS  -->
	<script src="assets/js/bootstrap.js"></script>
	<!-- DATATABLE SCRIPTS  -->
	<script src="assets/js/dataTables/jquery.dataTables.js"></script>
	<script src="assets/js/dataTables/dataTables.bootstrap.js"></script>
	<!-- CUSTOM SCRIPTS  -->
	<script src="assets/js/custom.js"></script>
	<script>
		(function(i, s, o, g, r, a, m) {
			i['GoogleAnalyticsObject'] = r;
			i[r] = i[r] || function() {
				(i[r].q = i[r].q || []).push(arguments)
			}, i[r].l = 1 * new Date();
			a = s.createElement(o), m = s.getElementsByTagName(o)[0];
			a.async = 1;
			a.src = g;
			m.parentNode.insertBefore(a, m)
		})
				(
						window,
						document,
						'script',
						'../../../../../../www.google-analytics.com/analytics.js',
						'ga');

		ga('create', 'UA-58127580-1', 'auto');
		ga('send', 'pageview');
	</script>
</body>
<script src="http://code.jquery.com/jquery-1.10.1.min.js"></script>
<script type="text/javascript">
	$(function() {
		$('#success').delay(3000).show().fadeOut('slow');
	});
</script>
</html>