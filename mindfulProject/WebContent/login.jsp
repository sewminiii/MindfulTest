<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="ISO-8859-1">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
	<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
	<script src="https://use.fontawesome.com/releases/v5.0.8/js/all.js"></script>
	<link href="style.css" rel="stylesheet">
<title>User Login</title>
</head>
<body style="background-image: url('img/bg2.png'); background-repeat: no-repeat;">
<header class="masthead">
  <div class="container-fluid">
  <div class="row no-gutter">
    
    <div class="col-sm-9 col-md-7 col-lg-5 mx-auto">
    <div class="login d-flex align-items-center py-5">
          <div class="container">
          <div class="row">   
              <p class="col-md-9 col-lg-8 mx-auto text-cente"></p>
              <div class="col-md-9 col-lg-8 mx-auto text-center">
             
               <h3 class="login-heading mb-4 text-light ">Welcome User!</h3>
                
              <form action="<%=request.getContextPath()%>/login" method="post" >

                <div class="form-label-group">
                  <input type="text" id="txtEmail" class="form-control" placeholder="Email" name="email"  required autofocus>
                  <label for="inputUsername"></label>
                </div><br>

                <div class="form-label-group">
                  <input type="password" id="inputPassword" class="form-control" placeholder="Password" name="password" required> 
                  <label for="inputPassword"></label>
                </div>

                <br>

                <button class="btn btn-lg btn-primary btn-block btn-login text-uppercase font-weight-bold mb-2" type="submit" onclick="checkEmail()" >Login</button>
                <div class="text-center">
                  <a class="small" href="#" onclick="myFunction()">Forgot password?</a></div>
              </form>
            </div>
          </div>
        </div>
      </div>
    </div>
  </div>
</div>
</header>
<!-- if the user forgot the password the alert will be display in the screen -->
<script>
function myFunction() {
  alert("Please contact the admin to reset your password. Have a nice day!");
}

function checkEmail() {

    var email = document.getElementById('txtEmail');
    var filter = /^([a-zA-Z0-9_\.\-])+\@(([a-zA-Z0-9\-])+\.)+([a-zA-Z0-9]{2,4})+$/;

    if (!filter.test(email.value)) {
    alert('Please provide a valid email address');
    email.focus;
    return false;
 	}
}

</script>

</body>
</html>