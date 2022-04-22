<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://code.jquery.com/jquery-3.6.0.js" integrity="sha256-H+K7U5CnXl1h5ywQfKtSj8PCmoN9aaq30gDh27Xc0jk=" crossorigin="anonymous"></script>
<link rel="stylesheet" href="/TerribleCode/loginDe.css">
</head>
<body>

<form action="userRegForm" method="post">

					
<h4>E-mail</h4>
<input type="text" name="user_id" id="user_id" placeholder="Email">
            
<h4>Password</h4>
<input type="password" name="user_pw" id="user_pw" placeholder="Password">
                
<h4>RePassword</h4>
<input type="password" name="re_user_pw" id="re_user_pw" placeholder="RePassword">
                
<br> <br>
            
<input type="button" value = "idCheck" id ="idCheckBtn">
<input type="submit" value="submit">
<input type="button" id="homeBtn" value="home">
           
           
</form>
	

<script type="text/javascript" src="js/Myjs.js"></script>

</body>
</html>