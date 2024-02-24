<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<title>Update</title>
	<link rel="stylesheet" type="text/css" href="update.css">
<link href="https://fonts.googleapis.com/css2?family=Jost:wght@500&display=swap" rel="stylesheet">
</head>
<body>
	<div class="main">  	
		<input type="checkbox" id="chk" aria-hidden="true">

			<div class="signerror">
				<form>
				    <img src="update.png"class="image">
				</form>
			</div>

			<div class="login">
				<form action="Center_Login" method="post">
					<label for="chk" aria-hidden="true">Sign_In</label>
					<input type="email" name="CenterLogin" placeholder="Email" required="">
					<input type="password" name="CenterPassLog" placeholder="Password" required="">
					<button>Sign_In Again</button>
				</form>
			</div>
	</div>
</body>
</html>