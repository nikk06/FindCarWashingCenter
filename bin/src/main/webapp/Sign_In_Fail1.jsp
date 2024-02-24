<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<title>SignInerror</title>
	<link rel="stylesheet" type="text/css" href="fail.css">
<link href="https://fonts.googleapis.com/css2?family=Jost:wght@500&display=swap" rel="stylesheet">
</head>
<body>
	<div class="main">  	
		<input type="checkbox" id="chk" aria-hidden="true">

			<div class="signerror">
				<form>
				    <H2><i>Error Occour While Login,Your Email_Id Or Password id is Not Matching With Our Database,Kindly Please Check And Sign In Again</i></H2>
				    <br>
				    <img src="loginerror.png"class="image">
				</form>
			</div>

			<div class="login">
				<form action="user_Login" method="post">
					<label for="chk" aria-hidden="true">Sign_In</label>
					<input type="email" name="UserLogin" placeholder="Email" required="">
					<input type="password" name="UserPassLog" placeholder="Password" required="">
					<button>Sign_In Again</button>
				</form>
			</div>
	</div>
</body>
</html>