<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<title>Not Update</title>
	<link rel="stylesheet" type="text/css" href="update.css">
<link href="https://fonts.googleapis.com/css2?family=Jost:wght@500&display=swap" rel="stylesheet">
<style type="text/css">
.link{
  color: white;
  background: black;
}
.color1{
color: red;
}
.link:hover {
	color: blue;
}
</style>
</head>
<body>
	<div class="main">  	
		<input type="checkbox" id="chk" aria-hidden="true">

			<div class="signerror">
				<form>
				    <h2 class="color1"><i>Your Password is not updated succsfully,because of your email id is wrong and it is not in our database,kindly please check your 
				    email and try to update once again</i></h2>
				    <br>
				    <a href="pasforgot.jsp" class="link">Click here for update once again</a>
				</form>
			</div>
</body>
</html>