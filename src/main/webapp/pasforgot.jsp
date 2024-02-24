<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="style2.css">
<link href="https://fonts.googleapis.com/css2?family=Jost:wght@500&display=swap" rel="stylesheet">
</head>
<body>
       <form action="passforgot" method="post">
       <div class="login-wrap">
	<div class="login-html">
		<input id="tab-1" type="radio" name="tab" class="sign-in" checked><label for="tab-1" class="tab">Forgot</label>
		<input id="tab-2" type="radio" name="tab" class="sign-up"><label for="tab-2" class="tab"></label>
		<div class="login-form">
			<div class="sign-in-htm">
				<div class="group">
					<label for="user" class="label">Email</label>
					<input id="user" type="Email" class="input" name="fgtemail" required="required">
				</div>
				<div class="group">
					<label for="pass" class="label">New Password(only 15 value allowed)</label>
					<input id="pass" type="password" class="input" name="fgtpass" required="required">
				</div>
				<div class="group">
					<input type="submit" class="button" value="Update">
				</div>
			</div>
			</div>
		</div>
	</div>
       </form>
</body>
</html>