<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<!-- Created By CodingLab - www.codinglabweb.com -->
<html lang="en" dir="ltr">
  <head>
    <meta charset="UTF-8">
    <title>User block</title>
    <link rel="stylesheet" href="userblock.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.2/css/all.min.css"/>
     <meta name="viewport" content="width=device-width, initial-scale=1.0">
  </head>
  <body >
    <div class="container">
      <form action="user_searchh" method="post">
        <div class="title">Search Washing and Service Center</div>
        <div class="input-box underline">
          <input type="text" placeholder="Enter Your Current State" required name="userState">
          <div class="underline"></div>
        </div>
        <div class="input-box">
          <input type="text" placeholder="Enter Your Current City" required name="userCity">
          <div class="underline"></div>
        </div>
        <div class="input-box button">
          <input type="submit" name="" value="Continue">
        </div>
        </form>
    </div>
  </body>
</html>