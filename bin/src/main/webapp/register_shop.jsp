<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<!-- Created By CodingLab - www.codinglabweb.com -->
<html lang="en" dir="ltr">
  <head>
    <meta charset="UTF-8">
    <title> Register Your Center </title>
    <link rel="stylesheet" href="register_shop.css">
     <meta name="viewport" content="width=device-width, initial-scale=1.0">
   </head>
<body>
  <div class="container">
    <div class="title">Center_Registration</div>
    <div class="content">
      <form action="register_shop" method="post" enctype="multipart/form-data">
        <div class="user-details">
          <div class="input-box">
            <span class="details">Center Full Name</span>
            <input type="text" placeholder="Enter Center Name" required name="Cent_Name">
          </div>
          <div class="input-box">
            <span class="details">Center Owner Name</span>
            <input type="text" placeholder="Enter your name" required name="centown_Name">
          </div>
          <div class="input-box">
            <span class="details">State</span>
            <input type="text" placeholder="Enter your State" required name="cent_State">
          </div>
          <div class="input-box">
            <span class="details">City</span>
            <input type="text" placeholder="Enter your city" required name="cent_City">
          </div>
          <div class="input-box">
            <span class="details">Pin Code</span>
            <input type="number" placeholder="Enter your Pincode" required name="cent_Pincode">
          </div>
          <div class="input-box">
            <span class="details">Center Type(Washing/Both-washing and Service)</span>
            <input type="text" placeholder="Type"required name="cent_Type">
          </div>
          
          <div class="input-box">
            <span class="details">Phone Number</span>
            <input type="number" placeholder="Phno"required name="cent_Pn">
          </div>
          
           <div class="input-box">
            <span class="details">Create Your Unique Key,which helps you after registration(only digit allowed)</span>
            <input type="number" placeholder="Enter Your Key" required name="cent_Key">
          </div>
          
           <div class="input-box">
            <span class="details">Your Link</span>
            <a href="index.jsp" name="cent_Img"></a>
          </div>
        </div>
        <div class="button">
          <input type="submit" value="Register">
        </div>
      </form>
    </div>
  </div>

</body>
</html>