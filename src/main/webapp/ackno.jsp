<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<!-- Created By CodingNepal -->
<html lang="en" dir="ltr">
   <head>
      <meta charset="utf-8">
      <title>Messages...</title>
      <link rel="stylesheet" href="style3.css">
   </head>
   <body>
      <div class="wrapper">
         <div class="title">
            See Messages
         </div>
         <form action="See_Message" method="post">
            <div class="field">
               <input type="text" required name="cust_key">
               <label>Enter Your Key</label>
            </div>
            <div class="field">
               <input type="submit" value="Check Message">
            </div>
         </form>
      </div>
   </body>
</html>