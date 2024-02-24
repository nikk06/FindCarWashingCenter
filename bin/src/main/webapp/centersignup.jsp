<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<!-- Coding By CodingNepal - codingnepalweb.com -->
<html lang="en" dir="ltr">
  <head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Sign_Up</title> 
    <link rel="stylesheet" href="style.css">
   </head>
<body>
  <div class="wrapper">
    <h2>Center Sign_Up</h2>
    <form action="Owner_SignUp" method="post">
      <div class="input-box">
        <input type="text" placeholder="Enter your name" required name="OwnerName">
      </div>
       <div class="input-box">
        <input type="number" placeholder="Enter Mobile Mo" required name="OwnerMno">
      </div>
      <div class="input-box">
        <input type="text" placeholder="Enter your Shop Address" required name="OwnerAddress">
      </div>
      <div class="input-box">
        <input type="text" placeholder="Enter your email" required name="OwnerEmail">
      </div>
      <div class="input-box">
        <input type="password" placeholder="Create password" required name="Password">
      </div>
      <div class="input-box button">
        <input type="Submit" value="Sign_Up Now">
      </div>
    </form>
  </div>
</body>
</html>