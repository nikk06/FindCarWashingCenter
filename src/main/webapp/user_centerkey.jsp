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
            <label for="show" class="show-btn">Insert key</label>
            <div class="container">
                <label
                    for="show"
                    class="close-btn fas fa-times"
                    title="close"
                ></label>
                <div class="text">Insert Center's Key</div>
                <form action="user_centerkey" method="post">
                    <div class="data">
                        <label>Input key Here</label>
                        <input type="password" required name="centerkey"/>
                    </div>
                    <div class="btn">
                        <div class="inner"></div>
                        <button type="submit">Submit</button>
                    </div>
                </form>
            </div>
        </div>
    </body>
</html>