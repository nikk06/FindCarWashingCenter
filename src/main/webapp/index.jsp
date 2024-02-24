<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <title>Car Washing and Service Center Near You</title>
 
    <link rel="preconnect" href="https://fonts.gstatic.com">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css">
    <link href="https://fonts.googleapis.com/css2?family=Poppins:wght@300;500;600&display=swap" rel="stylesheet">
    <!--Stylesheet-->
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <style media="screen">
      *,
*:before,
*:after{
    padding: 0;
    margin: 0;
    box-sizing: border-box;
}
body{
    background-color: #080710;
}
.background{
    width: 430px;
    height: 520px;
    position: absolute;
    transform: translate(-50%,-50%);
    left: 50%;
    top: 50%;
}
.background .shape{
    height: 200px;
    width: 200px;
    position: absolute;
    border-radius: 50%;
}
.shape:first-child{
    background: linear-gradient(
        #1845ad,
        #23a2f6
    );
    left: -80px;
    top: -80px;
}
.shape:last-child{
    background: linear-gradient(
        to right,
        #ff512f,
        #f09819
    );
    right: -30px;
    bottom: -80px;
}
form{
    height: 520px;
    width: 400px;
    background-color: rgba(255,255,255,0.13);
    position: absolute;
    transform: translate(-50%,-50%);
    top: 50%;
    left: 50%;
    border-radius: 10px;
    backdrop-filter: blur(10px);
    border: 2px solid rgba(255,255,255,0.1);
    box-shadow: 0 0 40px rgba(8,7,16,0.6);
    padding: 50px 35px;
}
form *{
    font-family: 'Poppins',sans-serif;
    color: #ffffff;
    letter-spacing: 0.5px;
    outline: none;
    border: none;
}
form h3{
    font-size: 32px;
    font-weight: 500;
    line-height: 42px;
    text-align: center;
}

label{
    display: block;
    margin-top: 30px;
    font-size: 16px;
    font-weight: 500;
}

.center
{
    margin-left: 15px;
            font-family: 'century gothic';
            color: #ffffcc;
            text-shadow: 0 0 5px #fff,
                0 0 10px #fff,
                0 0 20px blue,
                0 0 30px blue,
                0 0 40px blue,
                0 0 55px blue,
                0 0 70px blue;
}




.link {
    margin-left: 17px;
        font-size: 20px;
        color: #ffffff;
        text-align: center;
        -webkit-animation: glow 1.3s ease-in-out infinite alternate;
        -moz-animation: glow 1.3s ease-in-out infinite alternate;
        animation: glow 1.3s ease-in-out infinite alternate;
      }
      @-webkit-keyframes glow {
        from {
          text-shadow: 0 0 10px #eeeeee, 0 0 20px #000000, 0 0 30px #000000, 0 0 40px #000000, 
                       0 0 50px #9554b3, 0 0 60px #9554b3, 0 0 70px #9554b3;
        }
        to {
          text-shadow: 0 0 5px #eeeeee, 0 0 5px #ff4da6, 0 0 5px #ff4da6, 0 0 5px #ff4da6,
                       0 0 5px #ff4da6, 0 0 5px #ff4da6, 0 0 5px #ff4da6;
        }
      }

        .link:hover
        {
           color: skyblue;
        }    

       .linkcolor {
        font-size: 20px;
        color:#D5F5E3;
        text-align: center;
        -webkit-animation: glow 1.3s ease-in-out infinite alternate;
        -moz-animation: glow 1.3s ease-in-out infinite alternate;
        animation: glow 1.3s ease-in-out infinite alternate;
      }
      @-webkit-keyframes glow {
        from {
          text-shadow: 0 0 10px #eeeeee, 0 0 20px #000000, 0 0 30px #000000, 0 0 40px #000000, 
                       0 0 50px #9554b3, 0 0 60px #9554b3, 0 0 70px #9554b3;
        }
        to {
          text-shadow: 0 0 5px #eeeeee, 0 0 5px #ff4da6, 0 0 5px #ff4da6, 0 0 5px #ff4da6,
                       0 0 5px #ff4da6, 0 0 5px #ff4da6, 0 0 5px #ff4da6;
        }
      }

     
         .linkcolor:hover 
         {
             color: skyblue;
         }

       .or 
       {
        margin-left: 140px;
        color: red;
       }
    </style>
</head>
<body>
    <div class="background">
        <div class="shape"></div>
        <div class="shape"></div>
    </div>
    <form>
        <h3>Welcome Once Again</h3>
        <br><br> 
        
          <b><h3 class="center">Center</h3></b><br>
      <a href="centersignup.jsp" class="link">Sign_Up</a>&nbsp&nbsp_______________&nbsp&nbsp&nbsp<a href="centerlogin.jsp"class="linkcolor">Sign_In</a>
      <br><br><br>


    <h1 class="or" >OR</h1><br><br>



    <b><h3 class="center">User</h3></b><br>
      <a href="usersignup.jsp" class="link">Sign_Up</a>&nbsp&nbsp_______________&nbsp&nbsp&nbsp<a href="userlogin.jsp"class="linkcolor">Sign_In</a>

    </form>
</body>
</html>
    