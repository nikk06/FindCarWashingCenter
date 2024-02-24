<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<!-- Created By CodingNepal -->
<html lang="en" dir="ltr">
    <head>
        <meta charset="utf-8" />
        <!-- Somehow I got an error, so I comment the title, just uncomment to show -->
        <!-- <title>Popup Login Form Design | CodingNepal</title> -->
        <link rel="stylesheet" href="user_centerkey.css" />
        <script src="https://kit.fontawesome.com/a076d05399.js"></script>
    </head>
    <body>
        <div class="center">

            <input type="checkbox" id="show" />
            <label for="show" class="show-btn">Add Services</label>
            <div class="container">
                <label
                    for="show"
                    class="close-btn fas fa-times"
                    title="close"
                ></label>
                <div class="text">Add Your Shop Services</div>
                <form action="center_services" method="post">
                    <div class="data">
                        <label>Enter your full address</label>
                        <input type="text"  name="cenAd"/>
                    </div>
                    
                    <div class="data">
                        <label>Enter your shop name once again</label>
                        <input type="text"  name="cenNm"/>
                    </div>
                    <div class="data">
                        <label>Enter service name like(Car detailing..)</label>
                        <input type="text" required name="censerv"/>
                    </div>
                    <div class="data">
                        <label>Enter service price</label>
                        <input type="text" required name="cenpri"/>
                    </div>
                    
                    
                    <div class="data">
                        <label>Enter your key once again</label>
                        <input type="password" required name="cenky"/>
                    </div>
                    <div class="btn">
                        <div class="inner"></div>
                        <button type="submit">ADD</button>
                    </div>
                </form>
                
                <form action="requests_user" method="post">
                <div class="data">
                        <h2><label>Enter your key for see requests</label></h2>
                       <input type="password" required name="centky"/>
                    </div>
                <div class="btn">
                        <div class="inner"></div>
                        <button type="submit">See Requests</button>
                    </div>
                </form>
            </div>
        </div>
    </body>
</html>