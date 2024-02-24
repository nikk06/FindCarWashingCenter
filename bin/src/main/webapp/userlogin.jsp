<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<!-- Created By CodingLab - www.codinglabweb.com -->
<html lang="en" dir="ltr">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
     <title>Login Form </title> 
    <link rel="stylesheet" href="style1.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.2/css/all.min.css"/>
  </head>
  <body>
    <div class="container">
      <div class="wrapper">
        <div class="title"><span>User Sign_In</span></div>
        <form action="user_Login" method="post">
          <div class="row">
            <i class="fas fa-user"></i>
            <input type="Email" placeholder="Email" required name="UserLogin">
          </div>
          <div class="row">
            <i class="fas fa-lock"></i>
            <input type="password" placeholder="Password" required name="UserPassLog">
          </div>
          <div class="row button">
            <input type="submit" value="Sign_In">
          </div>
        </form>
      </div>
    </div>

  </body>
</html>